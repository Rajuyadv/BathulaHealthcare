package com.dotridge.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.bean.HospitalBean;
import com.dotridge.dao.HospitalDao;
import com.dotridge.domain.Hospital;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	private HospitalDao hospitalDao;

	public HospitalBean mapDomainToBean(Hospital hospitalDomain) {
		HospitalBean hospitalBean = new HospitalBean();
		hospitalBean.setHospitalId(hospitalDomain.getHospitalId());
		hospitalBean.setHospitalName(hospitalDomain.getHospitalName());
		hospitalBean.setAddress(hospitalDomain.getAddress());
		hospitalBean.setEmail(hospitalDomain.getEmail());
		hospitalBean.setCity(hospitalDomain.getCity());
		hospitalBean.setState(hospitalDomain.getState());
		hospitalBean.setPhone(hospitalDomain.getPhone());
		hospitalBean.setFax(hospitalDomain.getFax());
		hospitalBean.setZipcode(hospitalDomain.getZipcode());
		hospitalBean.setStatus(hospitalDomain.getStatus());
		hospitalBean.setLogo(hospitalDomain.getLogo());
		hospitalBean.setRegistrationDocument(hospitalDomain.getRegistrationDocument());
		// TODO Auto-generated method stub
		return hospitalBean;
	}

	public Hospital mapBeanToDomain(HospitalBean hospitalBean) {
		// TODO Auto-generated method stub
		Hospital hospitalDomain = new Hospital();
		if (hospitalBean.getHospitalId() > 0) {
			hospitalDomain.setHospitalId(hospitalBean.getHospitalId());
		}
		hospitalDomain.setHospitalName(hospitalBean.getHospitalName());
		hospitalDomain.setEmail(hospitalBean.getEmail());
		hospitalDomain.setAddress(hospitalBean.getAddress());
		hospitalDomain.setAddress1(hospitalBean.getAddress1());
		hospitalDomain.setCity(hospitalBean.getCity());
		hospitalDomain.setState(hospitalBean.getState());
		hospitalDomain.setPhone(hospitalBean.getPhone());
		hospitalDomain.setFax(hospitalBean.getFax());
		hospitalDomain.setZipcode(hospitalBean.getZipcode());
		hospitalDomain.setLogo(hospitalBean.getLogo());
		hospitalDomain.setStatus(hospitalBean.getStatus());
		hospitalDomain.setRegistrationDocument(hospitalBean.getRegistrationDocument());
		hospitalDomain.setCreatedBy("superAdmin");
		hospitalDomain.setModifiedBy("superAdmin");

		Date date = new Date();
		hospitalDomain.setCreatedDate(date);
		hospitalDomain.setModifiedDate(date);
		return hospitalDomain;
	}

	public HospitalBean createHospital(HospitalBean hospitalBean) {

		// TODO Auto-generated method stub
		Hospital beanToDomain = mapBeanToDomain(hospitalBean);
		Hospital hospitalBean1 = hospitalDao.createHospital(beanToDomain);
		HospitalBean domainToBean = mapDomainToBean(hospitalBean1);

		return domainToBean;
	}

	public HospitalBean getHospitalById(int id) {
		Hospital hospitalDomain = hospitalDao.getHospitalById(id);
		return mapDomainToBean(hospitalDomain);

	}

	public HospitalBean updateHospital(HospitalBean hs) {

		Hospital beanToDomain = mapBeanToDomain(hs);
		Hospital updateHospital = hospitalDao.updateHospital(beanToDomain);
		HospitalBean domainToBean = mapDomainToBean(updateHospital);
		return domainToBean;
	}

	public boolean deleteHospital(int pId) {
		boolean deleteHospital = hospitalDao.deleteHospital(pId);

		return deleteHospital;
	}

	public List<HospitalBean> getHospitalByName(String hname) {

		List<Hospital> hospitalByName = hospitalDao.getHospitalByName(hname);
		List<HospitalBean> hospListByName = null;
		if (hospitalByName != null && !hospitalByName.isEmpty()) {
			hospListByName = new ArrayList<HospitalBean>();
			for (Hospital hospital : hospitalByName) {
				HospitalBean hospitalBean = mapDomainToBean(hospital);
				hospListByName.add(hospitalBean);
			}
		}
		return hospListByName;
	}

	public List<HospitalBean> getHospitalByEmail(String email) {
		List<Hospital> hospitalByEmail = hospitalDao.getHospitalByEmail(email);
		List<HospitalBean> hospListByEmail = null;
		if (hospitalByEmail != null && !hospitalByEmail.isEmpty()) {
			hospListByEmail = new ArrayList<HospitalBean>();
			for (Hospital hospital : hospitalByEmail) {
				HospitalBean hospitalBean = mapDomainToBean(hospital);
				hospListByEmail.add(hospitalBean);
			}
		}
		return hospListByEmail;

	}

	public List<HospitalBean> getHospitalByPhone(long phone) {
		List<Hospital> hospitalByPhone = hospitalDao.getHospitalByPhone(phone);
		List<HospitalBean> hospListByPhone = null;
		if (hospitalByPhone != null && !hospitalByPhone.isEmpty()) {
			hospListByPhone = new ArrayList<HospitalBean>();
			for (Hospital hospital : hospitalByPhone) {
				HospitalBean hospitalBean = mapDomainToBean(hospital);
				hospListByPhone.add(hospitalBean);
			}
		}
		return hospListByPhone;

	}

	public List<HospitalBean> getAllHospitals() {
		// TODO Auto-generated method stub
		List<Hospital> hospitalList = hospitalDao.getAllHospitals();
		List<HospitalBean> uiHospList = null;
		if (hospitalList != null && !hospitalList.isEmpty()) {
			uiHospList = new ArrayList<HospitalBean>();
			for (Hospital hospDomain : hospitalList) {
				HospitalBean hospitalBean = mapDomainToBean(hospDomain);
				uiHospList.add(hospitalBean);

			}
			return uiHospList;
		} else {
			throw new RuntimeException("no hospitals available");
		}
	}

	public List<HospitalBean> getAllHospitalsByPagianation(int currentPage, int NoOfRecPerPage) {
		// TODO Auto-generated method stub
		List<Hospital> hospitalsByPagianation = hospitalDao.getAllHospitalsByPagianation(currentPage, NoOfRecPerPage);
		List<HospitalBean> hospListByPagination = null;
		if (hospitalsByPagianation != null && !hospitalsByPagianation.isEmpty()) {
			hospListByPagination = new ArrayList<HospitalBean>();
			for (Hospital hospital : hospitalsByPagianation) {
				HospitalBean hospitalBean = mapDomainToBean(hospital);
				hospListByPagination.add(hospitalBean);
			}
		}
		return hospListByPagination;

	}

}
