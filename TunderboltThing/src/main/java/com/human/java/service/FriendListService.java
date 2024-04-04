package com.human.java.service;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.java.dao.FriendListDAO;
import com.human.java.domain.FriendListVO;

@Service
public class FriendListService {
	private static final Logger logger = LoggerFactory.getLogger(FriendListService.class);

	@Autowired
	FriendListDAO friendListDAO;
	
	public List<FriendListVO> getFriendList(HashMap map) {
		logger.info("getFriendList > FriendListService 진입 중");
		
//		friendListDAO.getFriendList(map);
		
		logger.info("getFriendList > FriendListService 진입 완");
		return friendListDAO.getFriendList(map);
	}

}
