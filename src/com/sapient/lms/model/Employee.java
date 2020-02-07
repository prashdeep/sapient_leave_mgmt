package com.sapient.lms.model;

public class Employee {
	
	private int empId;
	private String empName;
	private String deptName;
	
	
	public Employee (int empId, String empName, String deptName) {
		this.empId = empId;
		this.deptName = deptName;
		this.empName = empName;
	}
	
	public Employee (String empName, String deptName) {
		this.deptName = deptName;
		this.empName = empName;
	}
	

	public int getEmpId() {
		return empId;
	}

	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
