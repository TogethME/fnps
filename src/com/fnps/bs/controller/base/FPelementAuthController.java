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
import com.fnps.bs.service.base.FPelementAuthService;
import com.fnps.bs.model.base.FPelementAuth;
/**
 * FPelementAuth模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FPelementAuth控制器")
public class FPelementAuthController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FPelementAuthController.class);
	@Resource
	private FPelementAuthService fPelementAuthService;
	
	/**
	* 插入
	*/
	@Post(path = "fPelementAuths", description = "添加新FPelementAuth信息")
	public Json addFPelementAuth(@HttpParam(fromJson=true) FPelementAuth fPelementAuth){
		fPelementAuthService.addFPelementAuth(fPelementAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fPelementAuths/:id", description = "查询指定主键的FPelementAuth信息")
	public Json getFPelementAuth(Integer id){
		fPelementAuthService.getFPelementAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fPelementAuths/:id", description = "更新指定主键的FPelementAuth信息")
	public Json updateFPelementAuth(@HttpParam(fromJson=true) FPelementAuth fPelementAuth){
		fPelementAuthService.updateFPelementAuthById(fPelementAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fPelementAuths/:id", description = "更新指定主键的FPelementAuth信息")
	public Json deleteFPelementAuth(Integer id){
		fPelementAuthService.deleteFPelementAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}