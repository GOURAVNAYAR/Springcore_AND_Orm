package com.springcore.BeanScopes.Singleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/BeanScopes/config.xml");
        Senior senior = context.getBean("senior", Senior.class);
        Senior senior1 = context.getBean("senior", Senior.class);
        System.out.println("This is First Object Hashcode............");
        System.out.println(senior.hashCode());
        System.out.println("This is Second Object Hashcode............");
        System.out.println(senior1.hashCode() + "\n");
        System.out.println("There are Same hashcode mean's Singleton Scope............");
    }
}
