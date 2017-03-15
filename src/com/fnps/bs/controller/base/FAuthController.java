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
import com.fnps.bs.service.base.FAuthService;
import com.fnps.bs.model.base.FAuth;
/**
 * FAuth模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FAuth控制器")
public class FAuthController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FAuthController.class);
	@Resource
	private FAuthService fAuthService;
	
	/**
	* 插入
	*/
	@Post(path = "fAuths", description = "添加新FAuth信息")
	public Json addFAuth(@HttpParam(fromJson=true) FAuth fAuth){
		fAuthService.addFAuth(fAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fAuths/:id", description = "查询指定主键的FAuth信息")
	public Json getFAuth(Integer id){
		fAuthService.getFAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fAuths/:id", description = "更新指定主键的FAuth信息")
	public Json updateFAuth(@HttpParam(fromJson=true) FAuth fAuth){
		fAuthService.updateFAuthById(fAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fAuths/:id", description = "更新指定主键的FAuth信息")
	public Json deleteFAuth(Integer id){
		fAuthService.deleteFAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}