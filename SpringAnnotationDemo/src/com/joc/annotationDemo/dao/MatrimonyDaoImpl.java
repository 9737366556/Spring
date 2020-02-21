package com.joc.annotationDemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joc.annotationDemo.dto.MatrimonyDTO;

@Component
public class MatrimonyDaoImpl implements MatrimonyDAO {

	private SessionFactory factory;
	
	@Autowired
	public MatrimonyDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}
	@Override
	public void save(MatrimonyDTO dto) {
		Session session=null;
		try {
		
			session = this.factory.openSession();
			Transaction transaction =session.beginTransaction();
			session.save(dto);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null) session.close();
		}
	}
}
