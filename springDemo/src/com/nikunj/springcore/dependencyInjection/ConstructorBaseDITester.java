package com.nikunj.springcore.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nikunj.springcore.dependencyInjection.constructorBase.Employee;
import com.nikunj.springcore.dependencyInjection.setterBase.EmployeeUsingSetter;

public class ConstructorBaseDITester {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/dependencyInjection.xml");
		
		Employee usingCounstructor =(Employee)context.getBean("conEmployee");
		usingCounstructor.show();
		
		EmployeeUsingSetter usingSetter=(EmployeeUsingSetter)context.getBean("employeeUsingSetter");
		usingSetter.show();
	}
}
