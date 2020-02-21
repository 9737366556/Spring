package com.joc.annotationDemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joc.annotationDemo.dao.MatrimonyDAO;
import com.joc.annotationDemo.dto.MatrimonyDTO;

@Service
public class MatrimonyServiceImpl implements MatrimonyService {

	@Autowired
	MatrimonyDAO dao;
	
	public MatrimonyServiceImpl() {
		System.out.println("invoking " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validAndSave(MatrimonyDTO dto) {
		System.out.println("invoking valid and save in service "+dto );
		this.dao.save(dto);
		return false;
	}
}
