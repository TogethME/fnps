package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FMenuAuth;

/**
 * FMenuAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FMenuAuthService{

	/**
	 * 查询FMenuAuth详情
	 */
	FMenuAuth getFMenuAuthById(Integer id);
	
	/**
	 * 删除FMenuAuth对象
	 */
	void deleteFMenuAuthById(Integer id);
	
	/**
	 * 更新FMenuAuth对象
	 */
	void updateFMenuAuthById(FMenuAuth fMenuAuth);
	
	/**
	 * 添加FMenuAuth对象
	 */
	void addFMenuAuth(FMenuAuth fMenuAuth);

}