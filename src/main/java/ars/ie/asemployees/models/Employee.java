package ars.ie.asemployees.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private String employeeId;
	private String employeeName;
	private LocalDate joiningDate;
	private String baseLocation;
	private BigDecimal salary;
	
	public Employee(String employeeId, String employeeName, LocalDate joiningDate, String baseLocation,
			BigDecimal salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
		this.baseLocation = baseLocation;
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", joiningDate=" + joiningDate
				+ ", baseLocation=" + baseLocation + ", salary=" + salary + "]";
	}
	
	
}
