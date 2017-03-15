package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FPelementAuth;

/**
 * FPelementAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FPelementAuthService{

	/**
	 * 查询FPelementAuth详情
	 */
	FPelementAuth getFPelementAuthById(Integer id);
	
	/**
	 * 删除FPelementAuth对象
	 */
	void deleteFPelementAuthById(Integer id);
	
	/**
	 * 更新FPelementAuth对象
	 */
	void updateFPelementAuthById(FPelementAuth fPelementAuth);
	
	/**
	 * 添加FPelementAuth对象
	 */
	void addFPelementAuth(FPelementAuth fPelementAuth);

}