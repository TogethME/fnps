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
import com.fnps.bs.service.base.CustomerBoomService;
import com.fnps.bs.model.base.CustomerBoom;
/**
 * CustomerBoom模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "CustomerBoom控制器")
public class CustomerBoomController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,CustomerBoomController.class);
	@Resource
	private CustomerBoomService customerBoomService;
	
	/**
	* 插入
	*/
	@Post(path = "customerBooms", description = "添加新CustomerBoom信息")
	public Json addCustomerBoom(@HttpParam(fromJson=true) CustomerBoom customerBoom){
		customerBoomService.addCustomerBoom(customerBoom);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "customerBooms/:id", description = "查询指定主键的CustomerBoom信息")
	public Json getCustomerBoom(Integer id){
		customerBoomService.getCustomerBoomById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	/**
	 * 查询
	 */
	@Get(path = "allCustomerBooms", description = "查询指定主键的CustomerBoom信息")
	public Json getAllCustomerBoom(){
		customerBoomService.getAllCustomerBoom();
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "customerBooms/:id", description = "更新指定主键的CustomerBoom信息")
	public Json updateCustomerBoom(@HttpParam(fromJson=true) CustomerBoom customerBoom){
		customerBoomService.updateCustomerBoomById(customerBoom);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "customerBooms/:id", description = "更新指定主键的CustomerBoom信息")
	public Json deleteCustomerBoom(Integer id){
		customerBoomService.deleteCustomerBoomById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}