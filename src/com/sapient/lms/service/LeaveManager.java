package com.sapient.lms.service;

import com.sapient.lms.exception.InsufficientLeaveBalanceException;
import com.sapient.lms.model.Employee;

public class LeaveManager {
	
 public int applyForLeave(Employee employee, int numberOfDays) throws InsufficientLeaveBalanceException {
	 int availableLeaves = employee.getLeaveDetails().getLeaves();
	 if (availableLeaves < numberOfDays) {
		 throw new InsufficientLeaveBalanceException("Insufficient leave balance");
	 } else {
		 availableLeaves = availableLeaves - numberOfDays;
		 employee.getLeaveDetails().setLeaves(availableLeaves);
	 }
	 return numberOfDays;
 }
 
 public int viewLeaveBalance(Employee employee) {
	return  employee.getLeaveDetails().getLeaves();
 }
 
 public void updateLeaves(Employee employee, int numberOfDays) {
	 employee.getLeaveDetails().updateLeaves(numberOfDays);
	
 }
 
 
 
 

}
