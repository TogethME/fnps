package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FFile;
import com.fnps.bs.dao.base.FFileDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FFile模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fFileDao")
public class FFileDaoImpl implements FFileDao{

	/**
	 * 查询FFile详情
	 */
	public FFile getFFileById(Integer id){
		return null;
	}
	
	/**
	 * 删除FFile对象
	 */
	public void deleteFFileById(Integer id){
		
	}
	
	/**
	 * 更新FFile对象
	 */
	public void updateFFileById(FFile fFile){
		
	}
	
	/**
	 * 添加FFile对象
	 */
	public void addFFile(FFile fFile){
		
	}

}