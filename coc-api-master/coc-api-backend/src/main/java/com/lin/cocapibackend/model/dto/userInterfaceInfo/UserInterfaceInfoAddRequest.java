package com.lin.cocapibackend.model.dto.userInterfaceInfo;

import lombok.Data;

import java.io.Serializable;


/**
 * 创建请求
 *
 * @author lin
 */
@Data
public class UserInterfaceInfoAddRequest implements Serializable {

    /**
     * 调用用户id
     */
    private Long user_id;

    /**
     * 接口id
     */
    private Long interface_info_id;

    /**
     * 总调用次数
     */
    private Integer total_num;

    /**
     * 剩余调用次数
     */
    private Integer left_num;
    private static final long serialVersionUID = 1L;
}