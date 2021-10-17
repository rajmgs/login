package com.login.demo.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.login.demo.model.UserList;

public class UserMapper implements RowMapper<UserList>{

	@Override
	public UserList mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		UserList user = new UserList();
		user.setId(rs.getLong("id"));
		user.setName(rs.getString("name"));
		user.setCreated(rs.getDate("created_date"));
		user.setPassword(rs.getString("password"));
		return user;
	}

}
