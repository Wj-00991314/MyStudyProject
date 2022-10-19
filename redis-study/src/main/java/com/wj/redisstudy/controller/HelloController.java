package com.wj.redisstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WENG Jun
 * @Date 2022.10.19 - 9:24
 * @Description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello";
    }
}
