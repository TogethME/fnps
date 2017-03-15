package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FFileAuth模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_file_auth")
public class FFileAuth{

	/**  */
	private Integer ID;	
	/**  */
	private String CREATEUser;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private Integer FILEId;	
	/**  */
	private Date UPDATEDate;	
	/**  */
	private String UPDATEUser;	
	/**  */
	private Integer AUTHId;	
		
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
		
	/**  */
	public void setAUTHId(Integer AUTHId){
		this.AUTHId = AUTHId;
	}
	
	/**  */
	public Integer getAUTHId(){
		return AUTHId;
	}	
}