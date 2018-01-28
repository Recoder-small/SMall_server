package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Users;

@Repository
public class UsersDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Users> getUsers() {
		String sqlStatement = "select * from users";
		
		return jdbcTemplate.query(sqlStatement,  new RowMapper<Users>() {

			@Override
			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Users users = new Users();
				
				users.setUserid(rs.getString("userid"));
				users.setPassword(rs.getString("password"));
				users.setName(rs.getString("name"));
				users.setBirth(rs.getInt("birth"));
				users.setGender(rs.getString("gender"));
				
				return users;
			}
			
		});
	}
	
	public List<Users> getUserInfo(String id) {
		String sqlStatement = "select name, birth, gender from users where userid=id";
		
		return jdbcTemplate.query(sqlStatement,  new RowMapper<Users>() {

			@Override
			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Users users = new Users();
				
				users.setName(rs.getString("name"));
				users.setBirth(rs.getInt("birth"));
				users.setGender("gender");
				
				return users;
			}
			
			
		});
	}
}
