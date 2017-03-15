package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FUserRole;
import com.fnps.bs.dao.base.FUserRoleDao;
import com.fnps.bs.service.base.FUserRoleService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FUserRole模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fUserRoleService")
public class FUserRoleServiceImpl implements FUserRoleService{
	
	@Resource
	private FUserRoleDao fUserRoleDao;
	/**
	 * 查询FUserRole详情
	 */
	public FUserRole getFUserRoleById(Integer id){
		return fUserRoleDao.getFUserRoleById(id);
	}
	
	/**
	 * 删除FUserRole对象
	 */
	public void deleteFUserRoleById(Integer id){
		fUserRoleDao.deleteFUserRoleById(id);
	}
	
	/**
	 * 更新FUserRole对象
	 */
	public void updateFUserRoleById(FUserRole fUserRole){
		fUserRoleDao.updateFUserRoleById(fUserRole);
	}
	
	/**
	 * 添加FUserRole对象
	 */
	public void addFUserRole(FUserRole fUserRole){
		fUserRoleDao.addFUserRole(fUserRole);
	}

}