package com.lin.cocapicommon.service;

import com.lin.cocapicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author lin
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户密钥（根据 accessKey 拿到用户信息、返回用户信息，为空表示不存在）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
