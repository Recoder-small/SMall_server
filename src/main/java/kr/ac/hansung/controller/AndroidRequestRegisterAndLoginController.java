package kr.ac.hansung.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Users;
import kr.ac.hansung.service.UsersService;

@Controller
public class AndroidRequestRegisterAndLoginController {
	
	@Autowired
	private UsersService usersService;

	@RequestMapping("/Android_register")
	public void Android_register(Model model) {
		List<Users> users = usersService.getCurrent();
		
	}
	
	@RequestMapping("/Android_login")
	public void Android_login(HttpServletRequest request) {
		List<Users> users = usersService.getCurrent();
		System.out.println("안드로이드 연결");

		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		System.out.println("userid = " + userid + ", " + "password = " + password);
		
	}
}
