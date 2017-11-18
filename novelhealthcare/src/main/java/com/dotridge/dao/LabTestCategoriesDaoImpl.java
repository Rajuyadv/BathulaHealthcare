package com.dotridge.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.LabTestCategories;

public class LabTestCategoriesDaoImpl implements LabTestCategoriesDao {
	private SessionFactory sf;

	@Override
	public LabTestCategories createLabTestCategories(LabTestCategories labTestCategories) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(labTestCategories);
		transaction.commit();
		return labTestCategories;
	}

	@Override
	public LabTestCategories getLabTestCategoriesById(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		LabTestCategories lab = (LabTestCategories) session.get(LabTestCategories.class, id);
		transaction.commit();
		return lab;
	}

	@Override
	public LabTestCategories updateLabTestCategories(LabTestCategories labTestCategories) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(labTestCategories);
		transaction.commit();
		return labTestCategories;
	}

	@Override
	public boolean deleteLabTestCategories(int pId) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		LabTestCategories labCat = (LabTestCategories) session.get(LabTestCategories.class, pId);
		session.delete(labCat);
		transaction.commit();
		LabTestCategories lab = (LabTestCategories) session.get(LabTestCategories.class, pId);
		return (lab == null ? true : false);
	}

	@Override
	public List<LabTestCategories> getLabTestCategoriesByName(String catgryName) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "from LabTestCategories l where l.labTestCategorie like:TestCategorie";
		Query query = session.createQuery(hql);
		query.setParameter("TestCategorie", "%" + catgryName + "%");
		List<LabTestCategories> testCategorieList= query.list();
		return testCategorieList;
	}

	@Override
	public LabTestCategories getLabTestCategoriesByUniqueName(String name) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		return null;
	}

	@Override
	public List<LabTestCategories> getAllLabTestCategoriess() {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		String hql="from LabTestCategories";
		Query query = session.createQuery(hql);
		List<LabTestCategories> categories = query.list();
		return categories;
	}

	@Override
	public List<LabTestCategories> getAllLabTestCategoriessByPagianation(int currentPage, int noOfRecPerPage) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		String hql="from LabTestCategories";
		Query query = session.createQuery(hql);
		query.setFirstResult((currentPage-1)*noOfRecPerPage);
		query.setMaxResults(noOfRecPerPage);
		List<LabTestCategories> categories = query.list();
		return categories;
	}

}
