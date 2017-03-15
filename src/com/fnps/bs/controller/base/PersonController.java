package com.fnps.bs.controller.base;

import cn.jfast.framework.log.LogFactory;
import cn.jfast.framework.log.LogType;
import cn.jfast.framework.log.Logger;
import cn.jfast.framework.web.annotation.Api;
import cn.jfast.framework.web.annotation.Get;
import cn.jfast.framework.web.annotation.HttpParam;
import cn.jfast.framework.web.annotation.Post;
import cn.jfast.framework.web.annotation.Put;
import cn.jfast.framework.web.annotation.Delete;
import cn.jfast.framework.web.annotation.Resource;
import cn.jfast.framework.web.view.viewtype.Json;
import com.fnps.bs.service.base.PersonService;
import com.fnps.bs.model.base.Person;
/**
 * Person模块对应控制器
 * @since 2017-03-11 20:40
 * @author jfast
 */
@Api(path = "api/v1", description = "Person控制器")
public class PersonController {

	public static Logger log = LogFactory.getLogger(LogType.JFast,PersonController.class);
	@Resource
	private PersonService personService;
	
	/**
	* 插入
	*/
	@Post(path = "persons", description = "添加新Person信息")
	public Json addPerson(@HttpParam(fromJson=true) Person person){
		personService.addPerson(person);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 查询
	*/
	@Get(path = "persons", description = "查询指定主键的Person信息")
	public Json getPerson(){
		personService.getPersonBy();
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 更新
	*/
	@Put(path = "persons", description = "更新指定主键的Person信息")
	public Json updatePerson(@HttpParam(fromJson=true) Person person){
		personService.updatePersonBy(person);
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
	/**
	* 删除
	*/
	@Delete(path = "persons", description = "更新指定主键的Person信息")
	public Json deletePerson(){
		personService.deletePersonBy();
		return new Json("{errCode:0,errMsg:'',data:''}");
	}
	
}