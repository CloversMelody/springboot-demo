package edu.nuaa.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    private static int n = 1;

    @RequestMapping("/hello")
    public Integer hello() {
        log.error("此方法第" + n++ +"次被请求");
        return n;
    }
}
