package com.renjie.tridentjava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author allen
 * @date 2022/9/29 14:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDto {
    /**
     * address地址：默认Base58Check格式
     */
    private String address;
    /**
     * address地址：Hex格式
     */
    private String hexAddress;
    /**
     * 私钥
     */
    private String privateKey;
    /**
     * 公钥
     */
    private String publicKey;
}
