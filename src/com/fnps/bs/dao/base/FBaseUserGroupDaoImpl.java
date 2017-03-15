package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FBaseUserGroup;
import com.fnps.bs.dao.base.FBaseUserGroupDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FBaseUserGroup模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fBaseUserGroupDao")
public class FBaseUserGroupDaoImpl implements FBaseUserGroupDao{

	/**
	 * 查询FBaseUserGroup详情
	 */
	public FBaseUserGroup getFBaseUserGroupById(Integer id){
		return null;
	}
	
	/**
	 * 删除FBaseUserGroup对象
	 */
	public void deleteFBaseUserGroupById(Integer id){
		
	}
	
	/**
	 * 更新FBaseUserGroup对象
	 */
	public void updateFBaseUserGroupById(FBaseUserGroup fBaseUserGroup){
		
	}
	
	/**
	 * 添加FBaseUserGroup对象
	 */
	public void addFBaseUserGroup(FBaseUserGroup fBaseUserGroup){
		
	}

}