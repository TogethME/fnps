package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FRole;

/**
 * FRole模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FRoleService{

	/**
	 * 查询FRole详情
	 */
	FRole getFRoleById(Integer id);
	
	/**
	 * 删除FRole对象
	 */
	void deleteFRoleById(Integer id);
	
	/**
	 * 更新FRole对象
	 */
	void updateFRoleById(FRole fRole);
	
	/**
	 * 添加FRole对象
	 */
	void addFRole(FRole fRole);

}