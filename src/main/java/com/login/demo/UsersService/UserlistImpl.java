package com.login.demo.UsersService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.login.demo.Util.Utils;
import com.login.demo.model.UserList;
import com.login.demo.RowMapper.UserMapper;
@Repository
public class UserlistImpl implements Userlist{

	@Autowired
	@Qualifier("jdbcTemplateu")
	JdbcTemplate jdbcTemplate;
	private static final Logger logger= LoggerFactory.getLogger(UserlistImpl.class);

@Override
public List<UserList> findAllUser() {
	logger.info("entering into findalluser::UserlistImpl ");
	List<UserList> user=null;
	String query=Utils.readProperties("getalluser");
	user= jdbcTemplate.query(query, new UserMapper());
	logger.info("query result "+user);
	for(UserList users: user) {
		System.out.println(users.getId());
	}
	logger.info("exiting into findalluser::UserlistImpl ");
	// TODO Auto-generated method stub
	return user;
}

public UserList findByName(String username) {
	// TODO Auto-generated method stub
	logger.info("entering into findalluser::UserlistImpl ");
	UserList user=null;
	String query=Utils.readProperties("getalluserByname");
	user= (UserList) jdbcTemplate.query(query, new UserMapper());
	logger.info("query result "+user);
	
		System.out.println(user.getId());
		logger.info("exiting into findalluser::UserlistImpl ");
		// TODO Auto-generated method stub
		return user;
	}
	
}

