package com.renjie.tridentjava.service;

import com.renjie.tridentjava.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tron.trident.core.ApiWrapper;
import org.tron.trident.proto.Response;

/**
 * @author allen
 * @date 2022/9/30 14:38
 */
@Service
public class AccountService {

    @Autowired
    private Utils utils;

    public Response.Account getAccount(String privateKey){
        ApiWrapper wrapper = utils.getDefaultWrapper();
        Response.Account account = wrapper.getAccount(privateKey);
        return account;
    }
}
