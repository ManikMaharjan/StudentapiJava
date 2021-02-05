package com.manik.student.dal.enties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="studenttab")
public class Student {
	@Id

	@GenericGenerator(name = "native",strategy = "native")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="sname")
	private String sname;
	@Column(name="scourse")
	private String course;
	@Column(name="sfee")
	private Double fee;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
	}

}
