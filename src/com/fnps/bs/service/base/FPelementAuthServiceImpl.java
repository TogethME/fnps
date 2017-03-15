package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FPelementAuth;
import com.fnps.bs.dao.base.FPelementAuthDao;
import com.fnps.bs.service.base.FPelementAuthService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FPelementAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fPelementAuthService")
public class FPelementAuthServiceImpl implements FPelementAuthService{
	
	@Resource
	private FPelementAuthDao fPelementAuthDao;
	/**
	 * 查询FPelementAuth详情
	 */
	public FPelementAuth getFPelementAuthById(Integer id){
		return fPelementAuthDao.getFPelementAuthById(id);
	}
	
	/**
	 * 删除FPelementAuth对象
	 */
	public void deleteFPelementAuthById(Integer id){
		fPelementAuthDao.deleteFPelementAuthById(id);
	}
	
	/**
	 * 更新FPelementAuth对象
	 */
	public void updateFPelementAuthById(FPelementAuth fPelementAuth){
		fPelementAuthDao.updateFPelementAuthById(fPelementAuth);
	}
	
	/**
	 * 添加FPelementAuth对象
	 */
	public void addFPelementAuth(FPelementAuth fPelementAuth){
		fPelementAuthDao.addFPelementAuth(fPelementAuth);
	}

}