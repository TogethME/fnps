package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FMenuAuth;
import com.fnps.bs.dao.base.FMenuAuthDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FMenuAuth模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fMenuAuthDao")
public class FMenuAuthDaoImpl implements FMenuAuthDao{

	/**
	 * 查询FMenuAuth详情
	 */
	public FMenuAuth getFMenuAuthById(Integer id){
		return null;
	}
	
	/**
	 * 删除FMenuAuth对象
	 */
	public void deleteFMenuAuthById(Integer id){
		
	}
	
	/**
	 * 更新FMenuAuth对象
	 */
	public void updateFMenuAuthById(FMenuAuth fMenuAuth){
		
	}
	
	/**
	 * 添加FMenuAuth对象
	 */
	public void addFMenuAuth(FMenuAuth fMenuAuth){
		
	}

}