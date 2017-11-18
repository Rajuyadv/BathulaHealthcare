package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.LabTest;

public interface LabTestDao {
	public LabTest createLabTest(LabTest labTest);

	public LabTest getLabTestById(int id);

	public LabTest updateLabTest(LabTest labTest);

	public boolean deleteLabTest(int pId);

	public List<LabTest> getLabTestByName(String testName );

	public LabTest getLabTestByUniqueName(String name);
	
	public List<LabTest> getAllLabTests();

	public List<LabTest> getAllLabTestsByPagianation(int currentPage, int noOfRecPerPage);
}
