package com.schh.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(String a, String b){

        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("log testing, {}, {}",a, b);
        return "hello";
    }
}
