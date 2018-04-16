package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
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
}
