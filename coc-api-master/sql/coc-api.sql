use `coc-api`;
drop table if exists interface_info;

/*==============================================================*/
/* Table: interface_info                                        */
/*==============================================================*/
create table interface_info
(
    id                   bigint not null,
    name                 varchar(256) not null comment '接口名称',
    description          varchar(256) not null comment '描述',
    url                  varchar(512) not null comment '接口地址',
    request_params       text not null comment '请求参数',
    request_header       text not null comment '请求头',
    response_header      text not null comment '响应头',
    status               int not null default 0 comment '接口状态(0-关闭，1-开启)',
    method               varchar(256) not null comment '请求类型',
    user_id              bigint not null comment '创建人',
    create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
    update_time          datetime not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete            tinyint not null default 0 comment '是否删除(0-未删，1-删除)',
    primary key (id)
);

INSERT INTO `coc-api`.`interface_info` (`id`, `name`, `description`, `url`, `request_header`, `response_header`, `status`, `method`, `user_id`, `create_time`, `update_time`, `is_delete`) VALUES (1, '获取今天天气', '只限今天', 'www.baidu.com', 'get', 'get', 0, 'get', 2, '2023-10-09 21:18:18', '2023-10-09 21:18:18', 0);

INSERT INTO `coc-api`.`interface_info` (`id`, `name`, `description`, `url`, `request_header`, `response_header`, `status`, `method`, `user_id`, `create_time`, `update_time`, `is_delete`) VALUES (2, '热污染', '如违反', 'www.baidu.com', '放大', '地方', 0, 'get', 2, '2023-10-09 21:18:18', '2023-10-09 21:18:18', 0);

INSERT INTO `coc-api`.`interface_info` (`id`, `name`, `description`, `url`, `request_header`, `response_header`, `status`, `method`, `user_id`, `create_time`, `update_time`, `is_delete`) VALUES (3, '广泛的', '广泛的', 'www.baidu.com', '给v', '供奉的是', 0, 'get', 2, '2023-10-09 21:18:18', '2023-10-09 21:18:18', 0);

INSERT INTO `coc-api`.`interface_info` (`id`, `name`, `description`, `url`, `request_header`, `response_header`, `status`, `method`, `user_id`, `create_time`, `update_time`, `is_delete`) VALUES (4, '挂树', '太热', 'www.baidu.com', '奇尔', '期望', 0, 'get', 2, '2023-10-09 21:18:18', '2023-10-09 21:18:18', 0);

INSERT INTO `coc-api`.`interface_info` (`id`, `name`, `description`, `url`, `request_header`, `response_header`, `status`, `method`, `user_id`, `create_time`, `update_time`, `is_delete`) VALUES (5, '干撒', '微软', 'www.baidu.com', '请问', '热仍然', 0, 'get', 2, '2023-10-09 21:18:18', '2023-10-09 21:18:18', 0);


use `coc-api`;
drop table if exists user_interface_info;

/*==============================================================*/
/* Table: user_interface_info                                        */
/*==============================================================*/
create table user_interface_info
(
    id                   bigint not null auto_increment comment '主键',
    user_id              bigint not null comment '调用用户id',
    interface_info_id    bigint not null comment '接口id',
    total_num            int not null comment '总调用次数',
    left_num             int not null comment '剩余调用次数',
    status               int not null default 0 comment '接口状态(0-正常，1-禁用)',
    create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
    update_time          datetime not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete            tinyint not null default 0 comment '是否删除(0-未删，1-删除)',

    primary key (id)
);
