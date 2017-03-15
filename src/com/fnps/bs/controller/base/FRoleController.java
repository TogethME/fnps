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
import com.fnps.bs.service.base.FRoleService;
import com.fnps.bs.model.base.FRole;
/**
 * FRole模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FRole控制器")
public class FRoleController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FRoleController.class);
	@Resource
	private FRoleService fRoleService;
	
	/**
	* 插入
	*/
	@Post(path = "fRoles", description = "添加新FRole信息")
	public Json addFRole(@HttpParam(fromJson=true) FRole fRole){
		fRoleService.addFRole(fRole);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fRoles/:id", description = "查询指定主键的FRole信息")
	public Json getFRole(Integer id){
		fRoleService.getFRoleById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fRoles/:id", description = "更新指定主键的FRole信息")
	public Json updateFRole(@HttpParam(fromJson=true) FRole fRole){
		fRoleService.updateFRoleById(fRole);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fRoles/:id", description = "更新指定主键的FRole信息")
	public Json deleteFRole(Integer id){
		fRoleService.deleteFRoleById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}