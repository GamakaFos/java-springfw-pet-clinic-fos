package com.example.petClinicFosApplication.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "index.html"})
    public String index(Model model){
        String indexStr = new String("Another text to index controller to check how it works");
        model.addAttribute(indexStr);
        return "index";
    }

}
