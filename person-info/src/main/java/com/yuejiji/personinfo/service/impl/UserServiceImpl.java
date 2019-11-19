package com.yuejiji.personinfo.service.impl;

import com.yuejiji.personinfo.domain.entity.User;
import com.yuejiji.personinfo.mapper.UserMapper;
import com.yuejiji.personinfo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User selectById(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public User insert(User user) {
        int userId = userMapper.insert(user);
        User user1 = selectById(Integer.toString(userId));
        return user1;
    }
}
