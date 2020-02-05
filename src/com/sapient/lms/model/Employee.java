package com.sapient.lms.model;

public class Employee {
	private int empId;
	private String empName;
	private String deptName;
	private LeaveDetails leaveDetails;
	
	public Employee (int empId, String empName, String deptName) {
		this.empId = empId;
		this.deptName = deptName;
		this.empName = empName;
		this.leaveDetails = new LeaveDetails();
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

	public LeaveDetails getLeaveDetails() {
		return leaveDetails;
	}

	
	
	

}
