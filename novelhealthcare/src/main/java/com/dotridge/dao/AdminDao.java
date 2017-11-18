package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.Admin;

public interface AdminDao {
	public Admin createAdmin(Admin admin);

	public Admin getAdminById(int id);

	public Admin updateAdmin(Admin admin);

	public boolean deleteAdmin(int Id);

	public List<Admin> getAdminByName(String name);

	public List<Admin> getAllAdmins();

	public List<Admin> getAllAdminsByPagianation(int currentPage, int NoOfRecPerPage);

}
