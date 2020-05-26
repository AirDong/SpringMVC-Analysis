package com.aidong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {

    private static final Logger logger = LoggerFactory.getLogger(RequestBodyController.class);

    @RequestMapping("OK")
    public String OK(){
        logger.info("--------OK---------");
        return "OK";
    }
}
