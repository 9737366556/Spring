package com.joc.annotationDemo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "matrimony")
public class MatrimonyDTO {

	@Id
	@GenericGenerator(name = "xworkz", strategy = "increment")
	@GeneratedValue(generator = "xworkz")
	@Column(name = "M_Id")
	private int id;
	@Column(name = "M_Name")
	private String name;
	@Column(name = "M_DOB")
	private String DOB;
	@Column(name = "M_Gender")
	private String gender;
	@Column(name = "M_Status")
	private String status;
	@Column(name = "M_Occupation")
	private String occupation;
	@Column(name = "M_Looking_For")
	private String lookingFor;
}