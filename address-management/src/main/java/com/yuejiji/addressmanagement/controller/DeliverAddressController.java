package com.yuejiji.addressmanagement.controller;

import com.yuejiji.addressmanagement.domain.dto.DeliverAddressDTO;
import com.yuejiji.addressmanagement.domain.vo.DeliverAddressVO;
import com.yuejiji.addressmanagement.service.DeliverAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname DeliverAddressController
 * @Description
 * @Date 2019/11/13 19:39
 * @Author 12442
 */
@RestController
@RequestMapping("/deliverAddress")
@Slf4j
public class DeliverAddressController {
    @Resource
    DeliverAddressService addressService;

    /**
     * 给其他模块调用的接口,传递DTO
     *
     * @param userId
     * @return
     */
    @RequestMapping("/selectByUserId/{userId}")
    public List<DeliverAddressDTO> selectByUserId(@PathVariable String userId) {
        List<DeliverAddressDTO> deliverAddressDTOs = addressService.selectByUserId(userId);
        return deliverAddressDTOs;
    }

    /**
     * 给前端调用,在前端界面需要显示的VO
     *
     * @param userId
     * @return
     */
    @RequestMapping("/showDeliverAddress/{userId}")
    public List<DeliverAddressVO> showDeliverAddress(@PathVariable String userId) {
        List<DeliverAddressVO> deliverAddressVOs = addressService.showDeliverAddress(userId);
        return deliverAddressVOs;
    }

    /**
     * 新增地址
     *
     * @param addressDTO
     * @return
     */
    @RequestMapping("/addAddress")
    public DeliverAddressVO addAddress(@RequestBody DeliverAddressDTO addressDTO) {
        DeliverAddressVO deliverAddressVO = addressService.addAddress(addressDTO);
        return deliverAddressVO;
    }

    /**
     * 根据地址id主键查询Address
     * @param addressId
     * @return
     */
    @RequestMapping("/selectByAddressId/{addressId}")
    public DeliverAddressDTO selectByAddressId(@PathVariable String addressId) {
        DeliverAddressDTO deliverAddressDTO = addressService.selectByAddressId(addressId);
        return deliverAddressDTO;
    }

    /**
     * 假删除地址
     * @param addressId
     * @return
     */
    @RequestMapping("/deleteAddress")
    public int deleteAddress(String addressId){
        int i = addressService.deleteAddress(addressId);

        return i;
    }
}