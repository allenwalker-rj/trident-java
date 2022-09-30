package com.renjie.tridentjava.service;

import com.renjie.tridentjava.config.CommonConfig;
import com.renjie.tridentjava.config.SecondConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private CommonConfig config;

    @Autowired
    private SecondConfig secondConfig;

    @Test
    void transferTRX() {
        String fromAddress = config.getAddress();
        String toAddress = secondConfig.getAddress();
        int amount = 2000;
        transactionService.transferTRX(fromAddress, toAddress, amount);
    }
}