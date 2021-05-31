package com.boot.leaf.controller;

import com.boot.leaf.dto.LeafDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LeafController {

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("name", "Thymeleaf");

        return "hello";
    }

    @GetMapping("/util")
    public String utility() {
        return "utility";
    }

    @GetMapping("/expr")
    public String expression(Model model) {

        model.addAttribute("name", "Thymeleaf");

        LeafDto dto = new LeafDto("Java", 1);
        model.addAttribute("dto", dto);
        List<LeafDto> list = new ArrayList<LeafDto>();
        list.add(new LeafDto("DataBase", 2));
        list.add(new LeafDto("HTML/CSS", 3));
        model.addAttribute("list", list);

        return "expression";
    }

    @GetMapping("/params")
    public String parameters(Model model, HttpSession session) {

        session.setAttribute("pw", "qclass password");

        return "params";
    }

    @GetMapping("/static")
    public String staticTest() {

        return "static";
    }

}
