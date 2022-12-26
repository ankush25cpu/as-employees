package ars.ie.asemployees.services;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import ars.ie.asemployees.models.Employee;

@Service
public class EmployeeService {

	public Employee getEmployee(String employeeId) {
		return new Employee(employeeId, "Ankush", LocalDate.now(), "Indore", new BigDecimal(100000));
	}
}
