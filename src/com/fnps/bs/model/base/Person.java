package com.fnps.bs.model.base;

import java.util.Date;
/**
 * Person模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
public class Person{

	/**  */
	private Date birthday;	
	/**  */
	private String name;	
	/**  */
	private Integer number;	
		
	/**  */
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	/**  */
	public Date getBirthday(){
		return birthday;
	}	
		
	/**  */
	public void setName(String name){
		this.name = name;
	}
	
	/**  */
	public String getName(){
		return name;
	}	
		
	/**  */
	public void setNumber(Integer number){
		this.number = number;
	}
	
	/**  */
	public Integer getNumber(){
		return number;
	}	
}