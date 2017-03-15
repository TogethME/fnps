package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.Customer;

/**
 * Customer模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface CustomerDao{

	/**
	 * 查询Customer详情
	 */
	Customer getCustomerById(Integer id);
	
	/**
	 * 删除Customer对象
	 */
	void deleteCustomerById(Integer id);
	
	/**
	 * 更新Customer对象
	 */
	void updateCustomerById(Customer customer);
	
	/**
	 * 添加Customer对象
	 */
	void addCustomer(Customer customer);

}