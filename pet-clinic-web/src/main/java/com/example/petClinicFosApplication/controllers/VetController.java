package com.example.petClinicFosApplication.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    //@RequestMapping({"/indexVets", "vets/indexVets", "vets/indexVets.html"})
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        //return "vets/indexVets";
        return "vets/index";
    }
}
//
//@Controller
//@RequestMapping("/vets")
//public class VetController {
//
//    @RequestMapping({"/", "vets.html", "index.html", "index", ""})
//    public String listVets() {
//
//        return "vets/index";
//
//    }
//
//}