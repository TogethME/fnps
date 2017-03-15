package com.fnps.bs.controller.base;

import cn.jfast.framework.log.LogFactory;
import cn.jfast.framework.log.LogType;
import cn.jfast.framework.log.Logger;
import cn.jfast.framework.web.annotation.Api;
import cn.jfast.framework.web.annotation.Get;
import cn.jfast.framework.web.annotation.HttpParam;
import cn.jfast.framework.web.annotation.Post;
import cn.jfast.framework.web.annotation.Put;
import cn.jfast.framework.web.annotation.Delete;
import cn.jfast.framework.web.annotation.Resource;
import cn.jfast.framework.web.view.viewtype.Json;
import com.fnps.bs.service.base.FBaseRoleUserService;
import com.fnps.bs.model.base.FBaseRoleUser;
/**
 * FBaseRoleUser模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FBaseRoleUser控制器")
public class FBaseRoleUserController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FBaseRoleUserController.class);
	@Resource
	private FBaseRoleUserService fBaseRoleUserService;
	
	/**
	* 插入
	*/
	@Post(path = "fBaseRoleUsers", description = "添加新FBaseRoleUser信息")
	public Json addFBaseRoleUser(@HttpParam(fromJson=true) FBaseRoleUser fBaseRoleUser){
		fBaseRoleUserService.addFBaseRoleUser(fBaseRoleUser);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fBaseRoleUsers/:id", description = "查询指定主键的FBaseRoleUser信息")
	public Json getFBaseRoleUser(Integer id){
		fBaseRoleUserService.getFBaseRoleUserById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fBaseRoleUsers/:id", description = "更新指定主键的FBaseRoleUser信息")
	public Json updateFBaseRoleUser(@HttpParam(fromJson=true) FBaseRoleUser fBaseRoleUser){
		fBaseRoleUserService.updateFBaseRoleUserById(fBaseRoleUser);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fBaseRoleUsers/:id", description = "更新指定主键的FBaseRoleUser信息")
	public Json deleteFBaseRoleUser(Integer id){
		fBaseRoleUserService.deleteFBaseRoleUserById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}