package com.jspiders.ref_type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jspiders/ref_type/config.xml");
		Person p1 = (Person) context.getBean("person");
		
		System.out.println(p1);

	}

}
