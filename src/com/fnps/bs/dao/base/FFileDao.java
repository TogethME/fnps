package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FFile;

/**
 * FFile模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface FFileDao{

	/**
	 * 查询FFile详情
	 */
	FFile getFFileById(Integer id);
	
	/**
	 * 删除FFile对象
	 */
	void deleteFFileById(Integer id);
	
	/**
	 * 更新FFile对象
	 */
	void updateFFileById(FFile fFile);
	
	/**
	 * 添加FFile对象
	 */
	void addFFile(FFile fFile);

}