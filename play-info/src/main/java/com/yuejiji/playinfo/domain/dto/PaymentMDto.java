package com.yuejiji.playinfo.domain.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class PaymentMDto {
    /**
     * payment,序号
     */

    private String paymentid;

    /**
     * 名称
     */

    private String paymentname;

    /**
     * 代码
     */

    private String paymentCode;

    /**
     * 费率
     */

    private String paymentFree;

    /**
     * 接口类型：1：即时到帐接口，2：担保交易接口，3：标准双接口
     */

    private String paymentInterface;

    /**
     * 支付宝账号
     */

    private String account;

    /**
     * 交易安全效验码
     */

    private String safecode;

    /**
     * 身份ID（合作者身份ID）
     */

    private String partnerid;

    /**
     * 描述
     */

    private String des;

    /**
     * 是否支持货到付款 1：支持，0：不支持
     */

    private String isCod;

    /**
     * 是否支持在线交易  1：支持，0，不支持
     */

    private String isOnline;

    /**
     * 状态：1：启用，2：禁用
     */

    private String state;

    /**
     * 返回的携带消息
     */
    private String msg;
}
