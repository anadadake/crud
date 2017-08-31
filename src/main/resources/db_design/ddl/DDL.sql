
create table t_dictionary
(
	ID int auto_increment comment '物理主键'
		primary key,
	DICT_CODE varchar(15) not null comment '字典代码',
	DICT_NAME varchar(45) not null comment '字典名称',
	PARENT_CODE varchar(15) null comment '父字典代码',
	DICT_SEQUENCE tinyint(3) not null comment '字典顺序'
)
comment '字典表'
;

create table t_function
(
	ID int auto_increment comment '物理主键'
		primary key,
	FUNC_CODE varchar(15) not null comment '功能代码',
	FUNC_NAME varchar(45) not null comment '功能名称',
	PARENT_CODE varchar(15) null comment '父功能代码',
	FUNC_LEVEL tinyint(1) not null comment '功能层级',
	FUNC_SEQUENCE tinyint(3) not null comment '同级功能中的次序',
	FUNC_URL text null comment '功能访问地址',
	IS_ACTIVE tinyint(1) default '1' not null comment '是否有效',
	IS_SHOW_IN_MENU tinyint(1) default '0' not null comment '是否在菜单中显示',
	ICON tinytext null comment '图标地址',
	IS_MOBILE tinyint(1) null
)
comment '功能表'
;

create table t_organization
(
	ID int auto_increment comment '物理主键'
		primary key,
	ORG_CODE varchar(15) not null comment '组织代码',
	IS_DELETED tinyint(1) default '0' not null comment '是否逻辑删除（0：否；1：是）',
	ORG_NAME varchar(75) not null comment '组织名称',
	ORG_DESC tinytext null comment '组织描述',
	PARENT_ORG_CODE varchar(15) null comment '父组织代码',
	ORG_SEQUENCE tinyint(3) not null comment '同级组织内该组织的顺序',
	ORG_TYPE_CODE varchar(45) null comment '组织类型代码',
	CREATE_USER varchar(15) not null comment '创建用户',
	CREATE_TIME datetime not null comment '创建时间',
	UPDATE_USER varchar(15) not null comment '更新用户',
	UPDATE_TIME timestamp default CURRENT_TIMESTAMP not null comment '更新时间'
)
comment '组织架构表'
;


create table t_role
(
	ID int auto_increment
		primary key,
	ROLE_CODE varchar(15) not null comment '角色代码',
	ROLE_NAME varchar(45) not null comment '角色名称'
)
comment '角色表'
;


create table t_role_func
(
	ID int auto_increment
		primary key,
	ROLE_CODE varchar(15) not null comment '角色代码',
	FUNC_CODE varchar(15) not null comment '功能代码'
)
comment '角色功能表'
;



create table t_user
(
	ID int auto_increment comment '物理主键'
		primary key,
	USER_NO varchar(15) not null,
	PASSWORD text not null,
	MOBILE_PHONE varchar(45) not null,
	EMAIL varchar(45) not null,
	CREATE_USER varchar(15) not null,
	CREATE_TIME datetime not null,
	UPDATE_USER varchar(15) not null,
	UPDATE_TIME timestamp default CURRENT_TIMESTAMP not null
)
comment '用户表'
;


create table t_user_info
(
	ID int auto_increment
		primary key,
	USER_NO varchar(15) null,
	USER_NAME_CN varchar(45) null,
	USER_NAME_EN varchar(45) null,
	GENDER varchar(15) null
)
comment '用户信息表'
;

create table t_user_org
(
	ID int auto_increment
		primary key,
	USER_NO varchar(15) not null comment '用户编号',
	ORG_CODE varchar(15) not null comment '组织代码'
)
comment '用户组织表'
;


create table t_user_role
(
	ID int auto_increment comment '物理主键'
		primary key,
	USER_NO varchar(15) not null comment '员工编号',
	ROLE_CODE varchar(45) not null comment '角色代码'
)
comment '用户角色表'
;

