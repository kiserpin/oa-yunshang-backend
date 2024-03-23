package com.kmun.model.system;

import com.kmun.model.base.BaseEntity;
//这个注解是mybatis-plus的注解，用来指定数据库中的表名
import com.baomidou.mybatisplus.annotation.TableField;
//这个注解是mybatis-plus的注解，用来指定数据库中的表名
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

//这个注解是lombok的注解，用来自动生成getter和setter方法
@Data
//这个注解是mybatis-plus的注解，用来指定数据库中的表名
@TableName("sys_role")
//系统角色类
public class SysRole extends BaseEntity{
	private static final long serialVersionUID = 1L;
	//角色名称 属性名和数据库字段名一致
	@TableField("role_name")
	private String roleName;

	//角色编码
	@TableField("role_code")
	private String roleCode;

	//描述
	@TableField("description")
	private String description;

}

