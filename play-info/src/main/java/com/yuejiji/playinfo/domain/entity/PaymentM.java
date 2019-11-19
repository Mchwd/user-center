package com.yuejiji.playinfo.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName(value = "payment_m")
public class PaymentM {
    /**
     * payment,序号
     */
    @TableId(value = "PAYMENTID", type = IdType.INPUT)
    private String paymentid;

    /**
     * 支付类型名称
     */
    @NotNull
    @TableField(value = "PAYMENTNAME")
    private String paymentname;

    /**
     * 代码
     */
    @TableField(value = "PAYMENT_CODE")
    private String paymentCode;

    /**
     * 费率
     */
    @TableField(value = "PAYMENT_FREE")
    private String paymentFree;

    /**
     * 接口类型：1：即时到帐接口，2：担保交易接口，3：标准双接口
     */
    @TableField(value = "PAYMENT_INTERFACE")
    private String paymentInterface;

    /**
     * 支付宝账号
     */
    @NotNull
    @TableField(value = "ACCOUNT")
    private String account;

    /**
     * 交易安全效验码
     */
    @TableField(value = "SAFECODE")
    private String safecode;

    /**
     * 身份ID（合作者身份ID）
     */
    @NotNull
    @TableField(value = "PARTNERID")
    private String partnerid;

    /**
     * 描述
     */
    @TableField(value = "DES")
    private String des;

    /**
     * 是否支持货到付款 1：支持，0：不支持
     */
    @TableField(value = "IS_COD")
    private String isCod;

    /**
     * 是否支持在线交易  1：支持，0，不支持
     */
    @TableField(value = "IS_ONLINE")
    private String isOnline;

    /**
     * 状态：1：启用，2：禁用
     */
    @TableLogic(value = "1",delval = "2")
    private String state;

    public static final String COL_PAYMENTID = "PAYMENTID";

    public static final String COL_PAYMENTNAME = "PAYMENTNAME";

    public static final String COL_PAYMENT_CODE = "PAYMENT_CODE";

    public static final String COL_PAYMENT_FREE = "PAYMENT_FREE";

    public static final String COL_PAYMENT_INTERFACE = "PAYMENT_INTERFACE";

    public static final String COL_ACCOUNT = "ACCOUNT";

    public static final String COL_SAFECODE = "SAFECODE";

    public static final String COL_PARTNERID = "PARTNERID";

    public static final String COL_DES = "DES";

    public static final String COL_IS_COD = "IS_COD";

    public static final String COL_IS_ONLINE = "IS_ONLINE";

    public static final String COL_STATE = "STATE";
}