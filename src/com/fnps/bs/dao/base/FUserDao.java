package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FUser;

/**
 * FUser模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FUserDao{

	/**
	 * 查询FUser详情
	 */
	FUser getFUserById(Integer id);
	
	/**
	 * 删除FUser对象
	 */
	void deleteFUserById(Integer id);
	
	/**
	 * 更新FUser对象
	 */
	void updateFUserById(FUser fUser);
	
	/**
	 * 添加FUser对象
	 */
	void addFUser(FUser fUser);

}