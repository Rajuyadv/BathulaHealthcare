package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.dotridge.domain.Admin;
import com.dotridge.util.SesssionFactoryUtil;

@Repository
public class AdminDaoImpl implements AdminDao {

	
	public Admin createAdmin(Admin admin) {
		SessionFactory sessionFactory = SesssionFactoryUtil.getSessionFactory();
		Session ses = sessionFactory.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(admin);
		tx.commit();
		return admin;
	}

	public Admin getAdminById(int id) {
		SessionFactory sessionFactory = SesssionFactoryUtil.getSessionFactory();
		Session ses = sessionFactory.openSession();
		Transaction tx = ses.beginTransaction();
		Admin adnim = (Admin) ses.load(Admin.class, id);
		tx.commit();
		return adnim;
	}

	public Admin updateAdmin(Admin admin) {
		SessionFactory sessionFactory = SesssionFactoryUtil.getSessionFactory();
		Session ses = sessionFactory.openSession();
		Transaction tx = ses.beginTransaction();
		ses.merge(admin);
		tx.commit();
		return admin;
	}

	public boolean deleteAdmin(int id) {
		SessionFactory sessionFactory = SesssionFactoryUtil.getSessionFactory();
		Session ses = sessionFactory.openSession();
		Transaction tx = ses.beginTransaction();
		Admin admin = (Admin) ses.load(Admin.class, id);
		ses.delete(admin);
		tx.commit();
		Admin admn1 = (Admin) ses.get(Admin.class, id);
		return (admn1 == null ? true : false);
	}

	public List<Admin> getAdminByName(String name) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SesssionFactoryUtil.getSessionFactory();
		Session ses = sessionFactory.openSession();
		Transaction tx = ses.beginTransaction();
		String hql = "from Admin a where a.firstName like:FirstName";
		Query query = ses.createQuery(hql);
		query.setParameter("FirstName", "%" + name + "%");
		List<Admin> adminList = query.list();
		return adminList;
	}

	public List<Admin> getAllAdmins() {
		SessionFactory sessionFactory = SesssionFactoryUtil.getSessionFactory();
		Session ses = sessionFactory.openSession();
		Transaction tx = ses.beginTransaction();
		String hql = "from Admin";
		Query query = ses.createQuery(hql);
		List<Admin> adminList = query.list();
		return adminList;
	}

	@SuppressWarnings("unchecked")
	public List<Admin> getAllAdminsByPagianation(int currentPage, int NoOfRecPerPage) {
		SessionFactory sessionFactory = SesssionFactoryUtil.getSessionFactory();
		Session ses = sessionFactory.openSession();
		//Transaction tx = ses.beginTransaction();
		String hql = "from Admin";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentPage - 1) * NoOfRecPerPage);
		query.setMaxResults(NoOfRecPerPage);
		List<Admin> adminList = query.list();
		return adminList;
	}

}
