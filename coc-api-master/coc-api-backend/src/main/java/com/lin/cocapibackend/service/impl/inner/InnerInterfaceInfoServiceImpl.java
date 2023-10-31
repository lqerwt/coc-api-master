package com.lin.cocapibackend.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.cocapicommon.model.entity.InterfaceInfo;
import com.lin.cocapicommon.service.InnerInterfaceInfoService;
import com.lin.cocapibackend.common.ErrorCode;
import com.lin.cocapibackend.exception.ThrowUtils;
import com.lin.cocapibackend.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        ThrowUtils.throwIf(StringUtils.isAnyBlank(url, method), ErrorCode.PARAMS_ERROR);
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);

        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
