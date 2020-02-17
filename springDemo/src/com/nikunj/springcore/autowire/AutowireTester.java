package com.nikunj.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nikunj.springcore.autowire.byName.Employee;
import com.nikunj.springcore.autowire.byType.EmployeeByType;
import com.nikunj.springcore.autowire.constructor.EmployeeConstructor;
import com.nikunj.springcore.autowire.defaultAutowire.EmployeeWithDefault;

public class AutowireTester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/autowire.xml");
		Employee employee=(Employee)context.getBean("employeeByName");
		System.out.println(employee.toString());
		
		EmployeeByType employee2 = (EmployeeByType)context.getBean("employeeByType");
		System.out.println(employee2.toString());
		
		EmployeeConstructor constructor = (EmployeeConstructor)context.getBean("employeeConstructor");
		System.out.println(constructor.toString());
		
		EmployeeWithDefault ewd= (EmployeeWithDefault)context.getBean("employeeWithDefault");
		System.out.println(ewd.toString());
		
	}
}