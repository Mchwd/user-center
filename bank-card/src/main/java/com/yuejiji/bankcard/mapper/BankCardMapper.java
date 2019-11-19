package com.yuejiji.bankcard.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuejiji.bankcard.domain.entity.BankCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankCardMapper extends BaseMapper<BankCard> {

    List<BankCard> selectByUid(@Param("user_id") String uid);

}