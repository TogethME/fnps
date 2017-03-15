package com.fnps.bs.dao.base;

import java.util.List;

import cn.jfast.framework.jdbc.annotation.Dao;

import com.fnps.bs.model.base.CustomerBoom;

/**
 * CustomerBoom模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface CustomerBoomDao{

	/**
	 * 查询CustomerBoom详情
	 */
	CustomerBoom getCustomerBoomById(Integer id);
	
	/**
	 * 查询CustomerBoom详情
	 */
	List<CustomerBoom> getCustomerBoom();
	
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