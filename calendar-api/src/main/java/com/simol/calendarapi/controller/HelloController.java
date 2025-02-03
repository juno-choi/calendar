package com.simol.calendarapi.controller;

import com.simol.calendarcommon.domain.TestDomain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        TestDomain build = TestDomain.builder().key("key1").build();
        log.info("build key = {}", build.getKey());
        return "hello";
    }
}
