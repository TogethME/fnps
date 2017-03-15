package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FUserGroup;
import com.fnps.bs.dao.base.FUserGroupDao;
import com.fnps.bs.service.base.FUserGroupService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FUserGroup模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fUserGroupService")
public class FUserGroupServiceImpl implements FUserGroupService{
	
	@Resource
	private FUserGroupDao fUserGroupDao;
	/**
	 * 查询FUserGroup详情
	 */
	public FUserGroup getFUserGroupById(Integer id){
		return fUserGroupDao.getFUserGroupById(id);
	}
	
	/**
	 * 删除FUserGroup对象
	 */
	public void deleteFUserGroupById(Integer id){
		fUserGroupDao.deleteFUserGroupById(id);
	}
	
	/**
	 * 更新FUserGroup对象
	 */
	public void updateFUserGroupById(FUserGroup fUserGroup){
		fUserGroupDao.updateFUserGroupById(fUserGroup);
	}
	
	/**
	 * 添加FUserGroup对象
	 */
	public void addFUserGroup(FUserGroup fUserGroup){
		fUserGroupDao.addFUserGroup(fUserGroup);
	}

}