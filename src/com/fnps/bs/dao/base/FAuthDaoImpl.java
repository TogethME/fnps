package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.FAuth;
import com.fnps.bs.dao.base.FAuthDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * FAuth模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="fAuthDao")
public class FAuthDaoImpl implements FAuthDao{

	/**
	 * 查询FAuth详情
	 */
	public FAuth getFAuthById(Integer id){
		return null;
	}
	
	/**
	 * 删除FAuth对象
	 */
	public void deleteFAuthById(Integer id){
		
	}
	
	/**
	 * 更新FAuth对象
	 */
	public void updateFAuthById(FAuth fAuth){
		
	}
	
	/**
	 * 添加FAuth对象
	 */
	public void addFAuth(FAuth fAuth){
		
	}

}