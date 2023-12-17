package com.lin.cocapibackend.model.dto.interfaceinfo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.lin.cocapibackend.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * 查询请求
 *
 * @author lin
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * 接口名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 扣除积分数
     */
    private Long reduceScore;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 接口状态(0-关闭，1-开启)
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}