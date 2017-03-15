package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FFileAuth;
import com.fnps.bs.dao.base.FFileAuthDao;
import com.fnps.bs.service.base.FFileAuthService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FFileAuth模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fFileAuthService")
public class FFileAuthServiceImpl implements FFileAuthService{
	
	@Resource
	private FFileAuthDao fFileAuthDao;
	/**
	 * 查询FFileAuth详情
	 */
	public FFileAuth getFFileAuthById(Integer id){
		return fFileAuthDao.getFFileAuthById(id);
	}
	
	/**
	 * 删除FFileAuth对象
	 */
	public void deleteFFileAuthById(Integer id){
		fFileAuthDao.deleteFFileAuthById(id);
	}
	
	/**
	 * 更新FFileAuth对象
	 */
	public void updateFFileAuthById(FFileAuth fFileAuth){
		fFileAuthDao.updateFFileAuthById(fFileAuth);
	}
	
	/**
	 * 添加FFileAuth对象
	 */
	public void addFFileAuth(FFileAuth fFileAuth){
		fFileAuthDao.addFFileAuth(fFileAuth);
	}

}