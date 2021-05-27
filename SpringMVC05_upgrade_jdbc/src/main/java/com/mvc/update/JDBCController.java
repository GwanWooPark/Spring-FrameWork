package com.mvc.update;

import com.mvc.update.model.biz.JDBCBiz;
import com.mvc.update.model.dto.JDBCDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JDBCController {

    @Autowired
    JDBCBiz biz;

    @RequestMapping("list.do")
    public String selectList(Model model) {

        model.addAttribute("list", biz.selectList());
        return "JDBCList";
    }

    @RequestMapping("select.do")
    public String selectOne(Model model, int seq) {

        model.addAttribute("dto", biz.selectOne(seq));
        return "JDBCSelect";
    }

    @RequestMapping("insertForm.do")
    public String insertForm() {
        return "JDBCInsert";
    }

    @RequestMapping("insertRes.do")
    public String insertRes(JDBCDto dto) {

        if (biz.insert(dto) > 0) {
            return "redirect:list.do";
        }
        return "redirect:insertForm.do";
    }

    @RequestMapping("updateForm.do")
    public String updateForm(Model model, int seq) {

        model.addAttribute("dto", biz.selectOne(seq));
        return "JDBCUpdate";
    }

    @RequestMapping("updateRes.do")
    public String updateRes(JDBCDto dto) {

        if (biz.update(dto) > 0) {
            return "redirect:select.do?seq=" + dto.getSeq();
        }
        return "redirect:updateForm.do?seq=" + dto.getSeq();
    }

    @RequestMapping("delete.do")
    public String delete(int seq) {

        if (biz.delete(seq) > 0) {
            return "redirect:list.do";
        }
        return "redirect:select.do?seq=" + seq;
    }
}
