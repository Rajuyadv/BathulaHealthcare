package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.TestType;

public interface TestTypeDao {
	public TestType createTestType(TestType testType);

	public TestType getTestTypeById(int id);

	public TestType updateTestType(TestType testType);

	public boolean deleteTestType(int pId);

	public List<TestType> getTestTypeByName(String testName );

	public TestType getTestTypeByUniqueName(String name);
	
	public List<TestType> getAllTestTypes();

	public List<TestType> getAllTestTypesByPagianation(int currentPage, int noOfRecPerPage);
}
