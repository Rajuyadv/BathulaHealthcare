package com.dotridge.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import com.dotridge.bean.HospitalBean;
import com.dotridge.service.HospitalService;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:novelhealthcare-servlet.xml","classpath:applicationContext.xml"})
public class HospitalControllerTest {
	@Autowired
	private HospitalController hospController;
	@Autowired
	private HospitalService hospService;
	Model model;
	@Before
	public void setUp(){
		model=new BindingAwareModelMap();
	}

@Test
	public void testGetAllHospitals(){
	String viewName = hospController.viewAllHospitals(model);
	Assert.assertNotNull(viewName);
	Assert.assertEquals("getHospitalBoard",viewName);
	}
@Test
public void testAddHospital(){
	HospitalBean hospBean=new HospitalBean();
	hospBean.setHospitalName("nims");
	hospBean.setAddress("pangagutta");
	hospBean.setAddress1("ammerpet");
	hospBean.setCity("hyd");
	hospBean.setEmail("nims@services.com");
	hospBean.setPhone(7893499502l);
	hospBean.setFax(45678912);
	hospBean.setRegistrationDocument("ghsghs");
	hospBean.setState("telangana");
	hospBean.setZipcode(504222);
	hospBean.setStatus("active");
	String addHospital = hospController.addHospital(hospBean, model);
	Assert.assertNotNull(addHospital);
	Assert.assertEquals("getHospitalBoard",addHospital );
}

@After
public void tearDown() {
	hospController=null;
}

}
