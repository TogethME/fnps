package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FFunction;
import com.fnps.bs.dao.base.FFunctionDao;
import com.fnps.bs.service.base.FFunctionService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FFunction模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fFunctionService")
public class FFunctionServiceImpl implements FFunctionService{
	
	@Resource
	private FFunctionDao fFunctionDao;
	/**
	 * 查询FFunction详情
	 */
	public FFunction getFFunctionById(Integer id){
		return fFunctionDao.getFFunctionById(id);
	}
	
	/**
	 * 删除FFunction对象
	 */
	public void deleteFFunctionById(Integer id){
		fFunctionDao.deleteFFunctionById(id);
	}
	
	/**
	 * 更新FFunction对象
	 */
	public void updateFFunctionById(FFunction fFunction){
		fFunctionDao.updateFFunctionById(fFunction);
	}
	
	/**
	 * 添加FFunction对象
	 */
	public void addFFunction(FFunction fFunction){
		fFunctionDao.addFFunction(fFunction);
	}

}