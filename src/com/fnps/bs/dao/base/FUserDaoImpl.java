package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FUser;
import com.fnps.bs.dao.base.FUserDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FUser模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fUserDao")
public class FUserDaoImpl implements FUserDao{

	/**
	 * 查询FUser详情
	 */
	public FUser getFUserById(Integer id){
		return null;
	}
	
	/**
	 * 删除FUser对象
	 */
	public void deleteFUserById(Integer id){
		
	}
	
	/**
	 * 更新FUser对象
	 */
	public void updateFUserById(FUser fUser){
		
	}
	
	/**
	 * 添加FUser对象
	 */
	public void addFUser(FUser fUser){
		
	}

}