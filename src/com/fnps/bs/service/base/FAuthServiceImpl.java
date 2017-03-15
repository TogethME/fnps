package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FAuth;
import com.fnps.bs.dao.base.FAuthDao;
import com.fnps.bs.service.base.FAuthService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fAuthService")
public class FAuthServiceImpl implements FAuthService{
	
	@Resource
	private FAuthDao fAuthDao;
	/**
	 * 查询FAuth详情
	 */
	public FAuth getFAuthById(Integer id){
		return fAuthDao.getFAuthById(id);
	}
	
	/**
	 * 删除FAuth对象
	 */
	public void deleteFAuthById(Integer id){
		fAuthDao.deleteFAuthById(id);
	}
	
	/**
	 * 更新FAuth对象
	 */
	public void updateFAuthById(FAuth fAuth){
		fAuthDao.updateFAuthById(fAuth);
	}
	
	/**
	 * 添加FAuth对象
	 */
	public void addFAuth(FAuth fAuth){
		fAuthDao.addFAuth(fAuth);
	}

}