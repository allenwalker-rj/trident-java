package com.renjie.tridentjava.service;

import com.renjie.tridentjava.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tron.trident.core.ApiWrapper;
import org.tron.trident.proto.Chain;

/**
 * @author allen
 * @date 2022/9/29 18:03
 */
@Service
@Slf4j
public class TronBlockService {

    @Autowired
    private Utils utils;

    public Chain.Block getNowBlock() {
        ApiWrapper wrapper = utils.getDefaultWrapper();
        try {
            Chain.Block nowBlock = wrapper.getNowBlock();
            return nowBlock;
        }catch (Exception e){
            log.error("TronBlockService#getNowBlock error, {}", e.getMessage());
        }
        return null;
    }

    public Chain.Block getBlockByNum(long blockNum){
        if (blockNum < 0){
            return null;
        }
        ApiWrapper wrapper = utils.getDefaultWrapper();
        try {
            Chain.Block block = wrapper.getBlockByNum(blockNum);
            return block;
        }catch (Exception e){
            log.error("TronBlockService#getBlockByNum error, {}", e.getMessage());
        }
        return null;
    }
}
