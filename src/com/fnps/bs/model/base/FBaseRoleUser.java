package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FBaseRoleUser模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_base_role_user")
public class FBaseRoleUser{

	/**  */
	private Integer ID;	
	/**  */
	private String CREATEUser;	
	/**  */
	private Integer ROLEId;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private String USERGroupId;	
	/**  */
	private Date UPDATEDate;	
	/**  */
	private String UPDATEUser;	
		
	/**  */
	public void setID(Integer ID){
		this.ID = ID;
	}
	
	/**  */
	public Integer getID(){
		return ID;
	}	
		
	/**  */
	public void setCREATEUser(String CREATEUser){
		this.CREATEUser = CREATEUser;
	}
	
	/**  */
	public String getCREATEUser(){
		return CREATEUser;
	}	
		
	/**  */
	public void setROLEId(Integer ROLEId){
		this.ROLEId = ROLEId;
	}
	
	/**  */
	public Integer getROLEId(){
		return ROLEId;
	}	
		
	/**  */
	public void setCREATEDate(Date CREATEDate){
		this.CREATEDate = CREATEDate;
	}
	
	/**  */
	public Date getCREATEDate(){
		return CREATEDate;
	}	
		
	/**  */
	public void setUSERGroupId(String USERGroupId){
		this.USERGroupId = USERGroupId;
	}
	
	/**  */
	public String getUSERGroupId(){
		return USERGroupId;
	}	
		
	/**  */
	public void setUPDATEDate(Date UPDATEDate){
		this.UPDATEDate = UPDATEDate;
	}
	
	/**  */
	public Date getUPDATEDate(){
		return UPDATEDate;
	}	
		
	/**  */
	public void setUPDATEUser(String UPDATEUser){
		this.UPDATEUser = UPDATEUser;
	}
	
	/**  */
	public String getUPDATEUser(){
		return UPDATEUser;
	}	
}