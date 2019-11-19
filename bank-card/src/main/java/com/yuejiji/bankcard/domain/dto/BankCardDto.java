package com.yuejiji.bankcard.domain.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BankCardDto {


    /**
     * 用户id
     */
    @NotNull
    private String userId;

    /**
     * 真名
     */
    @NotNull
    private String realName;

    /**
     * 身份证id
     */
    @NotNull
    private String idCard;

    /**
     * 银行卡号
     */
    @NotNull
    private String cardno;

    /**
     * 银行卡预留手机号
     */
    @NotNull
    private String cardPhone;
}
