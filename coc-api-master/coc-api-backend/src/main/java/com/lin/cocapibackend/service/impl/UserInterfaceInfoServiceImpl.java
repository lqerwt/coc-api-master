package com.lin.cocapibackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.cocapicommon.model.entity.UserInterfaceInfo;
import com.lin.cocapibackend.common.ErrorCode;
import com.lin.cocapibackend.exception.BusinessException;
import com.lin.cocapibackend.exception.ThrowUtils;
import com.lin.cocapibackend.mapper.UserInterfaceInfoMapper;
import com.lin.cocapibackend.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author Dell
* @description 针对表【user_interface_info】的数据库操作Service实现
* @createDate 2023-10-22 21:32:05
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {
    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {

        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(userInterfaceInfo.getInterfaceInfoId() <= 0 ||
                    userInterfaceInfo.getUserId() <= 0,
                    ErrorCode.PARAMS_ERROR, "接口或用户不存在");
        }
        // 有参数则校验
        if (userInterfaceInfo.getLeftNum() < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于 0");
        }
    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        // 判断
        ThrowUtils.throwIf(interfaceInfoId <= 0 || userId <= 0, ErrorCode.PARAMS_ERROR);

        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("interface_info_id", interfaceInfoId);
        updateWrapper.eq("user_id", userId);
        updateWrapper.gt("left_num", 0);
        updateWrapper.setSql("left_num = left_num - 1, total_num = total_num + 1");
        return this.update(updateWrapper);
    }
}




