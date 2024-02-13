package com.example.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HwApplication {

    @GetMapping("/getMessage")
    public String getMsg(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(HwApplication.class, args);
    }

}
