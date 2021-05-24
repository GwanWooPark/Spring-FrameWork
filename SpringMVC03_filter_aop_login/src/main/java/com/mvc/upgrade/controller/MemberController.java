package com.mvc.upgrade.controller;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberBiz biz;

    @RequestMapping("loginForm.do")
    public String loginForm() {

        logger.info("[Controller] loginForm.do");

        return "memberLogin";
    }

    @ResponseBody
    @RequestMapping(value = "ajaxlogin.do", method = RequestMethod.POST)
    public Map<String, Boolean> ajaxLogin(@RequestBody MemberDto dto, HttpSession session) {



        return null;
    }
}
