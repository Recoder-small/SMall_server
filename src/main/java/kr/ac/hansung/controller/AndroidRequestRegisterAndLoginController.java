package kr.ac.hansung.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.hansung.model.Users;
import kr.ac.hansung.service.UsersService;

@Controller
public class AndroidRequestRegisterAndLoginController {

	@Autowired
	private UsersService usersService;

	@RequestMapping("/Android_register")
	@ResponseBody
	public Map<String, String> Android_register(HttpServletRequest request) {

		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String birth_text = request.getParameter("birth");
		String gender = request.getParameter("gender");
		
		int birth = Integer.parseInt(birth_text);
		
		Users user = new Users();
		user.setUserid(userid);
		user.setPassword(password);
		user.setName(name);
		user.setBirth(birth);
		user.setGender(gender);
		
		boolean check = usersService.insert(user);
		Map<String, String> result = new HashMap<String, String>();
		
		System.out.println("check = " + check);
		
		if(check == true) {
			result.put("OK", "OK");
		}
		else
			result.put("NOK", "NOK");
		
		return result;
		
		
	}

	@RequestMapping("/Android_login_duplicate_check")
	@ResponseBody
	public Map<String, String> Android_register_login_duplicate_check(HttpServletRequest request) {
		System.out.println("안드로이드 연결_아이디 중복확인");

		String id = request.getParameter("userid");
		System.out.println("userid = " + id);

		List<Users> users = usersService.getIds();
		Map<String, String> result = new HashMap<String, String>();
		for (int i = 0; i < users.size(); i++) {
			if (id.equals(users.get(i).getUserid())) {
				result.put("NOK", "NOK");
			}
			else {
				result.put("OK", "OK");
			}
		}
		
		return result;
	}

	@RequestMapping("/Android_login")
	@ResponseBody
	public Map<String, Object> Android_login(HttpServletRequest request) {
		System.out.println("안드로이드 연결");

		String userid = request.getParameter("userid");
		String password = request.getParameter("password");

		System.out.println("userid = " + userid + ", " + "password = " + password);

		try {
			Users user = usersService.getUserInfo(userid, password);

			System.out.println(
					"name = " + user.getName() + " birth = " + user.getBirth() + " gdneder = " + user.getGender());

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("userid", userid);
			result.put("password", user.getPassword());
			result.put("name", user.getName());
			result.put("birth", user.getBirth());
			result.put("gender", user.getGender());

			return result;

		} catch (EmptyResultDataAccessException e) {
			Map<String, Object> failresult = new HashMap<String, Object>();
			failresult.put("fail", "fail");
			System.out.println("fail");
			return failresult;
		}

	}
}
