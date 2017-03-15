package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FMenu;
import com.fnps.bs.dao.base.FMenuDao;
import com.fnps.bs.service.base.FMenuService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FMenu模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fMenuService")
public class FMenuServiceImpl implements FMenuService{
	
	@Resource
	private FMenuDao fMenuDao;
	/**
	 * 查询FMenu详情
	 */
	public FMenu getFMenuById(Integer id){
		return fMenuDao.getFMenuById(id);
	}
	
	/**
	 * 删除FMenu对象
	 */
	public void deleteFMenuById(Integer id){
		fMenuDao.deleteFMenuById(id);
	}
	
	/**
	 * 更新FMenu对象
	 */
	public void updateFMenuById(FMenu fMenu){
		fMenuDao.updateFMenuById(fMenu);
	}
	
	/**
	 * 添加FMenu对象
	 */
	public void addFMenu(FMenu fMenu){
		fMenuDao.addFMenu(fMenu);
	}

}