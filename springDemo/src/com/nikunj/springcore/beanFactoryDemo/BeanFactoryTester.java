package com.nikunj.springcore.beanFactoryDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nikunj.springcore.beanFactoryDemo.demo.BeanFactoryConstructorDemo;
import com.nikunj.springcore.beanFactoryDemo.demo.BeanFactorySetterDemo;


/**
 * Purpose : Tester class 
 * 
 * @author Nikunj Balar
 *
 */
public class BeanFactoryTester {
	public static void main(String[] args) {
		
		// creating resource object
		Resource resource = new ClassPathResource("/resource/beanFactory.xml");
		//creating factory object
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// start using instance of BeanFactoryConstructorDemo
		BeanFactoryConstructorDemo bfcd=(BeanFactoryConstructorDemo)factory.getBean("beanFactoryConstructorDemo");
		bfcd.show();
		
		//start using instance of BeanFactorySetterDemo
		BeanFactorySetterDemo bfsd=(BeanFactorySetterDemo)factory.getBean("beanFactorySetterDemo");
		bfsd.show();
	}
}
