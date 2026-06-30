package com.example.cicd_3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hi")

    public String  hi(){

        return  "hi  cicd docker !!!  ^^^ !!! 0630 docker! java install ^^";
    }
}
