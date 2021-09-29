package org.ecom.jamal.service;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.ecom.jamal.model.Employee;
import org.ecom.jamal.repository.EmployeeRepository;
import org.ecom.util.GetSqlConnection;


public class EmployeeService {
	
	private Connection con = null;

	public EmployeeService() {
		con = GetSqlConnection.connectionOpen();
	}

	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}

	public List<Employee> getAllEmployee() {

		List<Employee> employeeList = new ArrayList<>();

		if (con != null) {
			employeeList = EmployeeRepository.getAllEmployee(con);
		}

		return employeeList;
	}

	public Employee findEmployeeById(long employeeid) {

		Employee employee = null;

		if (con != null) {
			employee = EmployeeRepository.findEmployeeById(con, employeeid);
		}

		return employee;
	}
	
	public List<Employee> getEmployeeByName(String employeename) {
		return EmployeeRepository.getEmployeeByName(con, employeename);
	}
	
	public List<Employee> getEmployeeByEmailId(String employeeemail) {
		return EmployeeRepository.getEmployeeByEmail(con, employeeemail);
	}
	
	
	public List<Employee> getempByNoticePeriod(int noticePeriod) {
		return EmployeeRepository.getEmployeeByNoticePeriod(con, noticePeriod);
	}

	public List<Employee> getempByGender(String gender) {
		return EmployeeRepository.getEmployeeByGender(con, gender);
	}
	
	
	public List<Employee> findEmployeeByDob(Date fromDobDate, Date toDobDate){
		return EmployeeRepository.findEmployeeByDob(con, fromDobDate, toDobDate);
	}
	
	public List<Employee> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		return EmployeeRepository.findEmployeeByJoinedDate(con, fromJoinedDate, toJoinedDate);
	}
	
	public List<Employee> findEmployeeByReleaseDate(Date fromReleaseDate, Date toReleaseDate){
		return EmployeeRepository.findByReleaseDate(con, fromReleaseDate, toReleaseDate);
	}
	
	public int deleteEmployeeById(long employeeid) {
		return EmployeeRepository.deleteEmployeeById(con, employeeid);
	}

	public void createEmployee(Employee employee) {
		EmployeeRepository.createEmployee(con, employee);
	}

	public void updateEmployee(Employee employee) {
		EmployeeRepository.updateEmployee(con, employee);
	}

}
