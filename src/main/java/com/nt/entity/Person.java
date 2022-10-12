package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON_INFO")
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="PERSON_ID")
	private int id;
	
	@Column(name="PERSON_NAME")
	private String name;
	
	@Column(name="PERSON_SALARY")
	private Double Salary;

	public Person(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
}
