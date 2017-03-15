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
import com.fnps.bs.service.base.FAuthFuncService;
import com.fnps.bs.model.base.FAuthFunc;
/**
 * FAuthFunc模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FAuthFunc控制器")
public class FAuthFuncController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FAuthFuncController.class);
	@Resource
	private FAuthFuncService fAuthFuncService;
	
	/**
	* 插入
	*/
	@Post(path = "fAuthFuncs", description = "添加新FAuthFunc信息")
	public Json addFAuthFunc(@HttpParam(fromJson=true) FAuthFunc fAuthFunc){
		fAuthFuncService.addFAuthFunc(fAuthFunc);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fAuthFuncs/:id", description = "查询指定主键的FAuthFunc信息")
	public Json getFAuthFunc(Integer id){
		fAuthFuncService.getFAuthFuncById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fAuthFuncs/:id", description = "更新指定主键的FAuthFunc信息")
	public Json updateFAuthFunc(@HttpParam(fromJson=true) FAuthFunc fAuthFunc){
		fAuthFuncService.updateFAuthFuncById(fAuthFunc);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fAuthFuncs/:id", description = "更新指定主键的FAuthFunc信息")
	public Json deleteFAuthFunc(Integer id){
		fAuthFuncService.deleteFAuthFuncById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}