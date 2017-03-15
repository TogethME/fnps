package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FPageElements;
import com.fnps.bs.dao.base.FPageElementsDao;
import com.fnps.bs.service.base.FPageElementsService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FPageElements模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fPageElementsService")
public class FPageElementsServiceImpl implements FPageElementsService{
	
	@Resource
	private FPageElementsDao fPageElementsDao;
	/**
	 * 查询FPageElements详情
	 */
	public FPageElements getFPageElementsById(Integer id){
		return fPageElementsDao.getFPageElementsById(id);
	}
	
	/**
	 * 删除FPageElements对象
	 */
	public void deleteFPageElementsById(Integer id){
		fPageElementsDao.deleteFPageElementsById(id);
	}
	
	/**
	 * 更新FPageElements对象
	 */
	public void updateFPageElementsById(FPageElements fPageElements){
		fPageElementsDao.updateFPageElementsById(fPageElements);
	}
	
	/**
	 * 添加FPageElements对象
	 */
	public void addFPageElements(FPageElements fPageElements){
		fPageElementsDao.addFPageElements(fPageElements);
	}

}