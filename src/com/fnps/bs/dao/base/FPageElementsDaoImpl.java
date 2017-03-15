package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FPageElements;
import com.fnps.bs.dao.base.FPageElementsDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FPageElements模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fPageElementsDao")
public class FPageElementsDaoImpl implements FPageElementsDao{

	/**
	 * 查询FPageElements详情
	 */
	public FPageElements getFPageElementsById(Integer id){
		return null;
	}
	
	/**
	 * 删除FPageElements对象
	 */
	public void deleteFPageElementsById(Integer id){
		
	}
	
	/**
	 * 更新FPageElements对象
	 */
	public void updateFPageElementsById(FPageElements fPageElements){
		
	}
	
	/**
	 * 添加FPageElements对象
	 */
	public void addFPageElements(FPageElements fPageElements){
		
	}

}