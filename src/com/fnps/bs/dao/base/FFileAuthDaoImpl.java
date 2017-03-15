package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FFileAuth;
import com.fnps.bs.dao.base.FFileAuthDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FFileAuth模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fFileAuthDao")
public class FFileAuthDaoImpl implements FFileAuthDao{

	/**
	 * 查询FFileAuth详情
	 */
	public FFileAuth getFFileAuthById(Integer id){
		return null;
	}
	
	/**
	 * 删除FFileAuth对象
	 */
	public void deleteFFileAuthById(Integer id){
		
	}
	
	/**
	 * 更新FFileAuth对象
	 */
	public void updateFFileAuthById(FFileAuth fFileAuth){
		
	}
	
	/**
	 * 添加FFileAuth对象
	 */
	public void addFFileAuth(FFileAuth fFileAuth){
		
	}

}