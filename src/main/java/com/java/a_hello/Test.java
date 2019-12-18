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
		//生成SessionFactory对象 重组件
		SessionFactory sessionFactory = config.buildSessionFactory();
		//生成Session对象 有connection 将自动提交事务设置false 轻组件
		Session session = sessionFactory.openSession();
		//开始事务
		Transaction trans = session.beginTransaction();
		//调用hibernate方法
		
		//增加
//		User dept = new User();	
//		dept.setUser_name("zhao");
//		dept.setUser_pwd("zhao");
//		session.save(dept);
		
		//删除
//         User dept = new User();
//		 dept.setUser_id(3);
//		 session.delete(dept);
		 
		 //修改
//		 User dept = new User();
//		 dept.setUser_id(2);
//		 dept.setUser_name("root01");
//		 dept.setUser_pwd("123456");
//		 session.update(dept);
		 
		 //查询
		 //单个查询     get方式
//		 User u=(User) session.get(User.class,2 );
//		 System.out.println(u);
		
		 //单个查询     load方式
//		 User u1=(User) session.load(User.class,2 );
//		 System.out.println(u1);
		 
		 //查询所有    方式 一：hql方式查询
//		 Query qu=session.createQuery("from User");
//		 List<User> li=qu.list();
//		 System.out.println(li);
		
		//加条件查询
		 
		//查询所有    方式 二：sql方式查询
//		Query qu01=session.createSQLQuery("select * from user").addEntity(User.class);
//		List<User> li01=qu01.list();
//		System.out.println(li01);
		
		//查询所有    方式 三：qbc方式查询
//		Criteria qu02=session.createCriteria(User.class);
//		List<User> li02=qu02.list();
//		System.out.println(li02);
		
		//like  模糊查询（）
//		Criteria qu03=session.createCriteria(User.class);
//		SimpleExpression like = Restrictions.like("user_name", "%z%");
//		qu03.add(like);
//		List<User> li03=qu03.list();
//		System.out.println(li03);
		
		//limit 范围查询
		Criteria qu03=session.createCriteria(User.class);
        qu03.setFirstResult(0); //开始位置
        qu03.setMaxResults(2);  //查询个数
		List<User> li03=qu03.list();
		System.out.println(li03);
		
		//其它条件查询
		/*
		Restrictions.gt(propertyName, value);  //大于
		Restrictions.ge(propertyName, value);  //大于等于
		Restrictions.lt(propertyName, value);  //小于
		Restrictions.le(propertyName, value);  //小于等于
		Restrictions.eq(propertyName, value);  //等于
		Restrictions.in(propertyName, values); //在in范围之内
		Restrictions.ne(propertyName, value);  //不等于
		Restrictions.and(predicates);          //并且
		Restrictions.or(predicates);           //或者
		 */
		
		 //提交事务
		trans.commit();
		session.close();
	}

}
