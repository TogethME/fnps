package com.fnps.bs.service.base;

import java.util.List;

import com.fnps.bs.model.base.CustomerBoom;
import com.fnps.bs.dao.base.CustomerBoomDao;
import com.fnps.bs.service.base.CustomerBoomService;

import cn.jfast.framework.web.annotation.Resource;

/**
 * CustomerBoom模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="customerBoomService")
public class CustomerBoomServiceImpl implements CustomerBoomService{
	
	@Resource
	private CustomerBoomDao customerBoomDao;
	/**
	 * 查询CustomerBoom详情
	 */
	public CustomerBoom getCustomerBoomById(Integer id){
		return customerBoomDao.getCustomerBoomById(id);
	}
	/**
	 * 查询CustomerBoom详情
	 */
	public List<CustomerBoom> getAllCustomerBoom(){
		return customerBoomDao.getCustomerBoom();
	}
	
	/**
	 * 删除CustomerBoom对象
	 */
	public void deleteCustomerBoomById(Integer id){
		customerBoomDao.deleteCustomerBoomById(id);
	}
	
	/**
	 * 更新CustomerBoom对象
	 */
	public void updateCustomerBoomById(CustomerBoom customerBoom){
		customerBoomDao.updateCustomerBoomById(customerBoom);
	}
	
	/**
	 * 添加CustomerBoom对象
	 */
	public void addCustomerBoom(CustomerBoom customerBoom){
		customerBoomDao.addCustomerBoom(customerBoom);
	}
}