package com.renjie.tridentjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author allen
 */
@SpringBootApplication
@EnableConfigurationProperties
public class TridentJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TridentJavaApplication.class, args);
    }

}
