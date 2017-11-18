/**
 * 
 */
package com.dotridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.bean.LoginBean;
import com.dotridge.bean.ManageUserProfileBean;

/**
 * @author Raju
 *
 */
@Controller
public class HomeController {
	@RequestMapping(value = "/home")
	public String getHomePage() {
		// System.out.println("home request");
		return "home";

	}

	@RequestMapping(value = "/getLoginPage")
	public String getLoginPage(Model model) {
		model.addAttribute("loginBean", new LoginBean());
		return "login";

	}

	@RequestMapping(value = "/login")
	public String doLogin(@ModelAttribute("loginBean") LoginBean loginBean) {
		System.out.println(loginBean.toString());
		String userName = loginBean.getUserId();
		if (userName != null && !userName.isEmpty()) {
			if (userName.equalsIgnoreCase("superadmin@email.com"));
			return "getSuperAdminBoard";
		}
		
		return "home";

	}

	@RequestMapping(value = "/getSignUpPage")
	public String getSignupPage(Model model) {
		model.addAttribute("ManageUserProfileBean", new ManageUserProfileBean());
		return "registration";
	}

	@RequestMapping(value = "/registration")
	public String doSignUp(@ModelAttribute("ManageUserProfileBean") ManageUserProfileBean manageUserProfileBean) {
		System.out.println(manageUserProfileBean.toString());
		return "success";
	}

	/*
	 * @RequestMapping(params = "/cancel", method = RequestMethod.POST) public
	 * String cancelSignUp() { return "registration"; }
	 */
}
