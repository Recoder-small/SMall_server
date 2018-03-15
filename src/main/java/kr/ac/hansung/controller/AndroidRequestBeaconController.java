package kr.ac.hansung.controller;

import java.util.ArrayList;
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
	
	private ArrayList<BeaconInfo> beacons = new ArrayList<BeaconInfo>();
	
	@RequestMapping("/Android_beacon_location")
	@ResponseBody
	public Map<String, Object> Android_beacon(HttpServletRequest request) {
		
		String array[] = request.getParameter("beaconinfo1").split("/");
		String major = array[0];
		String minor = array[1];
		
		
		//String id = request.getParameter("id");
		//String major = request.getParameter("major");
		//String minor = request.getParameter("minor");
		
		//BeaconInfo beaconInfo1 = request.getParameter("beaconInfo1");
		//beacons.add(beaconInfo1);

		System.out.println("major = " + major + " minor = " + minor);

		/*try {
			// 비콘3개위치로 현재위치 잡기
			BeaconInfo beaconInfo = beaconService.getBeaconInfo(major, minor);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("location", beaconInfo.getLocation());

			return result;

		} catch (EmptyResultDataAccessException e) {
			Map<String, Object> failresult = new HashMap<String, Object>();
			failresult.put("fail", "fail");
			System.out.println("fail");
			return failresult;
		}*/
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("location", "hihi");

		return result;
		
	}
}
