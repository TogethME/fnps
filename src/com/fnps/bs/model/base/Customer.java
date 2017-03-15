package com.fnps.bs.model.base;

/**
 * Customer模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
public class Customer{

	/**  */
	private Integer id;	
	/**  */
	private String remark;	
	/**  */
	private String email;	
	/**  */
	private String name;	
	/**  */
	private String telephone;	
	/**  */
	private String contact;	
		
	/**  */
	public void setId(Integer id){
		this.id = id;
	}
	
	/**  */
	public Integer getId(){
		return id;
	}	
		
	/**  */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	/**  */
	public String getRemark(){
		return remark;
	}	
		
	/**  */
	public void setEmail(String email){
		this.email = email;
	}
	
	/**  */
	public String getEmail(){
		return email;
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
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	
	/**  */
	public String getTelephone(){
		return telephone;
	}	
		
	/**  */
	public void setContact(String contact){
		this.contact = contact;
	}
	
	/**  */
	public String getContact(){
		return contact;
	}	
}