package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FFile模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_file")
public class FFile{

	/**  */
	private Integer LOGICState;	
	/**  */
	private Integer ID;	
	/**  */
	private String FILEPath;	
	/**  */
	private String CREATEUser;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private String FILEName;	
	/**  */
	private Integer FILEId;	
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
	public void setFILEPath(String FILEPath){
		this.FILEPath = FILEPath;
	}
	
	/**  */
	public String getFILEPath(){
		return FILEPath;
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
	public void setFILEName(String FILEName){
		this.FILEName = FILEName;
	}
	
	/**  */
	public String getFILEName(){
		return FILEName;
	}	
		
	/**  */
	public void setFILEId(Integer FILEId){
		this.FILEId = FILEId;
	}
	
	/**  */
	public Integer getFILEId(){
		return FILEId;
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