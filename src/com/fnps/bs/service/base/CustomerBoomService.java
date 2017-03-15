package com.fnps.bs.service.base;

import java.util.List;

import com.fnps.bs.model.base.CustomerBoom;

/**
 * CustomerBoom模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface CustomerBoomService{

	/**
	 * 查询CustomerBoom详情
	 */
	CustomerBoom getCustomerBoomById(Integer id);
	/**
	 * 查询CustomerBoom详情
	 */
	List<CustomerBoom> getAllCustomerBoom();
	
	/**
	 * 删除CustomerBoom对象
	 */
	void deleteCustomerBoomById(Integer id);
	
	/**
	 * 更新CustomerBoom对象
	 */
	void updateCustomerBoomById(CustomerBoom customerBoom);
	
	/**
	 * 添加CustomerBoom对象
	 */
	void addCustomerBoom(CustomerBoom customerBoom);

}