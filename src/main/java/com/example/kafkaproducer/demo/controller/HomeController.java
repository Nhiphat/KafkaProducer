package com.example.kafkaproducer.demo.controller;

import com.example.kafkaproducer.demo.model.Message;
import com.example.kafkaproducer.demo.producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private ProducerService producerService;

    @PostMapping("/generate")
    public String generate(@RequestBody Message message) {
        producerService.producer(message);
        return "OK";
    }
}
