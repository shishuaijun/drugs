package com.durgs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aaa {

    @RequestMapping("aaa")
    public void aaa(){
        System.out.println("你哈");
    }


}
