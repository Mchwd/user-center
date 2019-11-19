package com.yuejiji.addressmanagement.domain.entity;


import lombok.Data;

import java.util.Date;

/**
 * @Classname DeliverAddress
 * @Description
 * @Date 2019/11/13 17:39
 * @Author 12442
 */
@Data
public class DeliverAddress {
    /**
     * 收货地址id
     */
    private String addressId;

    /**
     * 用户id
     */
    private String userId;

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

    /**
     * 邮编号
     */
    private String postCode;

    /**
     * 地址创建时间
     */
    private Date createTime;

    /**
     * 地址的状态，0代表普通，1代表默认,2代表假删除的地址
     */
    private Integer state;

    /**
     * 国家
     */
    private String country;
}