package com.hello.mvc.controller;

import com.hello.mvc.model.HelloBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    private HelloBiz biz;

    // TODO : 03. handlerMapping(/hello.do) 을 통해 해당 컨트롤러의 메소드로 request 전달
    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    public String getHello(Model model) {

        // TODO : 04. biz(@Service) 호출
        model.addAttribute("message", biz.getHello());
        // Model

        // TODO : 08. return 받은 값을 model 객체에 담아서, ModelAndView 객체를 전달
        return "/WEB-INF/views/hello.jsp";
        // viewName
    }

    // TODO : 10. handlerMapping(/bye.do)
    @RequestMapping("/bye.do")
    public ModelAndView getBye(@RequestParam("name") String name) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("message", "Bye, " + name);
        mav.setViewName("/WEB-INF/views/bye.jsp");

        return null;
    }
}
