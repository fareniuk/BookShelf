package com.example.bookshelf.controler;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

public class MainControler {
    @GetMapping("/index")
    public String index(Map<String, Object> model) {
        return "index";
    }
}
