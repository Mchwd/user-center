package com.yuejiji.playinfo.controller;

import com.yuejiji.playinfo.domain.entity.PaymentM;
import com.yuejiji.playinfo.service.PaymentMService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/paymentm")
public class PaymentMController {

    @Resource
    private PaymentMService paymentMService;

    @RequestMapping("/{account}")
    public List<Object> selectByAccount(@PathVariable("account") String account){
        return paymentMService.selectByAccount(account);
    }

    @RequestMapping("/add")
    public PaymentM addPaymentM(PaymentM paymentM){
        return paymentMService.addPaymentM(paymentM);
    }

}
