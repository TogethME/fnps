package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FMenu;

/**
 * FMenu模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FMenuService{

	/**
	 * 查询FMenu详情
	 */
	FMenu getFMenuById(Integer id);
	
	/**
	 * 删除FMenu对象
	 */
	void deleteFMenuById(Integer id);
	
	/**
	 * 更新FMenu对象
	 */
	void updateFMenuById(FMenu fMenu);
	
	/**
	 * 添加FMenu对象
	 */
	void addFMenu(FMenu fMenu);

}