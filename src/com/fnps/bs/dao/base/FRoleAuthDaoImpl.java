package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FRoleAuth;
import com.fnps.bs.dao.base.FRoleAuthDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FRoleAuth模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fRoleAuthDao")
public class FRoleAuthDaoImpl implements FRoleAuthDao{

	/**
	 * 查询FRoleAuth详情
	 */
	public FRoleAuth getFRoleAuthById(Integer id){
		return null;
	}
	
	/**
	 * 删除FRoleAuth对象
	 */
	public void deleteFRoleAuthById(Integer id){
		
	}
	
	/**
	 * 更新FRoleAuth对象
	 */
	public void updateFRoleAuthById(FRoleAuth fRoleAuth){
		
	}
	
	/**
	 * 添加FRoleAuth对象
	 */
	public void addFRoleAuth(FRoleAuth fRoleAuth){
		
	}

}