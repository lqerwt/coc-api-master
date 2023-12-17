package com.lin.cocapibackend.model.vo;


import com.lin.cocapicommon.model.entity.InterfaceInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口信息封装视图
 *
 * @author lin
 */
@Data
public class InterfaceInfoVO extends InterfaceInfo implements Serializable {

    /**
     * 调用次数
     */
    private Long totalNum;

    private static final long serialVersionUID = 1L;
}
