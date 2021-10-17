package com.login.demo.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.demo.UsersService.Userlist;
import com.login.demo.model.Login;
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
	@GetMapping({"/loginuser"})
	public String login() {
		logger.info("entering into first ::LoginController :: showlogin");
		return "loginuser";
		
	}
	@RequestMapping("/users")
	public String listUsers(Model model) {
		logger.info("entering into first ::LoginController :: listUsers");
	    List<UserList> listUsers = userlist.findAllUser();
	    model.addAttribute("listUsers", listUsers);
	    logger.info("exiting into first ::LoginController :: listUsers");
	    return "users";
	}
	@PostMapping({"/welcome"})
	 public String login(@ModelAttribute(name="loginForm") Login login, Model m) {
		logger.info("entering into first ::LoginController :: login");
		  String uname = login.getName();
		  String pass = login.getPassword();
		  List<UserList> listUsers = userlist.findAllUser();
		  for(UserList users: listUsers) {
			  System.out.println(users.getId());
		  if(uname.equals(users.getName()) && pass.equals(users.getPassword())) {
		   m.addAttribute("Id", users.getId());
		   m.addAttribute("name", uname);
		   logger.info("entering into first ::LoginController :: login");
		   return "welcome";}
		
		  }
		  m.addAttribute("error", "Incorrect Username & Password");
		  logger.info("entering into first ::LoginController :: login");
		  return "loginuser";
		  
		 }

}

