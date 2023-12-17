package com.lin.cocapibackend.model.vo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 已登录用户视图（脱敏）
 *
 * @author lin
 **/
@Data
public class LoginUserVO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    /**
     * 钱包余额,注册送30币
     */
    private Long wallet;

    /**
     * 签名标识
     */
    private String accessKey;

    /**
     * 签名密钥
     */
    private String secretKey;

    /**
     * 账号状态（0- 正常 1- 封号）
     */
    private Integer userStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}