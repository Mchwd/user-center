package com.yuejiji.playinfo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuejiji.playinfo.domain.entity.PaymentM;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentMMapper extends BaseMapper<PaymentM> {
    List<PaymentM> selectByAccount(@Param("account") String account);
}