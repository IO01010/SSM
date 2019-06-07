package com.abc.graduationproject.test;
/**
 * 测试dao层的工作
 * @author 
 *Spring单元测试，自动注入我们需要的组件
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.abc.graduationproject.dao.memberInfMapper;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	memberInfMapper memberinfMapper;
	
	/**
	 * 测试DepartmentMapper
	 */
	@Test
	public void testCRUD() {
		//******************************************************************//
		//1、创建SpringIOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");  
		//2、从容器中获得mapper
		memberInfMapper bean = ioc.getBean(memberInfMapper.class);
		//*********************************************************************// 
		
		System.out.println(bean);
		System.out.println(memberinfMapper);
		
	}

	
	
}
