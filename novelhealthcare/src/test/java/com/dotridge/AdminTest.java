package com.dotridge;

import com.dotridge.dao.AdminDao;
import com.dotridge.dao.AdminDaoImpl;
import com.dotridge.dao.HospitalDao;
import com.dotridge.dao.HospitalDaoImpl;
import com.dotridge.domain.Admin;
import com.dotridge.domain.Hospital;

public class AdminTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDao dao = new AdminDaoImpl();
		HospitalDao hsDao=new HospitalDaoImpl();
		Admin admin = new Admin();
		
		Hospital hs=new Hospital();
		admin.setFirstName("Cherry");
		admin.setMiddleName("m");
		admin.setLastName("yadav");
		admin.setEmail("cherry@gmail.com");
		admin.setPassword("cherry123");
		admin.setPhone(7893499502l);
		admin.setProfileDocuments("file");
		admin.setStatus("inactive");
		Hospital byId = hsDao.getHospitalById(4);
		admin.setHospital(byId);
		Admin createAdmin = dao.createAdmin(admin);
		System.out.println(createAdmin);
		
	
		
		//Hospital byId = hsDao.getHospitalById(2);
		/*Admin adminById = dao.getAdminById(3);
		//adminById.getHospital();
		//System.out.println(adminById);
		adminById.setEmail("raj@gmail.com");
		Admin updateAdmin = dao.updateAdmin(adminById);
		System.out.println(updateAdmin);*/
		
		
		
	}

}
