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
import com.fnps.bs.service.base.CustomerService;
import com.fnps.bs.model.base.Customer;
/**
 * Customer模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "Customer控制器")
public class CustomerController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,CustomerController.class);
	@Resource
	private CustomerService customerService;
	
	/**
	* 插入
	*/
	@Post(path = "customers", description = "添加新Customer信息")
	public Json addCustomer(@HttpParam(fromJson=true) Customer customer){
		customerService.addCustomer(customer);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "customers/:id", description = "查询指定主键的Customer信息")
	public Json getCustomer(Integer id){
		customerService.getCustomerById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "customers/:id", description = "更新指定主键的Customer信息")
	public Json updateCustomer(@HttpParam(fromJson=true) Customer customer){
		customerService.updateCustomerById(customer);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "customers/:id", description = "更新指定主键的Customer信息")
	public Json deleteCustomer(Integer id){
		customerService.deleteCustomerById(id);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}