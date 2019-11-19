package com.yuejiji.bankcard.service.impl;

import com.yuejiji.bankcard.domain.dto.BankCardDto;
import com.yuejiji.bankcard.domain.entity.BankCard;
import com.yuejiji.bankcard.domain.vo.BankCardVo;
import com.yuejiji.bankcard.mapper.BankCardMapper;
import com.yuejiji.bankcard.service.BankCardService;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class BankServiceImpl implements BankCardService {

    @Resource
    private BankCardMapper bankCardMapper;

    /**
     * 根据用户id查询相关银行卡信息
     *
     * @param uid
     * @return 银行卡vo集合
     */
    @Override
    public List<BankCardVo> selectByUid(String uid) {
        List<BankCard> bankCards = bankCardMapper.selectByUid(uid);
//如果查询到信息，则转换为vo传输
        if (bankCards.size() > 0) {
            List<BankCardVo> bankCardVos = new ArrayList<>();
            BankCardVo bankCardVo = new BankCardVo();
            for (BankCard b : bankCards) {
                BeanUtils.copyProperties(b, bankCardVo);
                bankCardVos.add(bankCardVo);
            }
            return bankCardVos;
        } else {
            return null;
        }

    }

    /**
     * 新增银行卡
     *
     * @param bankCarddto
     * @return 返回新增的银行卡的信息
     */
    @Override
    public BankCardVo addBankCard(BankCardDto bankCarddto) {
        BankCard bankCard = new BankCard();
        BeanUtils.copyProperties(bankCarddto, bankCard);
        int insert = bankCardMapper.insert(bankCard);
        BankCardVo bankCardVo = new BankCardVo();
        if (insert > 0) {
            BankCard bankCard1 = bankCardMapper.selectById(bankCard.getId());

            BeanUtils.copyProperties(bankCard1, bankCardVo);
            return bankCardVo;
        } else {
            return bankCardVo;
        }

    }
}
