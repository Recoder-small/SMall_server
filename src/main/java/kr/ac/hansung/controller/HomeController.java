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

import kr.ac.hansung.jupyter.SendToPython;
import kr.ac.hansung.model.Users;
import kr.ac.hansung.service.UsersService;

@Controller
public class HomeController {
	
	SendToPython cm;
	String receiveData;
	
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
	
	@RequestMapping("/main")
	public void main(Model model) {
		cm = SendToPython.getInstance();
		receiveData = cm.ClientRun("6.5, 2.6, 7.5, 4.3, 6.7");
		System.out.println("main : " + receiveData);
	}
	
	@RequestMapping("/Nmain")
	public void mainN(Model model) {
		
	}
	
	@RequestMapping("/shoppingnews")
	public String shoppingnews(Model model) {
		
		return "shoppingnews";
	}
	
	@RequestMapping("/couponPage")
	public String couponPage(Model model) {
		
		return "couponPage";
	}
	
	@RequestMapping("/floorInfo")
	public String floorInfo(Model model) {
		
		return "floorInfo";
	}
	
	@RequestMapping("/recommendationService")
	public String recommendPage(Model model) {
		
		String category = "";
		
		switch(receiveData) {
		case "0": category = "beauty"; break;
		case "1": category = "fashion"; break;
		case "2": category = "general"; break;
		case "3": category = "health"; break;
		case "4": category = "sports"; break;
		}
		

		model.addAttribute("category", category);
		
		
		return "recommendationService";
	}

	
}
