package kr.ac.hansung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.service.UsersService;

@Controller
public class AndroidRequestStempController {

	@Autowired
	private UsersService usersService;
	
}
