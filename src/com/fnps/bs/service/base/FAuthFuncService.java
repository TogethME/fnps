package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FAuthFunc;

/**
 * FAuthFunc模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FAuthFuncService{

	/**
	 * 查询FAuthFunc详情
	 */
	FAuthFunc getFAuthFuncById(Integer id);
	
	/**
	 * 删除FAuthFunc对象
	 */
	void deleteFAuthFuncById(Integer id);
	
	/**
	 * 更新FAuthFunc对象
	 */
	void updateFAuthFuncById(FAuthFunc fAuthFunc);
	
	/**
	 * 添加FAuthFunc对象
	 */
	void addFAuthFunc(FAuthFunc fAuthFunc);

}