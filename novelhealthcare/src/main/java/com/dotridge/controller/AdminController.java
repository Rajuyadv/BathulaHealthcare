package com.dotridge.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.bean.AdminBean;
import com.dotridge.bean.HospitalBean;
import com.dotridge.service.AdminService;
import com.dotridge.service.HospitalService;
import com.dotridge.util.ServiceConstraints;

@Controller
@RequestMapping("/adminMgmt")

public class AdminController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private HospitalService hospService;

	@RequestMapping(value = "/getAllAdmins")
	public String viewAllAdmins(Model model) {
		try {
			List<AdminBean> uiAdminList = adminService.getAllAdmins();
			// System.out.println(uiAdminList);

			int listSize = uiAdminList.size();
			int pageBarSize = Math.round(listSize / ServiceConstraints.NUM_REC_PER_PAGE + 1);
			List pageBarList = new ArrayList();
			for (int i = 0; i < pageBarSize; i++) {
				pageBarList.add(i);
			}
			System.out.println(pageBarList.size());
			model.addAttribute("pageBarList", pageBarList);

			model.addAttribute("uiAdminList", uiAdminList);
			// System.out.println(uiAdminList.size());
			return "getAdminBoard";

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;

	}

	@RequestMapping("/getAdminRegForm")
	public String getAdminRegForm(Model model) {
		AdminBean adminBean = new AdminBean();
		model.addAttribute("adminBean", adminBean);
		List<HospitalBean> hList = hospService.getAllHospitals();
		List<String> hsList = new ArrayList<String>();
		for (HospitalBean hospitalBean : hList) {
			hsList.add(hospitalBean.getHospitalName());
		}

		model.addAttribute("hospList", hsList);
		return "addAdminFormDef";

	}

	@RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
	public String addAdmin(@ModelAttribute("adminBean") AdminBean adminBean, Model model) {
		System.out.println(adminBean.toString());
		AdminBean createAdmin = adminService.createAdmin(adminBean);
		if (createAdmin.getAdminId() > 0) {
			List<AdminBean> uiAdminList = adminService.getAllAdmins();
			model.addAttribute("uiAdminList", uiAdminList);
			return "getAdminBoard";
		} else {
			System.out.println("Admin failed to add");
		}
		return "getAdminBoard";

	}

	@RequestMapping("/editAdmin")
	public String editAdmin(HttpServletRequest request, Model model) {
		String adminId = request.getParameter("adminId");
		AdminBean adminBean = adminService.getAdminById(Integer.valueOf(adminId));
		model.addAttribute("adminBean", adminBean);
		List<HospitalBean> hList = hospService.getAllHospitals();
		List<String> hsList = new ArrayList<String>();
		for (HospitalBean hospitalBean : hList) {
			hsList.add(hospitalBean.getHospitalName());
		}

		model.addAttribute("hospList", hsList);
		return "editAdminDef";

	}

	@RequestMapping(value = "/updateAdmin", method = RequestMethod.POST)
	public String updateAdmin(@ModelAttribute("adminBean") AdminBean adminBean, Model model) {
		// System.out.println(adminBean.getHospitalName());
		AdminBean updateAdmin = adminService.updateAdmin(adminBean);
		if (updateAdmin.getAdminId() > 0) {
			List<AdminBean> uiAdminList = adminService.getAllAdmins();
			model.addAttribute("uiAdminList", uiAdminList);
			return "getAdminBoard";
		} else {
			System.out.println("failed to Update");
		}
		return "getAdminBoard";

	}

	@RequestMapping("/deleteAdmin")
	public String deleteAdmin(HttpServletRequest request, Model model) {
		String adminId = request.getParameter("adminId");
		boolean deleteAdmin = adminService.deleteAdmin(Integer.valueOf(adminId));
		model.addAttribute("adminBean", deleteAdmin);
		if (deleteAdmin) {
			List<AdminBean> uiAdminList = adminService.getAllAdmins();
			model.addAttribute("uiAdminList", uiAdminList);
			return "getAdminBoard";
		} else {
			System.out.println("record not deleted");

		}
		return "getAdminBoard";
	}

	@RequestMapping("/searchAdmins")
	public String searchAdmins(HttpServletRequest request, Model model) {
		String SearchKey = request.getParameter("searchKey");
		String SearchValue = request.getParameter("searchValue");
		System.out.println(SearchKey);
		System.out.println(SearchValue);
		if (SearchKey != null && !SearchKey.isEmpty() && (SearchValue != null && !SearchValue.isEmpty())) {
			if (SearchKey.equals("firstName")) {
				List<AdminBean> uiAdminList = adminService.getAdminByName(SearchValue);
				model.addAttribute("uiAdminList", uiAdminList);
				return "getAdminBoard";
			} else if (SearchKey.equalsIgnoreCase("email")) {
				List<AdminBean> AdminList = adminService.getAdminByName(SearchValue);
				model.addAttribute("uiAdminList", AdminList);
				return "getAdminBoard";
			} else {
				System.out.println("Records not fetched");
			}

		}
		return null;
	}
	@RequestMapping("/getAllAdminsByPaging")
	public String getAllAdminsByPaging(HttpServletRequest request,Model model){
		String currentPage=request.getParameter("currentPage");
		int crPage=Integer.valueOf(currentPage);
		int NoOfRecPerPage=ServiceConstraints.NUM_REC_PER_PAGE;
		List<AdminBean> adminsByPagianation = adminService.getAllAdminsByPagianation(crPage, NoOfRecPerPage);
		model.addAttribute("uiAdminList", adminsByPagianation);
		List<AdminBean> AdminsList = adminService.getAllAdmins();
		int ListSize=AdminsList.size();
		int pageBarSize = Math.round(ListSize / ServiceConstraints.NUM_REC_PER_PAGE + 1);
		List pageBarList = new ArrayList();
		for (int i = 0; i < pageBarSize; i++) {
			pageBarList.add(i);
		}
		System.out.println(pageBarList.size());
		model.addAttribute("pageBarList", pageBarList);
		model.addAttribute("loop.count",crPage);
		return "getAdminBoard";
	
	
	}
}
