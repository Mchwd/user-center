package com.yuejiji.addressmanagement.mapper;

import com.yuejiji.addressmanagement.domain.entity.DeliverAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname DeliverAddressMapper
 * @Description 
 * @Date 2019/11/13 17:39
 * @Author 12442
 */
public interface DeliverAddressMapper {
    int deleteByPrimaryKey(String addressId);

    int insert(DeliverAddress record);

    int insertSelective(DeliverAddress record);

    DeliverAddress selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(DeliverAddress record);

    int updateByPrimaryKey(DeliverAddress record);

    //user对address一对多的关系,通过userId查询address,返回List
    List<DeliverAddress> selectByUserId(@Param("userId") String userId);
}