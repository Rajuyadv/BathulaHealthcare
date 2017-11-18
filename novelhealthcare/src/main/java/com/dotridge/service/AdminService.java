package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.AdminBean;
import com.dotridge.domain.Admin;

public interface AdminService {
	public AdminBean mapDomainToBean(Admin adminDomain);

	public Admin mapBeanToDomain(AdminBean adminBean);

	public AdminBean createAdmin(AdminBean admin);

	public AdminBean getAdminById(int id);

	public AdminBean updateAdmin(AdminBean admin);

	public boolean deleteAdmin(int Id);

	public List<AdminBean> getAdminByName(String name);

	public List<AdminBean> getAllAdmins();

	public List<AdminBean> getAllAdminsByPagianation(int currentPage, int NoOfRecPerPage);

}
