package com.fnps.bs.dao.base;

import com.fnps.bs.model.base.Person;
import com.fnps.bs.dao.base.PersonDao;
import cn.jfast.framework.jdbc.annotation.Dao;

/**
 * Person模块对应的数据接口
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Dao(name="personDao")
public class PersonDaoImpl implements PersonDao{

	/**
	 * 查询Person详情
	 */
	public Person getPersonBy(){
		return null;
	}
	
	/**
	 * 删除Person对象
	 */
	public void deletePersonBy(){
		
	}
	
	/**
	 * 更新Person对象
	 */
	public void updatePersonBy(Person person){
		
	}
	
	/**
	 * 添加Person对象
	 */
	public void addPerson(Person person){
		
	}

}