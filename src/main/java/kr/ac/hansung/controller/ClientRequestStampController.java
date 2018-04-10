package kr.ac.hansung.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.hansung.service.UsersService;

@Controller
public class ClientRequestStampController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/Android_saveStamp")
	@ResponseBody
	public void saveStamp(HttpServletRequest request) {
		
		String id = request.getParameter("userid");
		String stamp = request.getParameter("stamp");
		
		int stampCnt = Integer.parseInt(stamp);
		
		usersService.saveStamp(id, stampCnt);

	}
}
