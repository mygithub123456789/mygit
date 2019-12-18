package com.java.one2mony;

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
		Configuration config = new Configuration().configure("com/java/b_hello/hibernate.cfg.xml");
		//生成SessionFactory对象 重组件
		SessionFactory sessionFactory = config.buildSessionFactory();
		//生成Session对象 有connection 将自动提交事务设置false 轻组件
		Session session = sessionFactory.openSession();
		//开始事务
		Transaction trans = session.beginTransaction();
		
		User user=new User();
		List<User> li=session.createQuery("from User").list();
		for (User u : li) {
			System.out.println(u.getUser_id()+":"+u.getUser_name()+":");
		}
		
		 //提交事务
		trans.commit();
		session.close();
	}

}
