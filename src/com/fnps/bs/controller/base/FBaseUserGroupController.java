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
import com.fnps.bs.service.base.FBaseUserGroupService;
import com.fnps.bs.model.base.FBaseUserGroup;
/**
 * FBaseUserGroup模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FBaseUserGroup控制器")
public class FBaseUserGroupController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FBaseUserGroupController.class);
	@Resource
	private FBaseUserGroupService fBaseUserGroupService;
	
	/**
	* 插入
	*/
	@Post(path = "fBaseUserGroups", description = "添加新FBaseUserGroup信息")
	public Json addFBaseUserGroup(@HttpParam(fromJson=true) FBaseUserGroup fBaseUserGroup){
		fBaseUserGroupService.addFBaseUserGroup(fBaseUserGroup);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fBaseUserGroups/:id", description = "查询指定主键的FBaseUserGroup信息")
	public Json getFBaseUserGroup(Integer id){
		fBaseUserGroupService.getFBaseUserGroupById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fBaseUserGroups/:id", description = "更新指定主键的FBaseUserGroup信息")
	public Json updateFBaseUserGroup(@HttpParam(fromJson=true) FBaseUserGroup fBaseUserGroup){
		fBaseUserGroupService.updateFBaseUserGroupById(fBaseUserGroup);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fBaseUserGroups/:id", description = "更新指定主键的FBaseUserGroup信息")
	public Json deleteFBaseUserGroup(Integer id){
		fBaseUserGroupService.deleteFBaseUserGroupById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}