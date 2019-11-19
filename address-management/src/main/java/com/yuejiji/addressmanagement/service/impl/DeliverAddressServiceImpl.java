package com.yuejiji.addressmanagement.service.impl;

import com.yuejiji.addressmanagement.domain.dto.DeliverAddressDTO;
import com.yuejiji.addressmanagement.domain.dto.UserDTO;
import com.yuejiji.addressmanagement.domain.entity.DeliverAddress;
import com.yuejiji.addressmanagement.domain.vo.DeliverAddressVO;
import com.yuejiji.addressmanagement.mapper.DeliverAddressMapper;
import com.yuejiji.addressmanagement.service.DeliverAddressService;
import com.yuejiji.addressmanagement.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname DeliverAddressServiceImpl
 * @Description
 * @Date 2019/11/13 19:02
 * @Author 12442
 */
@Service
@Slf4j
public class DeliverAddressServiceImpl implements DeliverAddressService {
    @Resource
    DeliverAddressMapper addressMapper;
    @Resource
    UserService userService;

    @Override
    public List<DeliverAddressDTO> selectByUserId(String userId) {
        //根据userId查询
        List<DeliverAddress> deliverAddresses = addressMapper.selectByUserId(userId);
        //new一个长度为entity实体类List.size()的DTO数组
        DeliverAddressDTO[] deliverAddressDTOs = new DeliverAddressDTO[deliverAddresses.size()];
        //把DeliverAddress的属性复制到DTO
        for (int i = 0; i < deliverAddresses.size(); i++) {
            deliverAddressDTOs[i] = new DeliverAddressDTO();
            BeanUtils.copyProperties(deliverAddresses.toArray()[i], deliverAddressDTOs[i]);
        }
        //把DTO数组转换为List
        List<DeliverAddressDTO> deliverAddressDTOS = Arrays.asList(deliverAddressDTOs);

        return deliverAddressDTOS;
    }

    /**
     * 调用楼上selectByUserId()方法获取DTO,然后把DTO属性拷贝到VO对象中
     *
     * @param userId
     * @return
     */
    @Override
    public List<DeliverAddressVO> showDeliverAddress(String userId) {
        List<DeliverAddressDTO> deliverAddressDTOs = selectByUserId(userId);
        //User数据
        UserDTO userDTO = userService.selectByUserId(userId);
        //new一个VO的数组
        DeliverAddressVO[] deliverAddressVOs = new DeliverAddressVO[deliverAddressDTOs.size()];
        //复制DTO属性到VO
        for (int i = 0; i < deliverAddressDTOs.size(); i++) {
            deliverAddressVOs[i] = new DeliverAddressVO();
            BeanUtils.copyProperties(deliverAddressDTOs.toArray()[i], deliverAddressVOs[i]);
            deliverAddressVOs[i].setUserDTO(userDTO);
        }
        //把VO数组转换成List类型
        List<DeliverAddressVO> deliverAddressVOS = Arrays.asList(deliverAddressVOs);

        return deliverAddressVOS;
    }

    /**
     * 新增地址,返回地址
     *
     * @param addressDTO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public DeliverAddressVO addAddress(DeliverAddressDTO addressDTO) {
        //new一个DeliverAddress实体类和VO,把DTO属性依次Copy到实体类和VO
        DeliverAddress deliverAddress = new DeliverAddress();
        DeliverAddressVO deliverAddressVO = new DeliverAddressVO();
        BeanUtils.copyProperties(addressDTO, deliverAddress);
        int column = addressMapper.insert(deliverAddress);
        log.info("受影响的行数:{}行", column);
        //如果插入成功(受影响的行数不为0,就把DTO复制到VO)
        if (column != 0) {
            BeanUtils.copyProperties(addressDTO, deliverAddressVO);
        }
        return deliverAddressVO;
    }

    /**
     * 根据AddressId查询地址(前端界面点击修改的时候,把地址的id传上来进行查找)
     *
     * @param addressId
     * @return
     */
    @Override
    public DeliverAddressDTO selectByAddressId(String addressId) {
        //根据地址id查询
        DeliverAddress deliverAddress = addressMapper.selectByPrimaryKey(addressId);
        //new 一个DTO
        DeliverAddressDTO deliverAddressDTO = new DeliverAddressDTO();
        //复制属性
        BeanUtils.copyProperties(deliverAddress, deliverAddressDTO);

        return deliverAddressDTO;
    }

    /**
     * 修改地址
     *
     * @param addressDTO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateAddress(DeliverAddressDTO addressDTO) {
        //根据前端传过来的json数据DTO查询entity
        DeliverAddress deliverAddress = addressMapper.selectByPrimaryKey(addressDTO.getAddressId());
        //修改deliverAddress,收货人信息、省、市、区、详细地址
        deliverAddress.setProvince(addressDTO.getProvince());
        deliverAddress.setCity(addressDTO.getCity());
        deliverAddress.setDistrict(addressDTO.getDistrict());
        deliverAddress.setStreet(addressDTO.getStreet());
        //修改address
        int column = addressMapper.updateByPrimaryKey(deliverAddress);
        log.info("修改数据受影响的行数:{}",column);
        return column;
    }

    /**
     * 根据地址主键删除地址(假删除,修改地址状态)
     *
     * @param addressId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deleteAddress(String addressId) {
        //先查,再修改deliverAddress的state状态
        DeliverAddress deliverAddress = addressMapper.selectByPrimaryKey(addressId);
        deliverAddress.setState(2);
        int column = addressMapper.updateByPrimaryKey(deliverAddress);

        return column;
    }
}
