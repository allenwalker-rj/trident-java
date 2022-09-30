package com.renjie.tridentjava.util;

import com.renjie.tridentjava.config.CommonConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tron.trident.core.ApiWrapper;
import org.tron.trident.core.exceptions.IllegalException;
import org.tron.trident.core.key.KeyPair;
import org.tron.trident.proto.Response;

@SpringBootTest
@Slf4j
class UtilsTest {

    @Autowired
    private Utils utils;

    @Autowired
    private CommonConfig config;

    @Test
    void getWrapper() throws IllegalException {
        ApiWrapper wrapper = utils.getWrapper(Constant.WRAPPER_SHASTA_TEST);
        log.info("wrapper:{}", wrapper.toString());
        log.info("wrapper.nowBlock:{}", wrapper.getNowBlock());
        KeyPair keyPair = wrapper.keyPair;
        log.info("keyPair:{}", keyPair.toString());
        log.info("keyPair.privateKey:{}", keyPair.toPrivateKey());
        log.info("keyPair.address:{}", keyPair.toBase58CheckAddress());
        Response.Account account = wrapper.getAccount(config.getAddress());
        log.info("account: {}", account.toString());
        log.info("account.address: {}", account.getAddress());
        log.info("account.balance: {}", account.getBalance());
        log.info("account.createTime: {}", account.getCreateTime());

    }
}