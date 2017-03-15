package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FLoginMeter;

/**
 * FLoginMeter模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FLoginMeterDao{

	/**
	 * 查询FLoginMeter详情
	 */
	FLoginMeter getFLoginMeterById(Integer id);
	
	/**
	 * 删除FLoginMeter对象
	 */
	void deleteFLoginMeterById(Integer id);
	
	/**
	 * 更新FLoginMeter对象
	 */
	void updateFLoginMeterById(FLoginMeter fLoginMeter);
	
	/**
	 * 添加FLoginMeter对象
	 */
	void addFLoginMeter(FLoginMeter fLoginMeter);

}