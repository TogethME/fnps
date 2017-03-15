package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FFunction;
import com.fnps.bs.dao.base.FFunctionDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FFunction模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fFunctionDao")
public class FFunctionDaoImpl implements FFunctionDao{

	/**
	 * 查询FFunction详情
	 */
	public FFunction getFFunctionById(Integer id){
		return null;
	}
	
	/**
	 * 删除FFunction对象
	 */
	public void deleteFFunctionById(Integer id){
		
	}
	
	/**
	 * 更新FFunction对象
	 */
	public void updateFFunctionById(FFunction fFunction){
		
	}
	
	/**
	 * 添加FFunction对象
	 */
	public void addFFunction(FFunction fFunction){
		
	}

}