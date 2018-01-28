package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.UsersDAO;
import kr.ac.hansung.model.Users;

@Service
public class UsersService {

	@Autowired
	private UsersDAO usersDao;
	
	public List<Users> getCurrent() {
		return usersDao.getUsers();
	}
}
