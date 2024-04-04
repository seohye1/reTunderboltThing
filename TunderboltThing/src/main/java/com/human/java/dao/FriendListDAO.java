package com.human.java.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.java.domain.FriendListVO;

@Repository
public class FriendListDAO {
	private static final Logger logger = LoggerFactory.getLogger(FriendListDAO.class);
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public List<FriendListVO> getFriendList(HashMap map) {
		logger.info("getFriendList > FriendListDAO 진입 중");
		
		List<FriendListVO> fList = mybatis.selectList("friendMapper.getFriendList", map);
		logger.info("총 리스트 : " + fList.size());
		
		logger.info("getFriendList > FriendListDAO 진입 완");
		logger.info("fList 보기 : " + fList.toString());
		
		return fList;
	}
}
