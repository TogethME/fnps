package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FUser;
import com.fnps.bs.dao.base.FUserDao;
import com.fnps.bs.service.base.FUserService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FUser模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fUserService")
public class FUserServiceImpl implements FUserService{
	
	@Resource
	private FUserDao fUserDao;
	/**
	 * 查询FUser详情
	 */
	public FUser getFUserById(Integer id){
		return fUserDao.getFUserById(id);
	}
	
	/**
	 * 删除FUser对象
	 */
	public void deleteFUserById(Integer id){
		fUserDao.deleteFUserById(id);
	}
	
	/**
	 * 更新FUser对象
	 */
	public void updateFUserById(FUser fUser){
		fUserDao.updateFUserById(fUser);
	}
	
	/**
	 * 添加FUser对象
	 */
	public void addFUser(FUser fUser){
		fUserDao.addFUser(fUser);
	}

}