package com.fnps.bs.service.base;

import com.fnps.bs.model.base.FFile;
import com.fnps.bs.dao.base.FFileDao;
import com.fnps.bs.service.base.FFileService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * FFile模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="fFileService")
public class FFileServiceImpl implements FFileService{
	
	@Resource
	private FFileDao fFileDao;
	/**
	 * 查询FFile详情
	 */
	public FFile getFFileById(Integer id){
		return fFileDao.getFFileById(id);
	}
	
	/**
	 * 删除FFile对象
	 */
	public void deleteFFileById(Integer id){
		fFileDao.deleteFFileById(id);
	}
	
	/**
	 * 更新FFile对象
	 */
	public void updateFFileById(FFile fFile){
		fFileDao.updateFFileById(fFile);
	}
	
	/**
	 * 添加FFile对象
	 */
	public void addFFile(FFile fFile){
		fFileDao.addFFile(fFile);
	}

}