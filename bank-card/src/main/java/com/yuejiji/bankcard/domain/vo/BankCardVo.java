package com.yuejiji.bankcard.domain.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BankCardVo {
    /**
     * 银行卡id
     */

    private Integer id;





    /**
     * 银行卡号
     */

    private String cardno;

    /**
     * 用户id
     */

    private String userId;
}
