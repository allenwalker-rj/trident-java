package com.renjie.tridentjava.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author allen
 * @date 2022/9/29 15:28
 */
@Component
@ConfigurationProperties(prefix = "tron")
@Data
public class CommonConfig {

    private String apiKey;
    private String address;
    private String privateKey;
    private String publicKey;
    private String hexAddress;
}
