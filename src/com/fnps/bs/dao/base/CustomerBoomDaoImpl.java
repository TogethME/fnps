package com.fnps.bs.dao.base;

import java.util.List;

import com.fnps.bs.model.base.CustomerBoom;
import com.fnps.bs.dao.base.CustomerBoomDao;

import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * CustomerBoom模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="customerBoomDao")
public class CustomerBoomDaoImpl implements CustomerBoomDao{

	/**
	 * 查询CustomerBoom详情
	 */
	public CustomerBoom getCustomerBoomById(Integer id){
		return null;
	}
	
	/**
	 * 删除CustomerBoom对象
	 */
	public void deleteCustomerBoomById(Integer id){
		
	}
	
	/**
	 * 更新CustomerBoom对象
	 */
	public void updateCustomerBoomById(CustomerBoom customerBoom){
		
	}
	
	/**
	 * 添加CustomerBoom对象
	 */
	public void addCustomerBoom(CustomerBoom customerBoom){
		
	}

	@Override
	public List<CustomerBoom> getCustomerBoom() {
		// TODO Auto-generated method stub
		return null;
	}

}