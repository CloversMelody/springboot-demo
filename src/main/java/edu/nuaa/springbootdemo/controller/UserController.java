package edu.nuaa.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import edu.nuaa.springbootdemo.domain.UserInfo;
import edu.nuaa.springbootdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    private static int n = 1;

    @RequestMapping("hello")
    public Integer hello() {
        log.error("此方法第" + n++ +"次被请求");
        return n;
    }

    @RequestMapping("/addUser")
    public Integer addUser(@RequestBody UserInfo userIno) {
        log.info("添加用户信息:{}", JSON.toJSONString(userIno));
        return userService.addUser(userIno);
    }

}
