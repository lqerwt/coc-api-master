package com.lin.cocapicommon.service;

import com.lin.cocapicommon.model.entity.InterfaceInfo;

/**
* @author Dell
* @description 针对表【interface_info】的数据库操作Service
* @createDate 2023-10-07 21:06:42
*/
public interface InnerInterfaceInfoService{

    /**
     * 从数据库中查询接口是否存在（请求路径、请求方法、请求参数、返回接口信息，为空表示不存在）
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String url, String method);

}
