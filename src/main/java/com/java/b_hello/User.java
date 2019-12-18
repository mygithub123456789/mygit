package com.java.b_hello;

public class User {
   private Integer user_id;
   private String user_name;
 
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

public Dept getDept() {
	return dept;
}

public void setDept(Dept dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "User [user_id=" + user_id + ", user_name=" + user_name + ", dept=" + dept + "]";
}
   
   
   
}
