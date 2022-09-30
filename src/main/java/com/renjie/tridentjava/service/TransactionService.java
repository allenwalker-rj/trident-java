package com.renjie.tridentjava.service;

import com.renjie.tridentjava.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tron.trident.core.ApiWrapper;
import org.tron.trident.proto.Chain;
import org.tron.trident.proto.Response;

/**
 * @author allen
 * @date 2022/9/30 10:38
 */
@Service
@Slf4j
public class TransactionService {

    @Autowired
    private Utils utils;

    public String transferTRX(String fromAddress, String toAddress, int amount){
        ApiWrapper wrapper = utils.getDefaultWrapper();
        try {
            // 创建交易
            Response.TransactionExtention transaction = wrapper.transfer(fromAddress, toAddress, amount);
            log.info("transaction:{}", transaction);
            log.info("transaction.Txid:{}", transaction.getTxid());
            // 签名交易
            Chain.Transaction signTransaction = wrapper.signTransaction(transaction);
            log.info("signTransaction:{}", signTransaction);
            // 计算交易所需要的宽带
            long byteSize = wrapper.estimateBandwidth(signTransaction);
            log.info("byteSize:{}", byteSize);
            // 广播交易
            String hashTx = wrapper.broadcastTransaction(signTransaction);
            log.info("hashTRX:{}", hashTx);
            return hashTx;
        }catch (Exception e){
            log.error("TransactionService#transfer error: {}", e.getMessage());
        }
        return null;
    }

}
