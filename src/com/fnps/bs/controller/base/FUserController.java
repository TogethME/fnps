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
import com.fnps.bs.service.base.FUserService;
import com.fnps.bs.model.base.FUser;
/**
 * FUser模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FUser控制器")
public class FUserController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FUserController.class);
	@Resource
	private FUserService fUserService;
	
	/**
	* 插入
	*/
	@Post(path = "fUsers", description = "添加新FUser信息")
	public Json addFUser(@HttpParam(fromJson=true) FUser fUser){
		fUserService.addFUser(fUser);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fUsers/:id", description = "查询指定主键的FUser信息")
	public Json getFUser(Integer id){
		fUserService.getFUserById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fUsers/:id", description = "更新指定主键的FUser信息")
	public Json updateFUser(@HttpParam(fromJson=true) FUser fUser){
		fUserService.updateFUserById(fUser);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fUsers/:id", description = "更新指定主键的FUser信息")
	public Json deleteFUser(Integer id){
		fUserService.deleteFUserById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}