package com.dotridge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.LabTest;

public class LabTestDaoImpl implements LabTestDao {
	private SessionFactory sf;
	@Override
	public LabTest createLabTest(LabTest labTest) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(labTest);
		tx.commit();
		return labTest;
	}

	@Override
	public LabTest getLabTestById(int id) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		LabTest labTest=(LabTest)sess.get(LabTest.class, id);
		tx.commit();
		return labTest;
	}

	@Override
	public LabTest updateLabTest(LabTest labTest) {
		return null;
	}

	@Override
	public boolean deleteLabTest(int pId) {
		return false;
	}

	@Override
	public List<LabTest> getLabTestByName(String testName) {
		return null;
	}

	@Override
	public LabTest getLabTestByUniqueName(String name) {
		return null;
	}

	@Override
	public List<LabTest> getAllLabTests() {
		return null;
	}

	@Override
	public List<LabTest> getAllLabTestsByPagianation(int currentPage, int noOfRecPerPage) {
		return null;
	}

}
