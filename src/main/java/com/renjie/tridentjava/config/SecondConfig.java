package com.renjie.tridentjava.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author allen
 * @date 2022/9/30 17:27
 */
@Component
@ConfigurationProperties(prefix = "tron2")
@Data
public class SecondConfig {

    private String address;
    private String privateKey;
}
