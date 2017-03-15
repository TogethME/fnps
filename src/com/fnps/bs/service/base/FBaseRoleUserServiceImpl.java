package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FBaseRoleUser;
import com.fnps.bs.dao.base.FBaseRoleUserDao;
import com.fnps.bs.service.base.FBaseRoleUserService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FBaseRoleUser模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fBaseRoleUserService")
public class FBaseRoleUserServiceImpl implements FBaseRoleUserService{
	
	@Resource
	private FBaseRoleUserDao fBaseRoleUserDao;
	/**
	 * 查询FBaseRoleUser详情
	 */
	public FBaseRoleUser getFBaseRoleUserById(Integer id){
		return fBaseRoleUserDao.getFBaseRoleUserById(id);
	}
	
	/**
	 * 删除FBaseRoleUser对象
	 */
	public void deleteFBaseRoleUserById(Integer id){
		fBaseRoleUserDao.deleteFBaseRoleUserById(id);
	}
	
	/**
	 * 更新FBaseRoleUser对象
	 */
	public void updateFBaseRoleUserById(FBaseRoleUser fBaseRoleUser){
		fBaseRoleUserDao.updateFBaseRoleUserById(fBaseRoleUser);
	}
	
	/**
	 * 添加FBaseRoleUser对象
	 */
	public void addFBaseRoleUser(FBaseRoleUser fBaseRoleUser){
		fBaseRoleUserDao.addFBaseRoleUser(fBaseRoleUser);
	}

}