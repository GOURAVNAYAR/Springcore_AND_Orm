package com.springcore.BeanScopes.Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/BeanScopes/config.xml");

		Teacher tec = context.getBean("teacher", Teacher.class);
		Teacher tec1 = context.getBean("teacher", Teacher.class);
		
		
		System.out.println("This is First Object Hashcode............");
		System.out.println(tec.hashCode());
		
		
		System.out.println("This is Second Object Hashcode............");
		System.out.println(tec1.hashCode() + "\n");
		
		System.out.println("There are differnt hashcode mean's Prototype Scope............");

	}
}
