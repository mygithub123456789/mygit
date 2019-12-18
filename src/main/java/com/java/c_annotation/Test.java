package com.java.c_annotation;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

public class Test {

	@org.junit.Test
	public void test() {
		Configuration config = new Configuration().configure("com/java/c_annotation/hibernate.cfg.xml");
		//生成SessionFactory对象 重组件
		SessionFactory sessionFactory = config.buildSessionFactory();
		//生成Session对象 有connection 将自动提交事务设置false 轻组件
		Session session = sessionFactory.openSession();
		//开始事务
		Transaction trans = session.beginTransaction();
		
		Dept dept=new Dept();
		dept.setDept_name("总裁办");
       dept.setDept_grade("1");
		session.save(dept);
      
		
		 //提交事务
		trans.commit();
		session.close();
	}

}
