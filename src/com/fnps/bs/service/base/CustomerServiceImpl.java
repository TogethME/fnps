package com.fnps.bs.service.base;

import com.fnps.bs.model.base.Customer;
import com.fnps.bs.dao.base.CustomerDao;
import com.fnps.bs.service.base.CustomerService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * Customer模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="customerService")
public class CustomerServiceImpl implements CustomerService{
	
	@Resource
	private CustomerDao customerDao;
	/**
	 * 查询Customer详情
	 */
	public Customer getCustomerById(Integer id){
		return customerDao.getCustomerById(id);
	}
	
	/**
	 * 删除Customer对象
	 */
	public void deleteCustomerById(Integer id){
		customerDao.deleteCustomerById(id);
	}
	
	/**
	 * 更新Customer对象
	 */
	public void updateCustomerById(Customer customer){
		customerDao.updateCustomerById(customer);
	}
	
	/**
	 * 添加Customer对象
	 */
	public void addCustomer(Customer customer){
		customerDao.addCustomer(customer);
	}

}