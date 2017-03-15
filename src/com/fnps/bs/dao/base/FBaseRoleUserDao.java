package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FBaseRoleUser;

/**
 * FBaseRoleUser模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FBaseRoleUserDao{

	/**
	 * 查询FBaseRoleUser详情
	 */
	FBaseRoleUser getFBaseRoleUserById(Integer id);
	
	/**
	 * 删除FBaseRoleUser对象
	 */
	void deleteFBaseRoleUserById(Integer id);
	
	/**
	 * 更新FBaseRoleUser对象
	 */
	void updateFBaseRoleUserById(FBaseRoleUser fBaseRoleUser);
	
	/**
	 * 添加FBaseRoleUser对象
	 */
	void addFBaseRoleUser(FBaseRoleUser fBaseRoleUser);

}