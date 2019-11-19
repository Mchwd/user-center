package com.yuejiji.playinfo.service.impl;

import com.yuejiji.playinfo.domain.dto.PaymentMDto;
import com.yuejiji.playinfo.domain.entity.PaymentM;
import com.yuejiji.playinfo.mapper.PaymentMMapper;
import com.yuejiji.playinfo.service.PaymentMService;
import com.yuejiji.playinfo.utils.GuuidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunny
 */
@Service
@Slf4j
public class PaymentMServiceImpl implements PaymentMService {

    @Resource
    private PaymentMMapper paymentMMapper;

    /**
     * 根据支付宝账号查询支付方式信息
     *
     * @param account
     * @return 返回一个包含相关信息的集合
     */
    @Override
    public List<Object> selectByAccount(String account) {
        List<Object> paymentMDtos = new ArrayList<>();
        if (account != null) {
            List<PaymentM> paymentMS = paymentMMapper.selectByAccount(account);
            //如果有相关数据则转为dto传走，否则传一个查无此号的字符串

            if (paymentMS.size() > 0) {

                for (PaymentM p : paymentMS) {
                    PaymentMDto paymentMDto = new PaymentMDto();
                    BeanUtils.copyProperties(p, paymentMDto);
                    paymentMDtos.add(paymentMDto);
                }
                return paymentMDtos;
            } else {
                String msg = "没有这个支付宝账号的支付信息";
                paymentMDtos.add(msg);
                return paymentMDtos;
            }
        } else {
            String msg = "请提供相关支付宝账号信息";
            paymentMDtos.add(msg);
            return paymentMDtos;
        }

    }


    /**
     * 增加paymentM
     *
     * @param paymentM
     * @return
     */
    @Override
    public PaymentM addPaymentM(PaymentM paymentM) {
        String id = GuuidUtil.getUUID() + "";
        paymentM.setPaymentid(id);
        int insert = paymentMMapper.insert(paymentM);
        return paymentMMapper.selectById(id);

    }
}
