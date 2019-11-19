package com.yuejiji.addressmanagement.service;

import com.yuejiji.addressmanagement.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname UserService
 * @Description
 * @Date 2019/11/13 19:54
 * @Author 12442
 */
@FeignClient("server-person-info-dengdahua")
public interface UserService {

    @RequestMapping("/user/getUserDto/{userId}")
    UserDTO selectByUserId(@PathVariable String userId);

}
