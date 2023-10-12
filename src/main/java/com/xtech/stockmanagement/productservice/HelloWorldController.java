package com.xtech.stockmanagement.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/deneme")
    public String deneme(){
        return   "hello";
    }
}
