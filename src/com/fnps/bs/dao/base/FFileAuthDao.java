package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FFileAuth;

/**
 * FFileAuth模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FFileAuthDao{

	/**
	 * 查询FFileAuth详情
	 */
	FFileAuth getFFileAuthById(Integer id);
	
	/**
	 * 删除FFileAuth对象
	 */
	void deleteFFileAuthById(Integer id);
	
	/**
	 * 更新FFileAuth对象
	 */
	void updateFFileAuthById(FFileAuth fFileAuth);
	
	/**
	 * 添加FFileAuth对象
	 */
	void addFFileAuth(FFileAuth fFileAuth);

}