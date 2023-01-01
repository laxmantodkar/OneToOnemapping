package com.mappings.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	 private int Id;
	 private String employeeName;
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JsonBackReference
	 private Manager manager;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", employeeName=" + employeeName + ", manager="+manager +"]";
	}
	 
	 
}
