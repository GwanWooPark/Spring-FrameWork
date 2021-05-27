package com.file.updown;

import com.file.updown.util.FileValidator;
import com.file.updown.util.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@Controller
public class homeController {

    @Autowired
    private FileValidator fileValidator;

    @RequestMapping("form")
    public String uploadForm() {
        return "upload";
    }

    @RequestMapping("upload")
    public String fileUpload(HttpServletRequest request, Model model, @ModelAttribute("uploadFile") UploadFile uploadFile, BindingResult result) {
        // @ModelAttribute는 multipart/form-data 형태의 HTTP Body 내용과 HTTP 파라미터들을 1대1로 객체에 바인딩
        // 만약 Setter함수가 없다면 매핑을 시키지 못하고, null 값

        fileValidator.validate(uploadFile, result);

        // BindingResult : errors의 하위 인터페이스로서 폼 값을 커맨드 객체에 바인딩한 결과를 저장하고 에러코드로 메세지를 가져온다.
        // error가 존재한다면 form:error path로 가게된다.
        if (result.hasErrors()) {
            return "upload";
        }

        // form에서 보내진 파일을 받는다
        // MultipartFile 이라는 인터페이스를 이용해서, HTTP multipart 요청을 처리
        MultipartFile file = uploadFile.getMpfile();
        // 파일이름
        String name = file.getOriginalFilename();
        // 받아온 파일의 이름, 부연설명 set
        UploadFile fileObj = new UploadFile();
        fileObj.setName(name);
        fileObj.setDesc(uploadFile.getDesc());

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            // 파일의 내용을 읽는다.
            inputStream = file.getInputStream();
            // 파일의 경로를 설정
            // 웹 어플리케이션내(서비스가 돌아가는 서버)에서 주어진 실제 경로를 반환
            String path = WebUtils.getRealPath(request.getSession().getServletContext(), "/resources/storage");
            System.out.println("실제 업로드될 경로 : " + path);

            // 폴더가 존재하지 않으면 만들고 아님 말고
            File storage = new File(path);
            if (!storage.exists()) {
                storage.mkdirs();
            }
            // path안에 name이라는 빈 파일 생성
            File newFile = new File(path + "/" + name);
            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            // 빈 파일에 읽어온 내용을 쓴다
            // FileOutputStream은 이미지 데이터와 같은 원시 바이트 스트림을 작성하기위한 메소드
            // 문자 스트림을 작성하려면 FileWriter를 사용하는 것이 좋다
            outputStream = new FileOutputStream(newFile);
            int read = 0;
            byte[] b = new byte[(int) file.getSize()];

            // 데이터를 읽고 쓴다.
            while ((read = inputStream.read(b)) != -1) {
                //b[off]부터 read의 길이만큼 쓴다.
                outputStream.write(b, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 담아서 보낸다.
        model.addAttribute("fileObj", fileObj);

        return "download";
    }

    @RequestMapping("download")
    @ResponseBody
    public byte[] fileDownload(HttpServletRequest request, HttpServletResponse response, String name) {

        byte[] down = null;

        try {
            // path 설정
            String path = WebUtils.getRealPath(request.getSession().getServletContext(), "/resources/storage");
            // path안에 있는 name을 가진 파일 선택
            File file = new File(path + "/" + name);

            // 파일 및 스트림 복사를 위한 메서드
            // 메개변수로 주어진 file의 내용을 byte 배열로 복사
            down = FileCopyUtils.copyToByteArray(file);

            // 받아오는 파일이름 한글 깨짐 방지
            String filename = new String(file.getName().getBytes(), "8859_1");

            // 브라우저에 Content가 어떤 표시로 설정될지 결정
            // inline : Web Page로, 혹은 Web Page 내에서 표시(기본 값)
            // attachment : 로컬에 다운로드 & 저장, 안의 속성 filename : 파일 이름을 설정할 수 있다.
            response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
            // 다운로드될 파일의 크기 지정
            response.setContentLength(down.length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return down;
    }
}
