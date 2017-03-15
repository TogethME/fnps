package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FRole;
import com.fnps.bs.dao.base.FRoleDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FRole模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fRoleDao")
public class FRoleDaoImpl implements FRoleDao{

	/**
	 * 查询FRole详情
	 */
	public FRole getFRoleById(Integer id){
		return null;
	}
	
	/**
	 * 删除FRole对象
	 */
	public void deleteFRoleById(Integer id){
		
	}
	
	/**
	 * 更新FRole对象
	 */
	public void updateFRoleById(FRole fRole){
		
	}
	
	/**
	 * 添加FRole对象
	 */
	public void addFRole(FRole fRole){
		
	}

}