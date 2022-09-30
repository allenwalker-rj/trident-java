package com.renjie.tridentjava.service;

import com.renjie.tridentjava.dto.AddressDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tron.trident.core.key.KeyPair;


/**
 * @author allen
 * @date 2022/9/29 14:11
 */
@Service
@Slf4j
public class AddressService {

    public AddressDto generate(){
        KeyPair keyPair = KeyPair.generate();
        log.info("生成 keyPair: {}", keyPair.toString());
        return AddressDto.builder()
                .address(keyPair.toBase58CheckAddress())
                .hexAddress(keyPair.toHexAddress())
                .privateKey(keyPair.toPrivateKey())
                .publicKey(keyPair.toPublicKey())
                .build();
    }


    public KeyPair getKeyPairWithPrivateKey(String privateKey){
        return new KeyPair(privateKey);
    }
}
