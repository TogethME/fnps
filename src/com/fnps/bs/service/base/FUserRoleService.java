package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FUserRole;

/**
 * FUserRole模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FUserRoleService{

	/**
	 * 查询FUserRole详情
	 */
	FUserRole getFUserRoleById(Integer id);
	
	/**
	 * 删除FUserRole对象
	 */
	void deleteFUserRoleById(Integer id);
	
	/**
	 * 更新FUserRole对象
	 */
	void updateFUserRoleById(FUserRole fUserRole);
	
	/**
	 * 添加FUserRole对象
	 */
	void addFUserRole(FUserRole fUserRole);

}