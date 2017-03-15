package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FRoleAuth;
import com.fnps.bs.dao.base.FRoleAuthDao;
import com.fnps.bs.service.base.FRoleAuthService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FRoleAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fRoleAuthService")
public class FRoleAuthServiceImpl implements FRoleAuthService{
	
	@Resource
	private FRoleAuthDao fRoleAuthDao;
	/**
	 * 查询FRoleAuth详情
	 */
	public FRoleAuth getFRoleAuthById(Integer id){
		return fRoleAuthDao.getFRoleAuthById(id);
	}
	
	/**
	 * 删除FRoleAuth对象
	 */
	public void deleteFRoleAuthById(Integer id){
		fRoleAuthDao.deleteFRoleAuthById(id);
	}
	
	/**
	 * 更新FRoleAuth对象
	 */
	public void updateFRoleAuthById(FRoleAuth fRoleAuth){
		fRoleAuthDao.updateFRoleAuthById(fRoleAuth);
	}
	
	/**
	 * 添加FRoleAuth对象
	 */
	public void addFRoleAuth(FRoleAuth fRoleAuth){
		fRoleAuthDao.addFRoleAuth(fRoleAuth);
	}

}