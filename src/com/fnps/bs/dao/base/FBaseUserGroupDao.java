package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FBaseUserGroup;

/**
 * FBaseUserGroup模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FBaseUserGroupDao{

	/**
	 * 查询FBaseUserGroup详情
	 */
	FBaseUserGroup getFBaseUserGroupById(Integer id);
	
	/**
	 * 删除FBaseUserGroup对象
	 */
	void deleteFBaseUserGroupById(Integer id);
	
	/**
	 * 更新FBaseUserGroup对象
	 */
	void updateFBaseUserGroupById(FBaseUserGroup fBaseUserGroup);
	
	/**
	 * 添加FBaseUserGroup对象
	 */
	void addFBaseUserGroup(FBaseUserGroup fBaseUserGroup);

}