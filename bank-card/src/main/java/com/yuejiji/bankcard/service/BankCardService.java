package com.yuejiji.bankcard.service;

import com.yuejiji.bankcard.domain.dto.BankCardDto;
import com.yuejiji.bankcard.domain.vo.BankCardVo;

import java.util.List;

public interface BankCardService  {

    List<BankCardVo> selectByUid(String uid);

    BankCardVo addBankCard(BankCardDto bankCarddto);
}
