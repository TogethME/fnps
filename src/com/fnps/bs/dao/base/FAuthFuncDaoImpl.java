package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FAuthFunc;
import com.fnps.bs.dao.base.FAuthFuncDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FAuthFunc模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fAuthFuncDao")
public class FAuthFuncDaoImpl implements FAuthFuncDao{

	/**
	 * 查询FAuthFunc详情
	 */
	public FAuthFunc getFAuthFuncById(Integer id){
		return null;
	}
	
	/**
	 * 删除FAuthFunc对象
	 */
	public void deleteFAuthFuncById(Integer id){
		
	}
	
	/**
	 * 更新FAuthFunc对象
	 */
	public void updateFAuthFuncById(FAuthFunc fAuthFunc){
		
	}
	
	/**
	 * 添加FAuthFunc对象
	 */
	public void addFAuthFunc(FAuthFunc fAuthFunc){
		
	}

}