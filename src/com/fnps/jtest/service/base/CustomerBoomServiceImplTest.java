package com.fnps.jtest.service.base;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import cn.jfast.framework.web.annotation.Resource;
import cn.jfast.framework.web.junit.JfastJUnit4ClassRunner;

import com.fnps.bs.dao.base.CustomerBoomDao;
import com.fnps.bs.model.base.Customer;
import com.fnps.bs.model.base.CustomerBoom;
import com.fnps.bs.service.base.CustomerBoomService;
@RunWith(JfastJUnit4ClassRunner.class) 
public class CustomerBoomServiceImplTest {

	@Resource
	CustomerBoomDao customerBoomDao;
	@Test
	public void test() {
		Assert.assertEquals(1, customerBoomDao.getCustomerBoom().size()); 
	}

}
