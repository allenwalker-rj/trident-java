package com.renjie.tridentjava.service;

import com.renjie.tridentjava.config.CommonConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tron.trident.proto.Response;

@SpringBootTest
@Slf4j
class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Autowired
    private CommonConfig config;

    @Test
    void getAccount1() {
        Response.Account account = accountService.getAccount(config.getAddress());
        log.info("account:{}", account);
    }
}