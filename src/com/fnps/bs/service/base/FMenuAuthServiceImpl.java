package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FMenuAuth;
import com.fnps.bs.dao.base.FMenuAuthDao;
import com.fnps.bs.service.base.FMenuAuthService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FMenuAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fMenuAuthService")
public class FMenuAuthServiceImpl implements FMenuAuthService{
	
	@Resource
	private FMenuAuthDao fMenuAuthDao;
	/**
	 * 查询FMenuAuth详情
	 */
	public FMenuAuth getFMenuAuthById(Integer id){
		return fMenuAuthDao.getFMenuAuthById(id);
	}
	
	/**
	 * 删除FMenuAuth对象
	 */
	public void deleteFMenuAuthById(Integer id){
		fMenuAuthDao.deleteFMenuAuthById(id);
	}
	
	/**
	 * 更新FMenuAuth对象
	 */
	public void updateFMenuAuthById(FMenuAuth fMenuAuth){
		fMenuAuthDao.updateFMenuAuthById(fMenuAuth);
	}
	
	/**
	 * 添加FMenuAuth对象
	 */
	public void addFMenuAuth(FMenuAuth fMenuAuth){
		fMenuAuthDao.addFMenuAuth(fMenuAuth);
	}

}