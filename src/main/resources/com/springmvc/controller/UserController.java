package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.dao.UserDao;
import com.springmvc.service.UserService;
import com.springmvc.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	/**
	 *  获取用户列表
	 */
	@RequestMapping("userList")
	public String userList(HttpServletRequest request, ModelMap modelMap){
		
		@SuppressWarnings("unchecked")
		List<User> userList = userService.getUserList();
		modelMap.addAttribute("userList", userList);
		
		return "user/userList";
	}
	
}
