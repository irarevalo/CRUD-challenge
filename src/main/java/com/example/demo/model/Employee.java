package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String fullname;
	private String function;
	private Long boss_id;
	
	public Employee(Long id, String fullname, String function, Long boss_id) {
		this.id = id;
		this.fullname = fullname;
		this.function = function;
		this.boss_id = boss_id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public Long getBoss_id() {
		return boss_id;
	}
	public void setBoss_id(Long boss_id) {
		this.boss_id = boss_id;
	}

}
