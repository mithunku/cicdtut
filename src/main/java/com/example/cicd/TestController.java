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
        return "helloworld";
    }

    @GetMapping("/cicd")
    public String testcicd()
    {
        return "cicd working congrats on ut first cicd pipeline";
    }

    @GetMapping("/suprisemf")
    public String test50()
    {
        return "kya reeee badwe";
    }








}
