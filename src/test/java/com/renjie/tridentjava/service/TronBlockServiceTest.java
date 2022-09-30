package com.renjie.tridentjava.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tron.trident.proto.Chain;

@SpringBootTest
@Slf4j
class TronBlockServiceTest {

    @Autowired
    private TronBlockService tronBlockService;

    @Test
    void testBlock() {
        Chain.Block nowBlock = tronBlockService.getNowBlock();
        Chain.BlockHeader blockHeader = nowBlock.getBlockHeader();
        log.info("nowBlock.BlockHeader:{}", nowBlock.getBlockHeader());
        Chain.BlockHeader.raw rawData = blockHeader.getRawData();
        log.info("nowBlock.BlockHeader.raw:{}", rawData);
        log.info("number:{}, version:{}, timestamp:{}",rawData.getNumber(), rawData.getVersion(), rawData.getTimestamp());

        Chain.Block blockByNum = tronBlockService.getBlockByNum(0);
        log.info("blockByNum.BlockHeader:{}", blockByNum.getBlockHeader());
        log.info("blockByNum.BlockHeader.raw:{}", blockHeader.getRawData());

    }
}