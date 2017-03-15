package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.Customer;
import com.fnps.bs.dao.base.CustomerDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * Customer模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="customerDao")
public class CustomerDaoImpl implements CustomerDao{

	/**
	 * 查询Customer详情
	 */
	public Customer getCustomerById(Integer id){
		return null;
	}
	
	/**
	 * 删除Customer对象
	 */
	public void deleteCustomerById(Integer id){
		
	}
	
	/**
	 * 更新Customer对象
	 */
	public void updateCustomerById(Customer customer){
		
	}
	
	/**
	 * 添加Customer对象
	 */
	public void addCustomer(Customer customer){
		
	}

}