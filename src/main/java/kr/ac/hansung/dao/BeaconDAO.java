package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.BeaconInfo;
import kr.ac.hansung.model.Users;

@Repository
public class BeaconDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public boolean insert(BeaconInfo beaconInfo) {

		String id = beaconInfo.getId();
		String major = beaconInfo.getMajor();
		String minor = beaconInfo.getMinor();
		String location = beaconInfo.getLocation();

		String sqlStatement = "insert into beaconInfo (id, major, minor, location) values(?,?,?,?)";

		return (jdbcTemplate.update(sqlStatement,
				new Object[] { id, major, minor, location}) == 1);
	}
	
	public BeaconInfo getBeaconInfo(String id, String major, String minor) {
		String sqlStatement = "select * from beaconInfo where id=? and major=? and minor=?";
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { id, major, minor }, new RowMapper<BeaconInfo>() {

			@Override
			public BeaconInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

				BeaconInfo beaconInfo = new BeaconInfo();

				beaconInfo.setId(rs.getString("id"));
				beaconInfo.setMajor(rs.getString("major"));
				beaconInfo.setMinor(rs.getString("minor"));
				beaconInfo.setLocation(rs.getString("location"));

				return beaconInfo;

			}

		});
	}
	
}
