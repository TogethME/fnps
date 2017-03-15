package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FPageElements模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_page_elements")
public class FPageElements{

	/**  */
	private Integer LOGICState;	
	/**  */
	private Integer ID;	
	/**  */
	private String CREATEUser;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private Date UPDATEDate;	
	/**  */
	private String PAGEElementCode;	
	/**  */
	private Integer PAGEElementId;	
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
	public void setCREATEDate(Date CREATEDate){
		this.CREATEDate = CREATEDate;
	}
	
	/**  */
	public Date getCREATEDate(){
		return CREATEDate;
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
	public void setPAGEElementCode(String PAGEElementCode){
		this.PAGEElementCode = PAGEElementCode;
	}
	
	/**  */
	public String getPAGEElementCode(){
		return PAGEElementCode;
	}	
		
	/**  */
	public void setPAGEElementId(Integer PAGEElementId){
		this.PAGEElementId = PAGEElementId;
	}
	
	/**  */
	public Integer getPAGEElementId(){
		return PAGEElementId;
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