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
import com.fnps.bs.service.base.FFileService;
import com.fnps.bs.model.base.FFile;
/**
 * FFile模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FFile控制器")
public class FFileController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FFileController.class);
	@Resource
	private FFileService fFileService;
	
	/**
	* 插入
	*/
	@Post(path = "fFiles", description = "添加新FFile信息")
	public Json addFFile(@HttpParam(fromJson=true) FFile fFile){
		fFileService.addFFile(fFile);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fFiles/:id", description = "查询指定主键的FFile信息")
	public Json getFFile(Integer id){
		fFileService.getFFileById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fFiles/:id", description = "更新指定主键的FFile信息")
	public Json updateFFile(@HttpParam(fromJson=true) FFile fFile){
		fFileService.updateFFileById(fFile);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fFiles/:id", description = "更新指定主键的FFile信息")
	public Json deleteFFile(Integer id){
		fFileService.deleteFFileById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}