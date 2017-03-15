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
import com.fnps.bs.service.base.FMenuService;
import com.fnps.bs.model.base.FMenu;
/**
 * FMenu模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FMenu控制器")
public class FMenuController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FMenuController.class);
	@Resource
	private FMenuService fMenuService;
	
	/**
	* 插入
	*/
	@Post(path = "fMenus", description = "添加新FMenu信息")
	public Json addFMenu(@HttpParam(fromJson=true) FMenu fMenu){
		fMenuService.addFMenu(fMenu);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fMenus/:id", description = "查询指定主键的FMenu信息")
	public Json getFMenu(Integer id){
		fMenuService.getFMenuById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fMenus/:id", description = "更新指定主键的FMenu信息")
	public Json updateFMenu(@HttpParam(fromJson=true) FMenu fMenu){
		fMenuService.updateFMenuById(fMenu);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fMenus/:id", description = "更新指定主键的FMenu信息")
	public Json deleteFMenu(Integer id){
		fMenuService.deleteFMenuById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}