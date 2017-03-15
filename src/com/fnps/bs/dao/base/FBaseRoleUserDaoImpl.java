package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FBaseRoleUser;
import com.fnps.bs.dao.base.FBaseRoleUserDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FBaseRoleUser模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fBaseRoleUserDao")
public class FBaseRoleUserDaoImpl implements FBaseRoleUserDao{

	/**
	 * 查询FBaseRoleUser详情
	 */
	public FBaseRoleUser getFBaseRoleUserById(Integer id){
		return null;
	}
	
	/**
	 * 删除FBaseRoleUser对象
	 */
	public void deleteFBaseRoleUserById(Integer id){
		
	}
	
	/**
	 * 更新FBaseRoleUser对象
	 */
	public void updateFBaseRoleUserById(FBaseRoleUser fBaseRoleUser){
		
	}
	
	/**
	 * 添加FBaseRoleUser对象
	 */
	public void addFBaseRoleUser(FBaseRoleUser fBaseRoleUser){
		
	}

}