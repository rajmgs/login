package com.login.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(nullable = false, unique = true)
    private String name;
     
    @Column(nullable = false)
    private String password;

    @Column(nullable=false)
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
    public String getPassword() {
    	return password;
    }
    public void setPassword(String password) {
    	this.password=password;
    }
     
}
