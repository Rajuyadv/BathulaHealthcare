package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.PatientTest;

public interface PatientTestDao {
	public PatientTest createPatientTest(PatientTest patientTest);

	public PatientTest getPatientTestById(int id);

	public PatientTest updatePatientTest(PatientTest patientTest);

	public boolean deletePatientTest(int pId);

	public List<PatientTest> getPatientTestByName(String testName);

	public PatientTest getPatientTestByUniqueName(String name);

	public List<PatientTest> getAllPatientTests();

	public List<PatientTest> getAllPatientTestsByPagianation(int currentPage, int noOfRecPerPage);
}
