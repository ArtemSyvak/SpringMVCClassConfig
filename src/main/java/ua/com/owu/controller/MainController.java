package ua.com.owu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//    @RequestMapping(method = RequestMethod.GET, value = "/")
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("xxx", 1111);
        return "index";
    }
}

