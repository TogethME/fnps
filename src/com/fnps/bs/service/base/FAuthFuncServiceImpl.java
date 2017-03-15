package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FAuthFunc;
import com.fnps.bs.dao.base.FAuthFuncDao;
import com.fnps.bs.service.base.FAuthFuncService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FAuthFunc模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fAuthFuncService")
public class FAuthFuncServiceImpl implements FAuthFuncService{
	
	@Resource
	private FAuthFuncDao fAuthFuncDao;
	/**
	 * 查询FAuthFunc详情
	 */
	public FAuthFunc getFAuthFuncById(Integer id){
		return fAuthFuncDao.getFAuthFuncById(id);
	}
	
	/**
	 * 删除FAuthFunc对象
	 */
	public void deleteFAuthFuncById(Integer id){
		fAuthFuncDao.deleteFAuthFuncById(id);
	}
	
	/**
	 * 更新FAuthFunc对象
	 */
	public void updateFAuthFuncById(FAuthFunc fAuthFunc){
		fAuthFuncDao.updateFAuthFuncById(fAuthFunc);
	}
	
	/**
	 * 添加FAuthFunc对象
	 */
	public void addFAuthFunc(FAuthFunc fAuthFunc){
		fAuthFuncDao.addFAuthFunc(fAuthFunc);
	}

}