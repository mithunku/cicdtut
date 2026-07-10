package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test()
    {
        return "hello world";
    }

    @GetMapping("/test2")
    public String test2()
    {
        return "test hello world";
    }

    @GetMapping("/test3")
    public String test3()
    {
        return "test hello world";
    }

    @GetMapping("/test4")
    public String test4()
    {
        return "test hello world";
    }



}
