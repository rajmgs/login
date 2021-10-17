package com.login.demo.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.demo.UsersService.Userlist;
import com.login.demo.model.UserList;

@Controller
public class LoginController {

	private static final Logger logger= LoggerFactory.getLogger(LoginController.class);
	@Autowired
	Userlist userlist;
	
	@RequestMapping({"/"})
	public String first() {
		logger.info("entering into first ::LoginController :: first");
		return "index";
	}
	@RequestMapping({"/loginuser"})
	public String login() {
		logger.info("entering into first ::LoginController :: login");
		return "loginuser";
	}
	@RequestMapping("/users")
	public String listUsers(UserList model) {
		logger.info("entering into first ::LoginController :: listUsers");
	    List<UserList> listUsers = userlist.findAllUser();
	   // model.addAttribute("listUsers", listUsers);
	    logger.info("exiting into first ::LoginController :: listUsers");
	    return "users";
	}

}

