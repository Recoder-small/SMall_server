package kr.ac.hansung.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.hansung.model.Users;
import kr.ac.hansung.service.UsersService;

@Controller
public class HomeController {
	
	@Autowired
	private UsersService usersService;

	@RequestMapping("/test")
	public @ResponseBody String test() {
		return "Hello, Spring Boot!";
	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		List<Users> users = usersService.getCurrent();
		model.addAttribute("users", users);
		
		System.out.println(users.get(0).toString());
		
		return "home";
	}
	
}
