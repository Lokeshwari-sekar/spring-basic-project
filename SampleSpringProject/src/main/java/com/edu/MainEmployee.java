package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) 
	{
		
		ApplicationContext acob=new ClassPathXmlApplicationContext("spring.xml");
        Employee emp=(Employee) acob.getBean("eob");
        emp.displayeEmployee();
	}

}
