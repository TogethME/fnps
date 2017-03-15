package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FMenu模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_menu")
public class FMenu{

	/**  */
	private Integer LOGICState;	
	/**  */
	private Integer ID;	
	/**  */
	private String CREATEUser;	
	/**  */
	private Integer MENUId;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private String MENUName;	
	/**  */
	private Integer PREMenuId;	
	/**  */
	private String MENUUrl;	
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
	public void setCREATEUser(String CREATEUser){
		this.CREATEUser = CREATEUser;
	}
	
	/**  */
	public String getCREATEUser(){
		return CREATEUser;
	}	
		
	/**  */
	public void setMENUId(Integer MENUId){
		this.MENUId = MENUId;
	}
	
	/**  */
	public Integer getMENUId(){
		return MENUId;
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
	public void setMENUName(String MENUName){
		this.MENUName = MENUName;
	}
	
	/**  */
	public String getMENUName(){
		return MENUName;
	}	
		
	/**  */
	public void setPREMenuId(Integer PREMenuId){
		this.PREMenuId = PREMenuId;
	}
	
	/**  */
	public Integer getPREMenuId(){
		return PREMenuId;
	}	
		
	/**  */
	public void setMENUUrl(String MENUUrl){
		this.MENUUrl = MENUUrl;
	}
	
	/**  */
	public String getMENUUrl(){
		return MENUUrl;
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