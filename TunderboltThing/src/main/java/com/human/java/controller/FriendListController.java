package com.human.java.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.human.java.domain.FriendListVO;
import com.human.java.service.FriendListService;

@Controller
public class FriendListController {
	private static final Logger logger = LoggerFactory.getLogger(FriendListController.class);
	
	@Autowired
	FriendListService friendListService;
	
	@RequestMapping(value = "getFriendList.do")
	private ModelAndView getFriendList(String searchCondition, String searchKeyword) {
		logger.info("getFriendList > FriendListController 진입 중");
		
		// 검색, 페이징
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		List<FriendListVO> fList = friendListService.getFriendList(map);
		
		logger.info("getFriendList > FriendListController 진입 완");
		logger.info("친구 리스트 보기 : " + fList.toString());
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/getFriendList");
		mv.addObject("friend", fList);
		
		return mv;
	}
	
}	
