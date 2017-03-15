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
import com.fnps.bs.service.base.FFunctionService;
import com.fnps.bs.model.base.FFunction;
/**
 * FFunction模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FFunction控制器")
public class FFunctionController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FFunctionController.class);
	@Resource
	private FFunctionService fFunctionService;
	
	/**
	* 插入
	*/
	@Post(path = "fFunctions", description = "添加新FFunction信息")
	public Json addFFunction(@HttpParam(fromJson=true) FFunction fFunction){
		fFunctionService.addFFunction(fFunction);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fFunctions/:id", description = "查询指定主键的FFunction信息")
	public Json getFFunction(Integer id){
		fFunctionService.getFFunctionById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fFunctions/:id", description = "更新指定主键的FFunction信息")
	public Json updateFFunction(@HttpParam(fromJson=true) FFunction fFunction){
		fFunctionService.updateFFunctionById(fFunction);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fFunctions/:id", description = "更新指定主键的FFunction信息")
	public Json deleteFFunction(Integer id){
		fFunctionService.deleteFFunctionById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}