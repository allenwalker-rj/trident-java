package com.renjie.tridentjava.util;

import com.renjie.tridentjava.config.CommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tron.trident.core.ApiWrapper;

/**
 * @author allen
 * @date 2022/9/29 15:17
 */
@Component
public class Utils {

    @Autowired
    private CommonConfig config;


    public ApiWrapper getDefaultWrapper(){
        return ApiWrapper.ofShasta(config.getPrivateKey());
    }
    public ApiWrapper getWrapper(int mod){
        switch (mod){
            case Constant.WRAPPER_MAIN_NET:{
                return ApiWrapper.ofMainnet(config.getPrivateKey(), config.getApiKey());
            }
            case Constant.WRAPPER_SHASTA_TEST:{
                return ApiWrapper.ofShasta(config.getPrivateKey());
            }
            case Constant.WRAPPER_NILE_TEST:{
                return ApiWrapper.ofNile(config.getPrivateKey());
            }
            default:
                return ApiWrapper.ofShasta(config.getPrivateKey());
        }
    }
}
