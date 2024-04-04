package com.human.java.domain;

import lombok.Data;

@Data
public class FriendListVO {

	private int user_no;
	private String id;
	private String pw;
	private String nickname;
	private String type;
	private String withdrawal;
	
	@Override
	public String toString() {
		return "FriendListVO [user_no=" + user_no + ", id="+id+ ", pw=" + pw+", nickname="+ nickname
				+ ", type=" + type + ", withdrawal=" + withdrawal + "]";
	}
	
	
}
