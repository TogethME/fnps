package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FAuth;

/**
 * FAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FAuthService{

	/**
	 * 查询FAuth详情
	 */
	FAuth getFAuthById(Integer id);
	
	/**
	 * 删除FAuth对象
	 */
	void deleteFAuthById(Integer id);
	
	/**
	 * 更新FAuth对象
	 */
	void updateFAuthById(FAuth fAuth);
	
	/**
	 * 添加FAuth对象
	 */
	void addFAuth(FAuth fAuth);

}