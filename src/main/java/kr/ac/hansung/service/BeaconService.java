package kr.ac.hansung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.BeaconDAO;
import kr.ac.hansung.model.BeaconInfo;
import kr.ac.hansung.model.Users;

@Service
public class BeaconService {
	
	@Autowired
	private BeaconDAO beaconDao;
	
	public boolean insert(BeaconInfo beaconInfo) {
		return beaconDao.insert(beaconInfo);
	}

	public BeaconInfo getBeaconInfo(String id, String major, String minor) {
		return beaconDao.getBeaconInfo(id, major, minor);
	}
}
