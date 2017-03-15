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
import com.fnps.bs.service.base.FUserGroupService;
import com.fnps.bs.model.base.FUserGroup;
/**
 * FUserGroup模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FUserGroup控制器")
public class FUserGroupController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FUserGroupController.class);
	@Resource
	private FUserGroupService fUserGroupService;
	
	/**
	* 插入
	*/
	@Post(path = "fUserGroups", description = "添加新FUserGroup信息")
	public Json addFUserGroup(@HttpParam(fromJson=true) FUserGroup fUserGroup){
		fUserGroupService.addFUserGroup(fUserGroup);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fUserGroups/:id", description = "查询指定主键的FUserGroup信息")
	public Json getFUserGroup(Integer id){
		fUserGroupService.getFUserGroupById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fUserGroups/:id", description = "更新指定主键的FUserGroup信息")
	public Json updateFUserGroup(@HttpParam(fromJson=true) FUserGroup fUserGroup){
		fUserGroupService.updateFUserGroupById(fUserGroup);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fUserGroups/:id", description = "更新指定主键的FUserGroup信息")
	public Json deleteFUserGroup(Integer id){
		fUserGroupService.deleteFUserGroupById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}