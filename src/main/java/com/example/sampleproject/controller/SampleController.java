package com.example.sampleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    //コメント追加　
    @RequestMapping("/sample")
    public String sample() {
        return "sample";
    }   
}