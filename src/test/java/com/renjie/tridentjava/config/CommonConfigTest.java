package com.renjie.tridentjava.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class CommonConfigTest {

    @Autowired
    private CommonConfig commonConfig;

    @Test
    void getConfig(){
        log.info("config:{}",commonConfig);
        log.info("apiKey:{}",commonConfig.getApiKey());
        log.info("address:{}",commonConfig.getAddress());
        log.info("privateKey:{}",commonConfig.getPrivateKey());
    }
}