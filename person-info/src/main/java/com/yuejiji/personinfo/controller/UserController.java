package com.yuejiji.personinfo.controller;

import com.yuejiji.personinfo.domain.dto.UserDto;
import com.yuejiji.personinfo.domain.entity.User;
import com.yuejiji.personinfo.domain.vo.UserVo;
import com.yuejiji.personinfo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;
    @RequestMapping("/getUserById/{userId}")
    public User getUserById(@PathVariable String userId){
        User user = userService.selectById(userId);
        return user;
    }

    @RequestMapping("/getUserDto/{userId}")
    public UserDto getUserDto(@PathVariable String userId){
        User user = userService.selectById(userId);
        UserDto userDto=new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }


    @RequestMapping("/getUserVo/{userId}")
    public UserVo getUserVo(@PathVariable String userId){
        User user = userService.selectById(userId);
        UserVo userVo=new UserVo();
        BeanUtils.copyProperties(user,userVo);
        return userVo;
    }

    @RequestMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        User user1 = userService.insert(user);
        return user1;
    }
}
