package kr.ac.hansung.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.hansung.jupyter.SendToPython;
import kr.ac.hansung.model.Users;
import kr.ac.hansung.service.UsersService;

@Controller
public class AndroidRequestRegisterAndLoginController {

	/*SendToPython cm;
	String receiveData;
	// 두개의 함수에서 쓰임
	String userid;
	String password;*/
	//Users user;

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
		String stamp = request.getParameter("stamp");
		int birth = Integer.parseInt(birth_text);
		// 관심사
		String fashion_str = request.getParameter("fashion_point");
		String beauty_str = request.getParameter("beauty_point");
		String general_str = request.getParameter("general_point");
		String sports_str = request.getParameter("sports_point");
		String health_str = request.getParameter("health_point");

		System.out.println(
				"str = " + fashion_str + " " + beauty_str + " " + general_str + " " + sports_str + " " + health_str);

		int stampCnt = 0;

		System.out.println("stampCnt = " + stampCnt);

		// 관심사 int형
		int fashion = Integer.parseInt(fashion_str);
		int beauty = Integer.parseInt(beauty_str);
		int general = Integer.parseInt(general_str);
		int sports = Integer.parseInt(sports_str);
		int health = Integer.parseInt(health_str);

		System.out.println("int = " + fashion + " " + beauty + " " + general + " " + sports + " " + health);

		Users user = new Users();
		user.setUserid(userid);
		user.setPassword(password);
		user.setName(name);
		user.setBirth(birth);
		user.setGender(gender);
		user.setStamp(stampCnt);
		user.setFashion(fashion);
		user.setBeauty(beauty);
		user.setGeneral(general);
		user.setSports(sports);
		user.setHealth(health);

		boolean check = usersService.insert(user);
		Map<String, String> result = new HashMap<String, String>();

		System.out.println("check = " + check);

		if (check == true) {
			result.put("OK", "OK");
		} else
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
			} else {
				result.put("OK", "OK");
			}
		}

		return result;
	}

	@RequestMapping("/Android_login") //post 함수 쓰기
	@ResponseBody
	public Map<String, Object> Android_login(HttpServletRequest request) {
		System.out.println("안드로이드 연결");

		String userid = request.getParameter("userid");
		String password = request.getParameter("password");


		try {
			Users user = usersService.getUserInfo(userid, password);
			SendToPython sendToPython = SendToPython.getInstance();

			
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("userid", userid);
			result.put("password", user.getPassword());
			result.put("name", user.getName());
			result.put("birth", user.getBirth());
			result.put("gender", user.getGender());
			result.put("stamp", user.getStamp());

			int fashion = user.getFashion();
			int beauty = user.getBeauty();
			int general = user.getGeneral();
			int sports = user.getSports();
			int health = user.getHealth();

			result.put("fashion", fashion);
			result.put("beauty", beauty);
			result.put("general", general);
			result.put("sports", sports);
			result.put("health", health);

			String favorite = "";

			switch (sendToPython.getReceiveData()) {
			case "0":
				favorite = "beauty";
				break;
			case "1":
				favorite = "fashion";
				break;
			case "2":
				favorite = "general";
				break;
			case "3":
				favorite = "health";
				break;
			case "4":
				favorite = "sports";
				break;
			}
			result.put("favorite", favorite);

			
			/*SendToPython cm = SendToPython.getInstance();
			String receiveData = cm.ClientRun(fashion + ", " + beauty + ", " + general + ", " + sports + ", " + health);
			System.out.println("login : " + receiveData);*/

			return result;

		} catch (EmptyResultDataAccessException e) {
			Map<String, Object> failresult = new HashMap<String, Object>();
			failresult.put("fail", "fail");
			System.out.println("fail");
			return failresult;
		}
	}

	@RequestMapping("/Android_login/recommendationService/{id}") ///Android_login/recommendationService/{userId}로 해보기
	public String recommendPage(Model model, @PathVariable String id ) {
		
		Users user = usersService.getUserInfo(id);
		
		SendToPython sendToPython = SendToPython.getInstance();
		
		int fashion = user.getFashion();
		int beauty = user.getBeauty();
		int general = user.getGeneral();
		int sports = user.getSports();
		int health = user.getHealth();
		
		SendToPython cm = SendToPython.getInstance();
		String receiveData = cm.ClientRun(fashion + ", " + beauty + ", " + general + ", " + sports + ", " + health);
		System.out.println("login : " + receiveData);
				

		String category = "";

		switch (receiveData) {
		case "0":
			category = "beauty";
			break;
		case "1":
			category = "fashion";
			break;
		case "2":
			category = "general";
			break;
		case "3":
			category = "health";
			break;
		case "4":
			category = "sports";
			break;
		}
		System.out.println("login_receiveData = " + receiveData);
		model.addAttribute("user", user);
		System.out.println("user = " + user);
		System.out.println("category = " + category);
		model.addAttribute("category", category);
		
		return "recommendationService";
	}
}
