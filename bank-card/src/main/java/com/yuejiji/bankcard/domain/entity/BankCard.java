package com.yuejiji.bankcard.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName(value = "bank_card")
public class BankCard {
    /**
     * 银行卡id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 真名
     */
    @TableField(value = "real_name")
    private String realName;

    /**
     * 身份证id
     */
    @TableField(value = "id_card")
    private String idCard;

    /**
     * 银行卡号
     */
    @TableField(value = "cardno")
    private String cardno;

    /**
     * 银行卡预留手机号
     */
    @TableField(value = "card_phone")
    private String cardPhone;

    /**
     * 是否删除，0：未删除，1：已删除
     */
    @TableLogic(value = "0",delval = "1")
    private String isDel;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_REAL_NAME = "real_name";

    public static final String COL_ID_CARD = "id_card";

    public static final String COL_CARDNO = "cardno";

    public static final String COL_CARD_PHONE = "card_phone";

    public static final String COL_IS_DEL = "is_del";
}