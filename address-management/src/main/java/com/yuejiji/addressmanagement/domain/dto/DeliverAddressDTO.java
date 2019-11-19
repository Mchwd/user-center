package com.yuejiji.addressmanagement.domain.dto;

import lombok.Data;

/**
 * @Classname DeliverAddressDTO 数据传输对象
 * @Description
 * @Date 2019/11/13 18:56
 * @Author 12442
 */
@Data
public class DeliverAddressDTO {
    /**
     * 收货地址id
     */
    private String addressId;

    /**
     * 省份
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区县
     */
    private String district;

    /**
     * 街道(详细地址)
     */
    private String street;
}
