package com.yuejiji.personinfo.service;

import com.yuejiji.personinfo.domain.entity.User;

public interface UserService {
    User insert(User user);

    User selectById(String userId);
}
