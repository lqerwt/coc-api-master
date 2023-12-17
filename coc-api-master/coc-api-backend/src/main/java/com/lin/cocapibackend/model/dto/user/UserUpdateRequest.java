package com.lin.cocapibackend.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户更新请求
 *
 * @author lin
 */
@Data
public class UserUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 性别
     */
    private String gender;

    /**
     * 账号状态（0- 正常 1- 封号）
     */
    private Integer status;

    /**
     * 用户角色：user/admin
     */
    private String userRole;

    /**
     * 钱包余额,注册送30币
     */
    private Long wallet;


    private static final long serialVersionUID = 1L;
}