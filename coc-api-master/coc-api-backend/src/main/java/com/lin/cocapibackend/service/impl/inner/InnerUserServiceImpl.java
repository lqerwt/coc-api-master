package com.lin.cocapibackend.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.cocapicommon.model.entity.User;
import com.lin.cocapicommon.service.InnerUserService;
import com.lin.cocapibackend.common.ErrorCode;
import com.lin.cocapibackend.exception.ThrowUtils;
import com.lin.cocapibackend.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;


@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        ThrowUtils.throwIf(StringUtils.isAnyBlank(accessKey), ErrorCode.PARAMS_ERROR);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("access_key", accessKey);

        return userMapper.selectOne(queryWrapper);
    }
}
