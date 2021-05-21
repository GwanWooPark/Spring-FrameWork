package com.mvc.upgrade.model.controller;

import com.mvc.upgrade.model.biz.MYBoardBiz;
import com.mvc.upgrade.model.dto.MYBoardDto;
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
        model.addAttribute("list", biz.selectList());
        return "myBoardList";
    }

    @RequestMapping("select.do")
    public String selectOne(Model model, int myno) {
        model.addAttribute("dto", biz.selectOne(myno));
        return "myBoardSelect";
    }

    @RequestMapping("insertForm.do")
    public String insertForm() {
        return "myBoardInsert";
    }

    @RequestMapping("insertRes.do")
    public String insertRes(MYBoardDto dto) {

        if (biz.insert(dto) > 0) {
            return "redirect:list.do";
        }
        return "redirect:insertForm.do";
    }

    @RequestMapping("updateForm.do")
    public String updateForm(Model model, int myno) {

        model.addAttribute("dto", biz.selectOne(myno));
        return "myBoardUpdate";
    }

    @RequestMapping("updateRes.do")
    public String updateRes(MYBoardDto dto) {

        if (biz.update(dto) > 0) {
            return "redirect:select.do?myno=" + dto.getMyno();
        }
        return "redirect:updateForm.do&myno=" + dto.getMyno();
    }

    @RequestMapping("delete.do")
    public String delete(int myno) {

        if (biz.delete(myno) > 0) {
            return "redirect:list.do";
        }
        return "redirect:select.do&myno=" + myno;
    }
}
