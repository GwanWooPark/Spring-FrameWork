package com.file.updown.util;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        // validator 사용 가능 여부
        return false;
    }

    // target에 대한 유효성 검사, 검증결과에 문제가 있을 경우에는 errors 객체에 에러 정보를 저장
    @Override
    public void validate(Object target, Errors errors) {
        UploadFile file = (UploadFile) target;

        // 받아온 파일의 사이즈가 0이면
        if (file.getMpfile().getSize() == 0) {
            errors.rejectValue("mpfile", "fileNPE", "Please select a file");
            // 필드(객체의 프로퍼티)에 대한 러정보 추가 및 전달
            // regectValue(String field, String errorCode, String defaultMessage)
            // 필드에 대한 에러코드를 추가 -> 에러코드에 대한 메세지가 존재하지 않을 경우 defaultMessage를 사용
        }
    }
}
