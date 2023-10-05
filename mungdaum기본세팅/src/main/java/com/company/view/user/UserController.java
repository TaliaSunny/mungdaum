package com.company.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.spring_annotation.user.UserDAO;
import com.company.spring_annotation.user.UserDO;

@Controller
public class UserController {
	
	@RequestMapping("/insertUser.do")
	public String insertUser(UserDO userDO, UserDAO userDAO) {
		//기본 개발 방법에서 코딩한 10줄이 생략된다!!
		userDAO.insertUser(userDO);
		return "login.jsp";
	}
}
