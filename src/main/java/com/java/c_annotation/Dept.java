package com.java.c_annotation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="dept01")
public class Dept implements Serializable{
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer dept_id;
   @Column()
   private String dept_name;
   @Column()
   private String dept_grade;
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
	
	

	public String getDept_grade() {
		return dept_grade;
	}
	public void setDept_grade(String dept_grade) {
		this.dept_grade = dept_grade;
	}
	@Override
	public String toString() {
		return "Dept [dept_id=" + dept_id + ", dept_name=" + dept_name + ", dept_grade=" + dept_grade + "]";
	}
   
   
}
