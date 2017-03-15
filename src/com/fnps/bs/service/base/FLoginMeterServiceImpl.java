package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FLoginMeter;
import com.fnps.bs.dao.base.FLoginMeterDao;
import com.fnps.bs.service.base.FLoginMeterService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FLoginMeter模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fLoginMeterService")
public class FLoginMeterServiceImpl implements FLoginMeterService{
	
	@Resource
	private FLoginMeterDao fLoginMeterDao;
	/**
	 * 查询FLoginMeter详情
	 */
	public FLoginMeter getFLoginMeterById(Integer id){
		return fLoginMeterDao.getFLoginMeterById(id);
	}
	
	/**
	 * 删除FLoginMeter对象
	 */
	public void deleteFLoginMeterById(Integer id){
		fLoginMeterDao.deleteFLoginMeterById(id);
	}
	
	/**
	 * 更新FLoginMeter对象
	 */
	public void updateFLoginMeterById(FLoginMeter fLoginMeter){
		fLoginMeterDao.updateFLoginMeterById(fLoginMeter);
	}
	
	/**
	 * 添加FLoginMeter对象
	 */
	public void addFLoginMeter(FLoginMeter fLoginMeter){
		fLoginMeterDao.addFLoginMeter(fLoginMeter);
	}

}