package com.fnps.bs.service.base;

import com.fnps.bs.model.base.Person;

/**
 * Person模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
public interface PersonService{

	/**
	 * 查询Person详情
	 */
	Person getPersonBy();
	
	/**
	 * 删除Person对象
	 */
	void deletePersonBy();
	
	/**
	 * 更新Person对象
	 */
	void updatePersonBy(Person person);
	
	/**
	 * 添加Person对象
	 */
	void addPerson(Person person);

}