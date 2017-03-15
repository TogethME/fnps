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
import com.fnps.bs.service.base.FUserRoleService;
import com.fnps.bs.model.base.FUserRole;
/**
 * FUserRole模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FUserRole控制器")
public class FUserRoleController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FUserRoleController.class);
	@Resource
	private FUserRoleService fUserRoleService;
	
	/**
	* 插入
	*/
	@Post(path = "fUserRoles", description = "添加新FUserRole信息")
	public Json addFUserRole(@HttpParam(fromJson=true) FUserRole fUserRole){
		fUserRoleService.addFUserRole(fUserRole);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fUserRoles/:id", description = "查询指定主键的FUserRole信息")
	public Json getFUserRole(Integer id){
		fUserRoleService.getFUserRoleById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fUserRoles/:id", description = "更新指定主键的FUserRole信息")
	public Json updateFUserRole(@HttpParam(fromJson=true) FUserRole fUserRole){
		fUserRoleService.updateFUserRoleById(fUserRole);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fUserRoles/:id", description = "更新指定主键的FUserRole信息")
	public Json deleteFUserRole(Integer id){
		fUserRoleService.deleteFUserRoleById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}