package com.yuejiji.addressmanagement.service;

import com.yuejiji.addressmanagement.domain.dto.DeliverAddressDTO;
import com.yuejiji.addressmanagement.domain.vo.DeliverAddressVO;

import java.util.List;

/**
 * @Classname DeliverAddressService
 * @Description
 * @Date 2019/11/13 19:02
 * @Author 12442
 */
public interface DeliverAddressService {

    //user对address一对多的关系,通过userId查询address,返回List
    List<DeliverAddressDTO> selectByUserId(String userId);

    //返回给前端的数据List<DeliverAddressVO>
    List<DeliverAddressVO> showDeliverAddress(String userId);

    //根据AddressId查询DeliverAddress
    DeliverAddressDTO selectByAddressId(String addressId);

    //添加地址
    DeliverAddressVO addAddress(DeliverAddressDTO addressDTO);

    //修改地址
    int updateAddress(DeliverAddressDTO addressDTO);

    //根据地址主键删除地址
    int deleteAddress(String addressId);
}
