package com.dotridge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.bean.AdminBean;
import com.dotridge.dao.AdminDao;
import com.dotridge.dao.HospitalDao;
import com.dotridge.domain.Admin;
import com.dotridge.domain.Hospital;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao admindao;
	@Autowired
	private HospitalDao hospDao;

	public AdminBean mapDomainToBean(Admin adminDomain) {
		AdminBean adminBean = new AdminBean();
		adminBean.setAdminId(adminDomain.getId());
		adminBean.setFirstName(adminDomain.getFirstName());
		adminBean.setMiddleName(adminDomain.getMiddleName());
		adminBean.setLastName(adminDomain.getLastName());
		adminBean.setEmail(adminDomain.getEmail());
		adminBean.setPassword(adminDomain.getPassword());
		adminBean.setPhone(adminDomain.getPhone());
		adminBean.setProfileDocuments(adminDomain.getProfileDocuments());
		adminBean.setStatus(adminDomain.getStatus());
		Hospital hosp = adminDomain.getHospital();
		if (hosp != null)
			adminBean.setHospitalName(hosp.getHospitalName());
		return adminBean;
	}

	public Admin mapBeanToDomain(AdminBean adminBean) {

		Admin adminDomain = new Admin();

		if (adminBean.getAdminId() > 0) {
			adminDomain.setId(adminBean.getAdminId());
		}
		adminDomain.setHospital(hospDao.getHospitalByUniqueName(adminBean.getHospitalName()));
		adminDomain.setFirstName(adminBean.getFirstName());
		adminDomain.setMiddleName(adminBean.getMiddleName());
		adminDomain.setLastName(adminBean.getLastName());
		adminDomain.setEmail(adminBean.getEmail());
		adminDomain.setPassword(adminBean.getPassword());
		adminDomain.setPhone(adminBean.getPhone());
		adminDomain.setProfileDocuments(adminBean.getProfileDocuments());
		adminDomain.setStatus(adminBean.getStatus());

		return adminDomain;
	}

	public AdminBean createAdmin(AdminBean adminBean) {
		Admin beanToDomain = mapBeanToDomain(adminBean);
		Admin createAdmin = admindao.createAdmin(beanToDomain);
		return mapDomainToBean(createAdmin);
	}

	public AdminBean getAdminById(int id) {
		Admin adminById = admindao.getAdminById(id);
		return mapDomainToBean(adminById);
	}

	public AdminBean updateAdmin(AdminBean admin) {
		Admin beanToDomain = mapBeanToDomain(admin);
		Admin updateAdmin = admindao.updateAdmin(beanToDomain);
		return mapDomainToBean(updateAdmin);
	}

	public boolean deleteAdmin(int Id) {
		boolean deleteAdmin = admindao.deleteAdmin(Id);
		return deleteAdmin;
	}

	public List<AdminBean> getAdminByName(String name) {
		List<Admin> adminByName = admindao.getAdminByName(name);
		List<AdminBean> adminListByName = null;
		if (adminByName != null && !adminByName.isEmpty()) {
			adminListByName = new ArrayList<AdminBean>();
			for (Admin adminDomain : adminByName) {
				AdminBean adminBean = mapDomainToBean(adminDomain);
				adminListByName.add(adminBean);
			}
		}
		return adminListByName;
	}

	public List<AdminBean> getAllAdmins() {
		List<Admin> adminList = admindao.getAllAdmins();
		List<AdminBean> uiAdminList = null;
		if (adminList != null && !adminList.isEmpty()) {
			uiAdminList = new ArrayList<AdminBean>();
			for (Admin adminDomain : adminList) {
				AdminBean adminBean = mapDomainToBean(adminDomain);
				uiAdminList.add(adminBean);

			}
			return uiAdminList;
		} else {
			throw new RuntimeException("no Admin available");
		}

	}

	public List<AdminBean> getAllAdminsByPagianation(int currentPage, int NoOfRecPerPage) {
		List<Admin> adminsByPagianation = admindao.getAllAdminsByPagianation(currentPage, NoOfRecPerPage);
		List<AdminBean> adminListByPagination = null;
		if (adminsByPagianation != null && !adminsByPagianation.isEmpty()) {
			adminListByPagination = new ArrayList<AdminBean>();
			for (Admin adminDomain : adminsByPagianation) {
				AdminBean adminBean = mapDomainToBean(adminDomain);
				adminListByPagination.add(adminBean);
			}
		}
		return adminListByPagination;
	}

}
