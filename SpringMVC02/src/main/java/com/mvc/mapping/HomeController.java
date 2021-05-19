package com.mvc.mapping;

import com.mvc.mapping.dto.AddressDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping(value = "home.do")
    public String home(Locale locale, Model model) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);
        return "home";
    }

    @RequestMapping(value = "command.do", method = RequestMethod.GET)
    public String getCommand(Model model, String name, @RequestParam("addr") String address, String phone) {


        model.addAttribute("dto", new AddressDto(name, address, phone));
        return "getCommand";
    }

    @RequestMapping(value = "command.do", method = RequestMethod.POST)
    public String postCommand(Model model, @ModelAttribute AddressDto dto) {
        model.addAttribute("dto", dto);

        return "postCommand";
    }
}
