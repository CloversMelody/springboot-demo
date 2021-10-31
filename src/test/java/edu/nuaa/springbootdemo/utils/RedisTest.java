package edu.nuaa.springbootdemo.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @author: wangli
 * @date: 2021/10/31 23:32
 */
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testSet() {
        redisUtil.set("erp","wangli41");
    }

    @Test
    public void testDel() {
        redisUtil.del("erp");
    }
}
