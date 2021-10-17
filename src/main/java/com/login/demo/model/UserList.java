package com.login.demo.model;

import java.util.Date;


public class UserList {
	 private Long id;
	 private String name;
	 private Date created_date;
	    public Date getCreated() {
	    	return created_date;
	    }
	    public void setCreated(Date create) {
	    	this.created_date=create;
	    }
	    public Long  getId() {
	    	return id;
	    }
	    public void setId(Long id) {
	    	this.id=id;
	    }
	    public String getName() {
			return name;
	    }
	    public void setName(String name) {
	    	this.name=name;
	    }
	    
	    
}
