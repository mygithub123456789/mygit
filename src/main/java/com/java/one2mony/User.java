package com.java.one2mony;

public class User {
   private Integer user_id;
   private String user_name;
   private Integer dept_id;

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

public Integer getDept_id() {
	return dept_id;
}

public void setDept_id(Integer dept_id) {
	this.dept_id = dept_id;
}

@Override
public String toString() {
	return "User [user_id=" + user_id + ", user_name=" + user_name + ", dept_id=" + dept_id + "]";
}


   
   
}
