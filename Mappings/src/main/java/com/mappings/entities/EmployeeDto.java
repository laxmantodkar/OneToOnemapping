package com.mappings.entities;




public class EmployeeDto {

	
	 private int Id;
	 private String employeeName;
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
		return "EmployeeDto [Id=" + Id + ", employeeName=" + employeeName + ", manager=" + manager + "]";
	}
	 
}
