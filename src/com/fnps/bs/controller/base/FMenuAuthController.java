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
import com.fnps.bs.service.base.FMenuAuthService;
import com.fnps.bs.model.base.FMenuAuth;
/**
 * FMenuAuth模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FMenuAuth控制器")
public class FMenuAuthController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FMenuAuthController.class);
	@Resource
	private FMenuAuthService fMenuAuthService;
	
	/**
	* 插入
	*/
	@Post(path = "fMenuAuths", description = "添加新FMenuAuth信息")
	public Json addFMenuAuth(@HttpParam(fromJson=true) FMenuAuth fMenuAuth){
		fMenuAuthService.addFMenuAuth(fMenuAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fMenuAuths/:id", description = "查询指定主键的FMenuAuth信息")
	public Json getFMenuAuth(Integer id){
		fMenuAuthService.getFMenuAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fMenuAuths/:id", description = "更新指定主键的FMenuAuth信息")
	public Json updateFMenuAuth(@HttpParam(fromJson=true) FMenuAuth fMenuAuth){
		fMenuAuthService.updateFMenuAuthById(fMenuAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fMenuAuths/:id", description = "更新指定主键的FMenuAuth信息")
	public Json deleteFMenuAuth(Integer id){
		fMenuAuthService.deleteFMenuAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}