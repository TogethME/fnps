package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FUserGroup;
import com.fnps.bs.dao.base.FUserGroupDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FUserGroup模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fUserGroupDao")
public class FUserGroupDaoImpl implements FUserGroupDao{

	/**
	 * 查询FUserGroup详情
	 */
	public FUserGroup getFUserGroupById(Integer id){
		return null;
	}
	
	/**
	 * 删除FUserGroup对象
	 */
	public void deleteFUserGroupById(Integer id){
		
	}
	
	/**
	 * 更新FUserGroup对象
	 */
	public void updateFUserGroupById(FUserGroup fUserGroup){
		
	}
	
	/**
	 * 添加FUserGroup对象
	 */
	public void addFUserGroup(FUserGroup fUserGroup){
		
	}

}