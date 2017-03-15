package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FRoleAuth;

/**
 * FRoleAuth模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FRoleAuthDao{

	/**
	 * 查询FRoleAuth详情
	 */
	FRoleAuth getFRoleAuthById(Integer id);
	
	/**
	 * 删除FRoleAuth对象
	 */
	void deleteFRoleAuthById(Integer id);
	
	/**
	 * 更新FRoleAuth对象
	 */
	void updateFRoleAuthById(FRoleAuth fRoleAuth);
	
	/**
	 * 添加FRoleAuth对象
	 */
	void addFRoleAuth(FRoleAuth fRoleAuth);

}