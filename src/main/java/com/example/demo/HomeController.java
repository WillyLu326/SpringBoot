package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhenglu on 6/19/17.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello Spring Boot";
    }
}
