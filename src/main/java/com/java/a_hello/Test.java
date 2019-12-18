package com.java.a_hello;

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
		Configuration config = new Configuration().configure("com/java/a_hello/hibernate.cfg.xml");
		//����SessionFactory���� �����
		SessionFactory sessionFactory = config.buildSessionFactory();
		//����Session���� ��connection ���Զ��ύ��������false �����
		Session session = sessionFactory.openSession();
		//��ʼ����
		Transaction trans = session.beginTransaction();
		//����hibernate����
		
		//����
//		User dept = new User();	
//		dept.setUser_name("zhao");
//		dept.setUser_pwd("zhao");
//		session.save(dept);
		
		//ɾ��
//         User dept = new User();
//		 dept.setUser_id(3);
//		 session.delete(dept);
		 
		 //�޸�
//		 User dept = new User();
//		 dept.setUser_id(2);
//		 dept.setUser_name("root01");
//		 dept.setUser_pwd("123456");
//		 session.update(dept);
		 
		 //��ѯ
		 //������ѯ     get��ʽ
//		 User u=(User) session.get(User.class,2 );
//		 System.out.println(u);
		
		 //������ѯ     load��ʽ
//		 User u1=(User) session.load(User.class,2 );
//		 System.out.println(u1);
		 
		 //��ѯ����    ��ʽ һ��hql��ʽ��ѯ
//		 Query qu=session.createQuery("from User");
//		 List<User> li=qu.list();
//		 System.out.println(li);
		
		//��������ѯ
		 
		//��ѯ����    ��ʽ ����sql��ʽ��ѯ
//		Query qu01=session.createSQLQuery("select * from user").addEntity(User.class);
//		List<User> li01=qu01.list();
//		System.out.println(li01);
		
		//��ѯ����    ��ʽ ����qbc��ʽ��ѯ
//		Criteria qu02=session.createCriteria(User.class);
//		List<User> li02=qu02.list();
//		System.out.println(li02);
		
		//like  ģ����ѯ����
//		Criteria qu03=session.createCriteria(User.class);
//		SimpleExpression like = Restrictions.like("user_name", "%z%");
//		qu03.add(like);
//		List<User> li03=qu03.list();
//		System.out.println(li03);
		
		//limit ��Χ��ѯ
		Criteria qu03=session.createCriteria(User.class);
        qu03.setFirstResult(0); //��ʼλ��
        qu03.setMaxResults(2);  //��ѯ����
		List<User> li03=qu03.list();
		System.out.println(li03);
		
		//����������ѯ
		/*
		Restrictions.gt(propertyName, value);  //����
		Restrictions.ge(propertyName, value);  //���ڵ���
		Restrictions.lt(propertyName, value);  //С��
		Restrictions.le(propertyName, value);  //С�ڵ���
		Restrictions.eq(propertyName, value);  //����
		Restrictions.in(propertyName, values); //��in��Χ֮��
		Restrictions.ne(propertyName, value);  //������
		Restrictions.and(predicates);          //����
		Restrictions.or(predicates);           //����
		 */
		
		 //�ύ����
		trans.commit();
		session.close();
	}

}
