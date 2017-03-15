package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FPageElements;

/**
 * FPageElements模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FPageElementsDao{

	/**
	 * 查询FPageElements详情
	 */
	FPageElements getFPageElementsById(Integer id);
	
	/**
	 * 删除FPageElements对象
	 */
	void deleteFPageElementsById(Integer id);
	
	/**
	 * 更新FPageElements对象
	 */
	void updateFPageElementsById(FPageElements fPageElements);
	
	/**
	 * 添加FPageElements对象
	 */
	void addFPageElements(FPageElements fPageElements);

}