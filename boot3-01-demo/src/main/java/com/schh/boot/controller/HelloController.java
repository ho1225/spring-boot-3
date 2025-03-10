package com.schh.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String Hello(){
        return "Hello, Spring Boot3!";
    }

    @GetMapping("/incr")
    public String incr(){
        Long counter = redisTemplate.opsForValue().increment("counter", 1);
        return "counter: " + counter;
    }
}
