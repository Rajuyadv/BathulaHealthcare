package com.dotridge.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dotridge.domain.Hospital;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HospitalDaoTest {
	@Autowired
	private HospitalDao hospDao;
	@Test
	public void tesGetAllHospitals() {
		List<Hospital> hospitalsList = hospDao.getAllHospitals();
		Assert.assertNotNull(hospitalsList);
		Assert.assertEquals(9, hospitalsList.size());

	}

	@After
	public void tearDown() {
		hospDao = null;
	}
}
