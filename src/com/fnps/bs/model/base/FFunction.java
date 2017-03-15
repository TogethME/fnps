package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FFunction模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_function")
public class FFunction{

	/**  */
	private Integer LOGICState;	
	/**  */
	private String INTERUrlPref;	
	/**  */
	private Integer ID;	
	/**  */
	private String CREATEUser;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private Integer FUNCId;	
	/**  */
	private Date UPDATEDate;	
	/**  */
	private String FUNCName;	
	/**  */
	private String UPDATEUser;	
	/**  */
	private Integer PFuncId;	
		
	/**  */
	public void setLOGICState(Integer LOGICState){
		this.LOGICState = LOGICState;
	}
	
	/**  */
	public Integer getLOGICState(){
		return LOGICState;
	}	
		
	/**  */
	public void setINTERUrlPref(String INTERUrlPref){
		this.INTERUrlPref = INTERUrlPref;
	}
	
	/**  */
	public String getINTERUrlPref(){
		return INTERUrlPref;
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
	public void setFUNCId(Integer FUNCId){
		this.FUNCId = FUNCId;
	}
	
	/**  */
	public Integer getFUNCId(){
		return FUNCId;
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
	public void setFUNCName(String FUNCName){
		this.FUNCName = FUNCName;
	}
	
	/**  */
	public String getFUNCName(){
		return FUNCName;
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
	public void setPFuncId(Integer PFuncId){
		this.PFuncId = PFuncId;
	}
	
	/**  */
	public Integer getPFuncId(){
		return PFuncId;
	}	
}