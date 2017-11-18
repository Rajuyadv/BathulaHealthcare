package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.HospitalBean;
import com.dotridge.domain.Hospital;

public interface HospitalService {
	public HospitalBean mapDomainToBean(Hospital hospitalDomain);

	public Hospital mapBeanToDomain(HospitalBean hospitalBean);

	public HospitalBean createHospital(HospitalBean hospitalBean);

	public HospitalBean getHospitalById(int id);

	public HospitalBean updateHospital(HospitalBean hs);

	public boolean deleteHospital(int pId);

	public List<HospitalBean> getHospitalByName(String hname);

	public List<HospitalBean> getHospitalByEmail(String email);

	public List<HospitalBean> getHospitalByPhone(long phone);

	public List<HospitalBean> getAllHospitals();

	public List<HospitalBean> getAllHospitalsByPagianation(int currentPage, int NoOfRecPerPage);
}
