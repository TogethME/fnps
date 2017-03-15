package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FMenu;
import com.fnps.bs.dao.base.FMenuDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FMenu模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fMenuDao")
public class FMenuDaoImpl implements FMenuDao{

	/**
	 * 查询FMenu详情
	 */
	public FMenu getFMenuById(Integer id){
		return null;
	}
	
	/**
	 * 删除FMenu对象
	 */
	public void deleteFMenuById(Integer id){
		
	}
	
	/**
	 * 更新FMenu对象
	 */
	public void updateFMenuById(FMenu fMenu){
		
	}
	
	/**
	 * 添加FMenu对象
	 */
	public void addFMenu(FMenu fMenu){
		
	}

}