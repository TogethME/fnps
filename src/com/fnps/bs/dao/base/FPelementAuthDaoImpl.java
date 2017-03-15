package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FPelementAuth;
import com.fnps.bs.dao.base.FPelementAuthDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FPelementAuth模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fPelementAuthDao")
public class FPelementAuthDaoImpl implements FPelementAuthDao{

	/**
	 * 查询FPelementAuth详情
	 */
	public FPelementAuth getFPelementAuthById(Integer id){
		return null;
	}
	
	/**
	 * 删除FPelementAuth对象
	 */
	public void deleteFPelementAuthById(Integer id){
		
	}
	
	/**
	 * 更新FPelementAuth对象
	 */
	public void updateFPelementAuthById(FPelementAuth fPelementAuth){
		
	}
	
	/**
	 * 添加FPelementAuth对象
	 */
	public void addFPelementAuth(FPelementAuth fPelementAuth){
		
	}

}