package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FUserRole;
import com.fnps.bs.dao.base.FUserRoleDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FUserRole模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fUserRoleDao")
public class FUserRoleDaoImpl implements FUserRoleDao{

	/**
	 * 查询FUserRole详情
	 */
	public FUserRole getFUserRoleById(Integer id){
		return null;
	}
	
	/**
	 * 删除FUserRole对象
	 */
	public void deleteFUserRoleById(Integer id){
		
	}
	
	/**
	 * 更新FUserRole对象
	 */
	public void updateFUserRoleById(FUserRole fUserRole){
		
	}
	
	/**
	 * 添加FUserRole对象
	 */
	public void addFUserRole(FUserRole fUserRole){
		
	}

}