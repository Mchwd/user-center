package com.yuejiji.playinfo.service;

import com.yuejiji.playinfo.domain.dto.PaymentMDto;
import com.yuejiji.playinfo.domain.entity.PaymentM;

import java.util.List;

public interface PaymentMService {

    /**
     * 根据支付宝账号查支付信息
     * @param account
     * @return
     */
   List<Object> selectByAccount(String account) ;


    PaymentM addPaymentM(PaymentM paymentM);
}
