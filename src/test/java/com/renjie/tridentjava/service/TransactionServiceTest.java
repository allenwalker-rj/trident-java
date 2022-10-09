package com.renjie.tridentjava.service;

import com.renjie.tridentjava.config.CommonConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private CommonConfig config;

    @Test
    void transferTRX() {
        String fromAddress = config.getAddress();
        String toAddress = config.getAddress2();
        // 1000000 = 1
        int amount = 2000000;
        transactionService.transferTRX(fromAddress, toAddress, amount);
    }
}