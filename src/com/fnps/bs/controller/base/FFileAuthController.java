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
import com.fnps.bs.service.base.FFileAuthService;
import com.fnps.bs.model.base.FFileAuth;
/**
 * FFileAuth模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FFileAuth控制器")
public class FFileAuthController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FFileAuthController.class);
	@Resource
	private FFileAuthService fFileAuthService;
	
	/**
	* 插入
	*/
	@Post(path = "fFileAuths", description = "添加新FFileAuth信息")
	public Json addFFileAuth(@HttpParam(fromJson=true) FFileAuth fFileAuth){
		fFileAuthService.addFFileAuth(fFileAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fFileAuths/:id", description = "查询指定主键的FFileAuth信息")
	public Json getFFileAuth(Integer id){
		fFileAuthService.getFFileAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fFileAuths/:id", description = "更新指定主键的FFileAuth信息")
	public Json updateFFileAuth(@HttpParam(fromJson=true) FFileAuth fFileAuth){
		fFileAuthService.updateFFileAuthById(fFileAuth);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fFileAuths/:id", description = "更新指定主键的FFileAuth信息")
	public Json deleteFFileAuth(Integer id){
		fFileAuthService.deleteFFileAuthById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}