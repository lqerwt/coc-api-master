package com.lin.cocapibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.cocapicommon.model.entity.InterfaceInfo;


/**
* @author Dell
* @description 针对表【interface_info】的数据库操作Service
* @createDate 2023-10-07 21:06:42
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
