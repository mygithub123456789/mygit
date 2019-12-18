package com.java.c_annotation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user01")
public class User {
	@Id
   private Integer user_id;
	@Column
   private String user_name;
	
	@ManyToOne
	@JoinColumn()
   private Dept dept;

public Integer getUser_id() {
	return user_id;
}

public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}

public String getUser_name() {
	return user_name;
}

public void setUser_name(String user_name) {
	this.user_name = user_name;
}

4h

@Override
public String toString() {
	return "User [user_id=" + user_id + ", user_name=" + user_name + ", dept_id=" + dept_id + "]";
}



   
   
   
}
