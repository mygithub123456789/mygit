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
		//����SessionFactory���� �����
		SessionFactory sessionFactory = config.buildSessionFactory();
		//����Session���� ��connection ���Զ��ύ��������false �����
		Session session = sessionFactory.openSession();
		//��ʼ����
		Transaction trans = session.beginTransaction();
		
		Dept dept=new Dept();
		dept.setDept_name("�ܲð�");
       dept.setDept_grade("1");
		session.save(dept);
      
		
		 //�ύ����
		trans.commit();
		session.close();
	}

}
