package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FUserGroup模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_user_group")
public class FUserGroup{

	/**  */
	private Integer LOGICState;	
	/**  */
	private Integer ID;	
	/**  */
	private String USERName;	
	/**  */
	private String CREATEUser;	
	/**  */
	private Integer PREUserGroupId;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private Integer USERId;	
	/**  */
	private Date UPDATEDate;	
	/**  */
	private String UPDATEUser;	
		
	/**  */
	public void setLOGICState(Integer LOGICState){
		this.LOGICState = LOGICState;
	}
	
	/**  */
	public Integer getLOGICState(){
		return LOGICState;
	}	
		
	/**  */
	public void setID(Integer ID){
		this.ID = ID;
	}
	
	/**  */
	public Integer getID(){
		return ID;
	}	
		
	/**  */
	public void setUSERName(String USERName){
		this.USERName = USERName;
	}
	
	/**  */
	public String getUSERName(){
		return USERName;
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
	public void setPREUserGroupId(Integer PREUserGroupId){
		this.PREUserGroupId = PREUserGroupId;
	}
	
	/**  */
	public Integer getPREUserGroupId(){
		return PREUserGroupId;
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
	public void setUSERId(Integer USERId){
		this.USERId = USERId;
	}
	
	/**  */
	public Integer getUSERId(){
		return USERId;
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