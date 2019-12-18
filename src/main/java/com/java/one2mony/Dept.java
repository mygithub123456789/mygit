package com.java.one2mony;

import java.io.Serializable;
import java.util.Set;

public class Dept implements Serializable{
   private Integer dept_id;
   private String dept_name;
   private Set<User> set;
	public Dept() {
		super();
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Set<User> getSet() {
		return set;
	}
	public void setSet(Set<User> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "Dept [dept_id=" + dept_id + ", dept_name=" + dept_name + ", set=" + set + "]";
	}
	
	
	
   
}
