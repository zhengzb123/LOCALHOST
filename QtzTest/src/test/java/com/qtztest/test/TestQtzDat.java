package com.qtztest.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qtztest.dao.IQtzDao;
import com.qtztest.model.Qtz;

public class TestQtzDat {
	
	@Test
	public void testAddQtz(){
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("application.xml");
		IQtzDao qtzDao=(IQtzDao) ctx.getBean("qtzDao");
		
		Qtz qtz = new Qtz();
		qtz.setRandom("zhangsan");
		qtz.setAddtime("20160905");
		
		qtzDao.addQtz(qtz);
	}
}
