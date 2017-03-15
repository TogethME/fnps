package com.fnps.bs.service.base;

import com.fnps.bs.model.base.Person;
import com.fnps.bs.dao.base.PersonDao;
import com.fnps.bs.service.base.PersonService;
import cn.jfast.framework.web.annotation.Resource;

/**
 * Person模块对应的业务接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Resource(name="personService")
public class PersonServiceImpl implements PersonService{
	
	@Resource
	private PersonDao personDao;
	/**
	 * 查询Person详情
	 */
	public Person getPersonBy(){
		return personDao.getPersonBy();
	}
	
	/**
	 * 删除Person对象
	 */
	public void deletePersonBy(){
		personDao.deletePersonBy();
	}
	
	/**
	 * 更新Person对象
	 */
	public void updatePersonBy(Person person){
		personDao.updatePersonBy(person);
	}
	
	/**
	 * 添加Person对象
	 */
	public void addPerson(Person person){
		personDao.addPerson(person);
	}

}