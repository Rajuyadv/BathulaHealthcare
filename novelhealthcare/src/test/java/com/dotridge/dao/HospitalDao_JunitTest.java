package com.dotridge.dao;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.dotridge.domain.Hospital;

public class HospitalDao_JunitTest {
	private HospitalDao hospDao;
	@Before
public void setUp(){
		hospDao=new HospitalDaoImpl();
	
}
	@Test
	@Ignore
	public void tesGetAllHospitals(){
		List<Hospital> hospitalsList = hospDao.getAllHospitals();
		Assert.assertNotNull(hospitalsList);
		Assert.assertEquals(7, hospitalsList.size());
		
	}
	@Test
	@Ignore
	public void testAddHospital() throws CloneNotSupportedException{
		Hospital hospital = new Hospital();

		hospital.setHospitalName("kims");
		hospital.setCity("hyd");
		hospital.setAddress("ramangr");
		hospital.setAddress1("ameerpet");
		hospital.setState("Tel");
		hospital.setEmail("kims@services.com");
		hospital.setPhone(97002018l);
		hospital.setFax(404567845l);
		hospital.setZipcode(500028);
		hospital.setCreatedBy("superAdmin");
		hospital.setModifiedBy("superAdmin");
		hospital.setStatus("Inactive");
		Date date = new Date();
		hospital.setCreatedDate(date);
		hospital.setModifiedDate(date);
		hospital.setLogo("photo");
		hospital.setRegistrationDocument("file");
		Hospital createHospital = hospDao.createHospital(hospital);
		Hospital hospital1 =(Hospital)hospital.clone();
		Assert.assertNotNull(createHospital);
		Assert.assertNotEquals(hospital1, createHospital);
		//Assert.assertEquals("wrgl", createHospital.getCity());
		
	}@Test
	@Ignore
	public void testDeleteHospital(){
		
		boolean deleteHospital = hospDao.deleteHospital(20);
		Assert.assertNotNull(deleteHospital);
		Assert.assertTrue(deleteHospital);
	}
	@After
public void tearDown(){
	hospDao=null;
}
	
}
