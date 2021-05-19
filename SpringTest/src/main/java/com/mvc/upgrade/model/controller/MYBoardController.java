package com.mvc.upgrade.model.controller;

import com.mvc.upgrade.model.biz.MYBoardBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MYBoardController {

    @Autowired
    private MYBoardBiz biz;

    @RequestMapping("list.do")
    public String selectList(Model model) {
        model.addAttribute("list",biz.selectList());
        return "myBoardList";
    }


}
