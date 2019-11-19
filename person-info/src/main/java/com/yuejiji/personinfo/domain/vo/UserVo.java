package com.yuejiji.personinfo.domain.vo;

import lombok.Data;

@Data
public class UserVo {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真名
     */
    private String realname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 0女，1男
     */
    private String sex;

    /**
     * 一个人拥有多个角色（兼职组） ：昵称
     */
    private String parttime1;
}
