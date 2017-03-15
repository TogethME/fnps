package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FLoginMeter;
import com.fnps.bs.dao.base.FLoginMeterDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FLoginMeter模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fLoginMeterDao")
public class FLoginMeterDaoImpl implements FLoginMeterDao{

	/**
	 * 查询FLoginMeter详情
	 */
	public FLoginMeter getFLoginMeterById(Integer id){
		return null;
	}
	
	/**
	 * 删除FLoginMeter对象
	 */
	public void deleteFLoginMeterById(Integer id){
		
	}
	
	/**
	 * 更新FLoginMeter对象
	 */
	public void updateFLoginMeterById(FLoginMeter fLoginMeter){
		
	}
	
	/**
	 * 添加FLoginMeter对象
	 */
	public void addFLoginMeter(FLoginMeter fLoginMeter){
		
	}

}