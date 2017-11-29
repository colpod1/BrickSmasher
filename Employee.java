package org.bricksmasher.administrative;

import java.util.*;
import org.bricksmasher.property.*;
import org.bricksmasher.software.*;

public abstract class Employee extends Person {

	private Double accountMoney;
	private String password;
	private Integer employeeID;
	private Integer hireDate;
	private Integer daysWorked;
	protected Store homeStore;
	
	public Employee() {
		
		super();
		accountMoney = 0.0;
		password = "unknown";
		hireDate = 0; 
		daysWorked = 0;
		homeStore = null;
		
	}
	
	public void setAccountMoney(Double anAmt) {
		accountMoney = anAmt;
	}
	
	public Double getAccountMoney() {
		return accountMoney;
	}
	
	public void setPassword(String aPwrd) {
		password = aPwrd;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmployeeID(Integer empID) {
		employeeID = empID;
	}
	
	public Integer getEmployeeID() {
		return employeeID;
	}
	
	public void setHireDate(Integer aDate) {
		hireDate = aDate;
	}
	
	public Integer getHireDate() {
		return hireDate;
	}
	
	public void setDaysWorked(Integer days) {
		daysWorked = days;
	}
	
	public Integer getDaysWorked() {
		return daysWorked;
	}
	
	public void addDayWorked() {
		daysWorked = daysWorked + 1;
	}
	
	public void resetDaysWorked() {
		daysWorked = 0;
	}
	
	public void setHomeStore(Store aStore) {
		homeStore = aStore;
	}
	
	public Store getHomeStore() {
		return homeStore;
	}
	
	public abstract void getpaid();
}
