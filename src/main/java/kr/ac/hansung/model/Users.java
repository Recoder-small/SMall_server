package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
public class Users {

	private String userid;
	private String password;
	private String name;
	private int birth;
	private String gender;
	private int stamp;

	int fashion;
	int beauty;
	int general;
	int sports;
	int health;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStamp() {
		return stamp;
	}
	public void setStamp(int stamp) {
		this.stamp = stamp;
	}
	public int getFashion() {
		return fashion;
	}
	public void setFashion(int fashion) {
		this.fashion = fashion;
	}
	public int getBeauty() {
		return beauty;
	}
	public void setBeauty(int beauty) {
		this.beauty = beauty;
	}
	public int getGeneral() {
		return general;
	}
	public void setGeneral(int general) {
		this.general = general;
	}
	public int getSports() {
		return sports;
	}
	public void setSports(int sports) {
		this.sports = sports;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
}
