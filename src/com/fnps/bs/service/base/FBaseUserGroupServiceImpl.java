package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FBaseUserGroup;
import com.fnps.bs.dao.base.FBaseUserGroupDao;
import com.fnps.bs.service.base.FBaseUserGroupService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FBaseUserGroup模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fBaseUserGroupService")
public class FBaseUserGroupServiceImpl implements FBaseUserGroupService{
	
	@Resource
	private FBaseUserGroupDao fBaseUserGroupDao;
	/**
	 * 查询FBaseUserGroup详情
	 */
	public FBaseUserGroup getFBaseUserGroupById(Integer id){
		return fBaseUserGroupDao.getFBaseUserGroupById(id);
	}
	
	/**
	 * 删除FBaseUserGroup对象
	 */
	public void deleteFBaseUserGroupById(Integer id){
		fBaseUserGroupDao.deleteFBaseUserGroupById(id);
	}
	
	/**
	 * 更新FBaseUserGroup对象
	 */
	public void updateFBaseUserGroupById(FBaseUserGroup fBaseUserGroup){
		fBaseUserGroupDao.updateFBaseUserGroupById(fBaseUserGroup);
	}
	
	/**
	 * 添加FBaseUserGroup对象
	 */
	public void addFBaseUserGroup(FBaseUserGroup fBaseUserGroup){
		fBaseUserGroupDao.addFBaseUserGroup(fBaseUserGroup);
	}

}