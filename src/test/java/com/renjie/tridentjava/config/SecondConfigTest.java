package com.renjie.tridentjava.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class SecondConfigTest {

    @Autowired
    private SecondConfig config;

    @Test
    public void test(){
        log.info("address:{}", config.getAddress());
        log.info("privateKey:{}", config.getPrivateKey());
    }

}