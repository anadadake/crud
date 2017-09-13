package com.anadadake.crud.common.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SystemController {


    @RequestMapping("/redirect.html")
    public String showIndexPage() throws Exception{

        System.out.println("@@@@");
        return "/indexPage";
    }

}
