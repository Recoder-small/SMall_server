package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BeaconInfo {

	//private String id;
	private String major;
	private String minor;
	private String location;
	private String distance;
}
