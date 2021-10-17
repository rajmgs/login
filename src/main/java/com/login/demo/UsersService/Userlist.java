package com.login.demo.UsersService;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.login.demo.model.UserList;

@Repository
public interface Userlist {

	public List<UserList> findAllUser();

	
}
