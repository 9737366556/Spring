package com.nikunj.springcore.applicationContextDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nikunj.springcore.applicationContextDemo.demo.ConstructorDemo;
import com.nikunj.springcore.applicationContextDemo.demo.SetterDemo;

/**
 * Purpose : Tester class
 * 
 * @author Nikunj Balar
 *
 */
public class ApplicationContextTester {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/applicationContext.xml");
		// start using instance of BeanFactoryConstructorDemo
		ConstructorDemo cd = (ConstructorDemo) context.getBean("constructorDemo");
		cd.show();
		
		SetterDemo sd=(SetterDemo)context.getBean("setterDemo");
		sd.show();
	}
}
