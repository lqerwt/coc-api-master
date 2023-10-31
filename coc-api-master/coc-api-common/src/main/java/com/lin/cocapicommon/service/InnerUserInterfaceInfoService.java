package com.lin.cocapicommon.service;

import com.lin.cocapicommon.model.entity.UserInterfaceInfo;


/**
* @author Dell
* @description 针对表【user_interface_info】的数据库操作Service
* @createDate 2023-10-22 21:32:05
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用成功，接口次数 + 1
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
