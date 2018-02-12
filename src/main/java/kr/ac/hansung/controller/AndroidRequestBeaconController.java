package kr.ac.hansung.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.hansung.model.BeaconInfo;
import kr.ac.hansung.model.Users;
import kr.ac.hansung.service.BeaconService;
import kr.ac.hansung.service.UsersService;

@Controller
public class AndroidRequestBeaconController {

	@Autowired
	private BeaconService beaconService;
	
	@RequestMapping("/Android_beacon_location")
	@ResponseBody
	public Map<String, Object> Android_beacon(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String major = request.getParameter("major");
		String minor = request.getParameter("minor");

		System.out.println("id = " + id + ", " + "major = " + major + " minor = " + minor);

		try {
			BeaconInfo beaconInfo = beaconService.getBeaconInfo(id, major, minor);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("location", beaconInfo.getLocation());

			return result;

		} catch (EmptyResultDataAccessException e) {
			Map<String, Object> failresult = new HashMap<String, Object>();
			failresult.put("fail", "fail");
			System.out.println("fail");
			return failresult;
		}
		
	}
}
