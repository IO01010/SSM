package com.abc.graduationproject.test;
/**
 * ����dao��Ĺ���
 * @author 
 *Spring��Ԫ���ԣ��Զ�ע��������Ҫ�����
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
	 * ����DepartmentMapper
	 */
	@Test
	public void testCRUD() {
		//******************************************************************//
		//1������SpringIOC����
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");  
		//2���������л��mapper
		memberInfMapper bean = ioc.getBean(memberInfMapper.class);
		//*********************************************************************// 
		
		System.out.println(bean);
		System.out.println(memberinfMapper);
		
	}

	
	
}
