package com.yuejiji.personinfo.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
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
    * 固话
    */
    private String telno;

    /**
    * 手机
    */
    private String mobile;

    /**
    * 密码找回问题
    */
    private String question;

    /**
    * 密码找回的答案
    */
    private String answer;

    /**
    * MD5加密32位
    */
    private String password;

    /**
    * 0表示未激活，
1表示激活，
2表示禁止访问，
3表示禁止发帖
    */
    private String userstate;

    /**
    * 积分
    */
    private Double points;

    /**
    * 发帖数
    */
    private Integer postingcount;

    /**
    * 0女，1男
    */
    private String sex;

    /**
    * 注册时间
    */
    private Date registtime;

    /**
    * 禁止发帖开始时间
    */
    private Date disablebegin;

    /**
    * 禁止发帖结束时间
    */
    private Date disableend;

    /**
    * 部门id，0表示不属于任何部门
    */
    private String section;

    /**
    * 职位id,0表示没有职位
    */
    private String position;

    /**
    * 用户所属的组别id，0游客组，其余组别根据权限角色区分
    */
    private String groupid;

    /**
    * 一个人拥有多个角色（兼职组）
    */
    private String parttime1;

    /**
    * 一个人拥有多个角色（兼职组）
    */
    private String parttime2;

    /**
    * 一个人拥有多个角色（兼职组）
    */
    private String parttime3;

    /**
    * 一个人拥有多个角色（兼职组）
    */
    private String parttime4;

    /**
    * 一个人拥有多个角色（兼职组）
    */
    private String parttime5;

    /**
    * 一个人拥有多个角色（兼职组）
    */
    private String parttime6;

    /**
    * 爱好
    */
    private String hobby;

    /**
    * qq
    */
    private String qq;

    /**
    * msn
    */
    private String msn;

    /**
    * 其他联系方式，如微博
    */
    private String othercontract;

    /**
    * 住址
    */
    private String address;

    /**
    * 邮政编码
    */
    private String postcode;

    /**
    * 生日
    */
    private String birthday;

    /**
    * 会员等级id,
1普通会员，
2银卡会员，
3金卡会员，
4钻石会员，
5至尊会员
    */
    private String grade;

    /**
    * 成为会员的时间
    */
    private Date gradetime;

    /**
    * 用户角色状态,
1普通用户，
2一般管理员，
3超级管理员，
4手机用户

    */
    private String state;

    /**
    * 加密的用户id
    */
    private String uid;
}