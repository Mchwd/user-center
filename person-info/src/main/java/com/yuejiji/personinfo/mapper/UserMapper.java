package com.yuejiji.personinfo.mapper;

import com.yuejiji.personinfo.domain.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);


    User selectByPrimaryKey(String userId);


    int updateByPrimaryKey(User record);
}