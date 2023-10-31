package com.lin.cocapibackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.cocapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Dell
* @description 针对表【user_interface_info】的数据库操作Mapper
* @createDate 2023-10-22 21:32:05
* @Entity com.lin.cocapibackend.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




