package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FUserGroup;

/**
 * FUserGroup模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FUserGroupService{

	/**
	 * 查询FUserGroup详情
	 */
	FUserGroup getFUserGroupById(Integer id);
	
	/**
	 * 删除FUserGroup对象
	 */
	void deleteFUserGroupById(Integer id);
	
	/**
	 * 更新FUserGroup对象
	 */
	void updateFUserGroupById(FUserGroup fUserGroup);
	
	/**
	 * 添加FUserGroup对象
	 */
	void addFUserGroup(FUserGroup fUserGroup);

}