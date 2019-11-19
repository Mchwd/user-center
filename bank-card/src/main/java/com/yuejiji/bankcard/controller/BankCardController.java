package com.yuejiji.bankcard.controller;

import com.yuejiji.bankcard.domain.dto.BankCardDto;
import com.yuejiji.bankcard.domain.entity.BankCard;
import com.yuejiji.bankcard.domain.vo.BankCardVo;
import com.yuejiji.bankcard.service.BankCardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.List;

@RestController
@RequestMapping("/bankcard")
@Slf4j
public class BankCardController {

    @Resource
    private BankCardService bankCardService;

    /**
     * 根据uid查询银行卡信息
     *
     * @param uid
     * @return
     */
    @RequestMapping("/select/{uid}")
    public List<BankCardVo> selectByUid(@PathVariable("uid") String uid) {
        log.info("uid,{}", uid);
        return bankCardService.selectByUid(uid);
    }

    /**
     * 新增银行卡信息
     *
     * @param bankCardDto
     * @return 银行卡vo
     */
    @RequestMapping("/add")
    public BankCardVo addBankCard(BankCardDto bankCardDto) {
        return bankCardService.addBankCard(bankCardDto);
    }

}
