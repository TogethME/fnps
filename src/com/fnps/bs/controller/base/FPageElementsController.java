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
import com.fnps.bs.service.base.FPageElementsService;
import com.fnps.bs.model.base.FPageElements;
/**
 * FPageElements模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FPageElements控制器")
public class FPageElementsController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FPageElementsController.class);
	@Resource
	private FPageElementsService fPageElementsService;
	
	/**
	* 插入
	*/
	@Post(path = "fPageElementss", description = "添加新FPageElements信息")
	public Json addFPageElements(@HttpParam(fromJson=true) FPageElements fPageElements){
		fPageElementsService.addFPageElements(fPageElements);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fPageElementss/:id", description = "查询指定主键的FPageElements信息")
	public Json getFPageElements(Integer id){
		fPageElementsService.getFPageElementsById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fPageElementss/:id", description = "更新指定主键的FPageElements信息")
	public Json updateFPageElements(@HttpParam(fromJson=true) FPageElements fPageElements){
		fPageElementsService.updateFPageElementsById(fPageElements);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fPageElementss/:id", description = "更新指定主键的FPageElements信息")
	public Json deleteFPageElements(Integer id){
		fPageElementsService.deleteFPageElementsById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}