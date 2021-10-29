package com.gree.hzapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PpoertiesController {

    @Value("{PpoertiesController.book}")
    private String book;

    @Value("{PpoertiesController.author}")
    private String author;

    @Value("{PpoertiesController.age}")
    private String age;

    @GetMapping(value = "/book")
    public String bookInfo() {
        return "《" + book + "》书的作者是" + author + ",年龄" + age + "岁！";
    }
}


