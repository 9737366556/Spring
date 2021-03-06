package com.nikunj.springcore.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nikunj.springcore.springJDBC.dao.SpringJDBCDAO;
import com.nikunj.springcore.springJDBC.dto.SpringJDBCDTO;

public class SpringJDBCTester {
	public static void main(String[] args) {
		System.out.println("main function started ");
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/springJDBC.xml");
		
		SpringJDBCDAO dao = (SpringJDBCDAO)context.getBean("springJDBCDAO");
		SpringJDBCDTO dto = new SpringJDBCDTO( 3,"gopi",26);
		dao.insert(dto);
		
		dao.showTable();
	
		System.out.println("main function ended");
	}
}
