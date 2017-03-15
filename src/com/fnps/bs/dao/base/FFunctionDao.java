package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FFunction;

/**
 * FFunction模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FFunctionDao{

	/**
	 * 查询FFunction详情
	 */
	FFunction getFFunctionById(Integer id);
	
	/**
	 * 删除FFunction对象
	 */
	void deleteFFunctionById(Integer id);
	
	/**
	 * 更新FFunction对象
	 */
	void updateFFunctionById(FFunction fFunction);
	
	/**
	 * 添加FFunction对象
	 */
	void addFFunction(FFunction fFunction);

}