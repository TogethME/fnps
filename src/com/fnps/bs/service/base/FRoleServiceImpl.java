package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FRole;
import com.fnps.bs.dao.base.FRoleDao;
import com.fnps.bs.service.base.FRoleService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FRole模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fRoleService")
public class FRoleServiceImpl implements FRoleService{
	
	@Resource
	private FRoleDao fRoleDao;
	/**
	 * 查询FRole详情
	 */
	public FRole getFRoleById(Integer id){
		return fRoleDao.getFRoleById(id);
	}
	
	/**
	 * 删除FRole对象
	 */
	public void deleteFRoleById(Integer id){
		fRoleDao.deleteFRoleById(id);
	}
	
	/**
	 * 更新FRole对象
	 */
	public void updateFRoleById(FRole fRole){
		fRoleDao.updateFRoleById(fRole);
	}
	
	/**
	 * 添加FRole对象
	 */
	public void addFRole(FRole fRole){
		fRoleDao.addFRole(fRole);
	}

}