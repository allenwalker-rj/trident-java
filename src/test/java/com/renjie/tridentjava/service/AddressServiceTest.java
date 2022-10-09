package com.renjie.tridentjava.service;

import com.renjie.tridentjava.config.CommonConfig;
import com.renjie.tridentjava.dto.AddressDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tron.trident.core.key.KeyPair;

@SpringBootTest
@Slf4j
class AddressServiceTest {

    @Autowired
    private AddressService addressService;

    @Autowired
    private CommonConfig config;

    @Test
    void generate() {
        AddressDto addressDto = addressService.generate();
        log.info("addressDto: {}", addressDto);
    }

    @Test
    void testGetKeyPair(){
        KeyPair keyPair = addressService.getKeyPairWithPrivateKey(config.getPrivateKey2());
        log.info("keyPair:{}", keyPair.toString());
        log.info("keyPair.PrivateKey:{}", keyPair.toPrivateKey());
        log.info("keyPair.PublicKey:{}", keyPair.toPublicKey());
        log.info("keyPair.Base58CheckAddress:{}", keyPair.toBase58CheckAddress());
        log.info("keyPair.HexAddress:{}", keyPair.toHexAddress());
    }
}