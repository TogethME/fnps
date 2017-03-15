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
import com.fnps.bs.service.base.FLoginMeterService;
import com.fnps.bs.model.base.FLoginMeter;
/**
 * FLoginMeter模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "FLoginMeter控制器")
public class FLoginMeterController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,FLoginMeterController.class);
	@Resource
	private FLoginMeterService fLoginMeterService;
	
	/**
	* 插入
	*/
	@Post(path = "fLoginMeters", description = "添加新FLoginMeter信息")
	public Json addFLoginMeter(@HttpParam(fromJson=true) FLoginMeter fLoginMeter){
		fLoginMeterService.addFLoginMeter(fLoginMeter);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "fLoginMeters/:id", description = "查询指定主键的FLoginMeter信息")
	public Json getFLoginMeter(Integer id){
		fLoginMeterService.getFLoginMeterById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "fLoginMeters/:id", description = "更新指定主键的FLoginMeter信息")
	public Json updateFLoginMeter(@HttpParam(fromJson=true) FLoginMeter fLoginMeter){
		fLoginMeterService.updateFLoginMeterById(fLoginMeter);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "fLoginMeters/:id", description = "更新指定主键的FLoginMeter信息")
	public Json deleteFLoginMeter(Integer id){
		fLoginMeterService.deleteFLoginMeterById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}