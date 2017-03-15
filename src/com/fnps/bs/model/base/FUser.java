package com.fnps.bs.model.base;

import java.util.Date;
import cn.jfast.framework.jdbc.annotation.Table;
/**
 * FUser模块对应的实体类
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Table("f_user")
public class FUser{

	/**  */
	private String USERAddrs;	
	/**  */
	private Integer USERId;	
	/**  */
	private Date CREATEDate;	
	/**  */
	private String PASSWORD;	
	/**  */
	private String UPDATEUser;	
	/**  */
	private Integer LOGICState;	
	/**  */
	private Integer ID;	
	/**  */
	private Integer MOBILEPhone;	
	/**  */
	private String USERName;	
	/**  */
	private String CREATEUser;	
	/**  */
	private String ACCOUNT;	
	/**  */
	private String OPENID;	
	/**  */
	private Date UPDATEDate;	
	/**  */
	private String TELEPHONE;	
		
	/**  */
	public void setUSERAddrs(String USERAddrs){
		this.USERAddrs = USERAddrs;
	}
	
	/**  */
	public String getUSERAddrs(){
		return USERAddrs;
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
	public void setCREATEDate(Date CREATEDate){
		this.CREATEDate = CREATEDate;
	}
	
	/**  */
	public Date getCREATEDate(){
		return CREATEDate;
	}	
		
	/**  */
	public void setPASSWORD(String PASSWORD){
		this.PASSWORD = PASSWORD;
	}
	
	/**  */
	public String getPASSWORD(){
		return PASSWORD;
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
	public void setMOBILEPhone(Integer MOBILEPhone){
		this.MOBILEPhone = MOBILEPhone;
	}
	
	/**  */
	public Integer getMOBILEPhone(){
		return MOBILEPhone;
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
	public void setACCOUNT(String ACCOUNT){
		this.ACCOUNT = ACCOUNT;
	}
	
	/**  */
	public String getACCOUNT(){
		return ACCOUNT;
	}	
		
	/**  */
	public void setOPENID(String OPENID){
		this.OPENID = OPENID;
	}
	
	/**  */
	public String getOPENID(){
		return OPENID;
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
	public void setTELEPHONE(String TELEPHONE){
		this.TELEPHONE = TELEPHONE;
	}
	
	/**  */
	public String getTELEPHONE(){
		return TELEPHONE;
	}	
}