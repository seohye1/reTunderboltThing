package com.human.java.domain;

import lombok.Data;

@Data
public class FriendListVO {

	private long use_no;
	private String id;
	private String pw;
	private String nickname;
	private String type;
	private String withdrawal;
	
	@Override
	public String toString() {
		return "FriendListVO [use_no=" + use_no + ", id="+id+ ", pw=" + pw+", nickname="+ nickname
				+ ", type=" + type + ", withdrawal=" + withdrawal + "]";
	}
	
	
}
