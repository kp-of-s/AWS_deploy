package com.lec.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer num) {

        if(num == 1)
            log.info("1");
        else if(num == -1)
            log.error("-1");
        else if(num == 0)
            log.warn("0");

        return "<h1>HELL</h1>";
    }
}
