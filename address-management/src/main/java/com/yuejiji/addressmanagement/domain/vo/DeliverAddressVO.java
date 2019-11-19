package com.yuejiji.addressmanagement.domain.vo;

import com.yuejiji.addressmanagement.domain.dto.UserDTO;
import lombok.Data;

/**
 * @Classname DeliverAddressVO
 * @Description
 * @Date 2019/11/13 19:49
 * @Author 12442
 */
@Data
public class DeliverAddressVO {
   //AddressVO由UserDTO的数据和自己entity实体类一些属性组成
   private UserDTO userDTO;
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
