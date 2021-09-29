package org.ecom.jamal.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.jamal.model.Employee;

	public class EmployeeRepository { //DAO Data Access Object

		//static Connection con = null;
		
		public static List<Employee> getAllEmployee(Connection con) {

			System.out.println("-----------getAllEmployee------------");

			Statement stmt = null;
			ResultSet rs = null;

			List<Employee> EmployeeList = new ArrayList<>();
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery(" select * from employee ");

				if (rs != null) {

					while (rs.next()) {

						Employee employee = new Employee();
						employee.setId(rs.getInt(1));
						employee.setName(rs.getString(2));
						employee.setDob(rs.getDate(3));
						employee.setEmail(rs.getString(4));
						employee.setGender(rs.getBoolean(5));
						employee.setJoined_date(rs.getDate(6));
						employee.setRelease_date(rs.getDate(7));
						employee.setNotice_period(rs.getInt(8));
						EmployeeList.add(employee);
					}

				}
			}
			 catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return EmployeeList;
		}
		
		//find By Id
		public static Employee findEmployeeById(Connection con, long employeeid) {

			System.out.println("-----------findEmployeeById employeeid: " + employeeid);

			ResultSet rs = null;
			Employee employee = null;
			PreparedStatement pStatement = null;

			try {
				String query = " select * from employee where id=? ";
				pStatement = con.prepareStatement(query);
				pStatement.setLong(1, employeeid);
				rs = pStatement.executeQuery();

				if (rs != null) {

					while (rs.next()) {
						
						employee = new Employee();
						employee.setId(rs.getInt(1));
						employee.setName(rs.getString(2));
						employee.setDob(rs.getDate(3));
						employee.setEmail(rs.getString(4));
						employee.setGender(rs.getBoolean(5));
						employee.setJoined_date(rs.getDate(6));
						employee.setRelease_date(rs.getDate(7));
						employee.setNotice_period(rs.getInt(8));
					}
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employee;
		}

		// Create method 
		public static void createEmployee(Connection con, Employee employee) {

			System.out.println("-----------createEmployee------------");

			PreparedStatement pStatement = null;

			try {

				// conversion from java.util.Date to java.sql.Date
				java.sql.Date sqlDob = new java.sql.Date(employee.getDob().getTime());
				java.sql.Date sqlJoined_date = new java.sql.Date(employee.getJoined_date().getTime());
				java.sql.Date sqlRelease_date = new java.sql.Date(employee.getRelease_date().getTime());
				
				String query = "INSERT INTO employee( name ,dob ,email ,gender , joined_date ,release_date ,notice_period ) " 
								+ " VALUES (? ,? ,? ,? ,? ,?, ? )";
				
				pStatement = con.prepareStatement(query);
				pStatement.setString(1, employee.getName());
				pStatement.setDate(2, sqlDob);
				pStatement.setString(3, employee.getEmail());
				pStatement.setBoolean(4, employee.getGender());
				pStatement.setDate(5, sqlJoined_date);
				pStatement.setDate(6, sqlRelease_date);
				pStatement.setInt(7, employee.getNotice_period());

				int executeUpdate = pStatement.executeUpdate();

				if (executeUpdate > 0) {
					System.out.println("data created successfully: " + executeUpdate);
				} else {
					System.out.println("failed to insert data: " + executeUpdate);
				}
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	 //Update Method 
		public static void updateEmployee(Connection con, Employee employee) {

			System.out.println("-----------updateEmployee------------");

			PreparedStatement pStatement = null;

			try {

				// conversion from java.util.Date to java.sql.Date
				java.sql.Date sqlDob = new java.sql.Date(employee.getDob().getTime());
				java.sql.Date sqlJoined_date = new java.sql.Date(employee.getJoined_date().getTime());
				java.sql.Date sqlRelease_date = new java.sql.Date(employee.getRelease_date().getTime());

				String query = 	  " update employee set name=? ,dob=? ,email=? ,gender=? , joined_date=? ,release_date=? ,notice_period=?"
						+ " where id=? ";
				
				pStatement = con.prepareStatement(query);
				pStatement.setString(1, employee.getName());
				pStatement.setDate(2, sqlDob);
				pStatement.setString(3, employee.getEmail());
				pStatement.setBoolean(4, employee.getGender());
				pStatement.setDate(5, sqlJoined_date);
				pStatement.setDate(6, sqlRelease_date);
				pStatement.setInt(7, employee.getNotice_period());
				pStatement.setInt(8, employee.getId());
				
				int executeUpdate = pStatement.executeUpdate();

				if (executeUpdate > 0) {
					System.out.println("data updated successfully: " + executeUpdate);
				} else {
					System.out.println("failed to insert data: " + executeUpdate);
				}
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		//Delete 
		public static int deleteEmployeeById(Connection con, long employeeid) {

			System.out.println("-----------deleteEmployeeById emplyeeid: "+employeeid);
			
			int executeUpdate = 0;
			PreparedStatement pStatement = null;
			
			try {
				String query = "delete from employee where id=?";
				pStatement = con.prepareStatement(query);
				pStatement.setLong(1, employeeid);
				executeUpdate = pStatement.executeUpdate();
				
				if(executeUpdate>0) {
					System.out.println("data deleted successfully: "+executeUpdate);
				}
				else {
					System.out.println("failed to delete data: "+executeUpdate);
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			} 
			finally {
				try {
					if(pStatement!=null) {
						pStatement.close();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}  
			}
			
			return executeUpdate;
		}
		
		public static List<Employee> getEmployeeByName(Connection con, String employeename){
			
			System.out.println("name: "+employeename);
			List<Employee> employeeList = new ArrayList<>();
			String query = " select * from employee where name like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + employeename + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDob(rs.getDate(3));
					employee.setEmail(rs.getString(4));
					employee.setGender(rs.getBoolean(5));
					employee.setJoined_date(rs.getDate(6));
					employee.setNotice_period(rs.getInt(7));
					employee.setRelease_date(rs.getDate(8));
					employeeList.add(employee);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null) {
						rs.close();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}  
			}
			return employeeList;
		}
		
		public static List<Employee> findEmployeeByDob(Connection con, Date fromDobDate, Date toDobDate){
			if(con==null) {
				return null;
			}
			PreparedStatement pStatement = null;
			ResultSet rs = null;
			List<Employee> employeeList = new ArrayList<>();
			try {
				String query = "SELECT * FROM employee WHERE dob BETWEEN ? AND ?";
				pStatement = con.prepareStatement(query);
				pStatement.setDate(1, fromDobDate);
				pStatement.setDate(2, toDobDate);
				
				rs = pStatement.executeQuery();
				while(rs.next()) {
					
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDob(rs.getDate(3));
					employee.setEmail(rs.getString(4));
					employee.setGender(rs.getBoolean(5));
					employee.setJoined_date(rs.getDate(6));
					employee.setRelease_date(rs.getDate(7));
					employee.setNotice_period(rs.getInt(8));
					employeeList.add(employee);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employeeList;
		}
		
		public static List<Employee> findEmployeeByJoinedDate(Connection con, Date fromJoinedDate, Date toJoinedDate){
			
			if(con==null) {
				return null;
			}
			PreparedStatement pStatement = null;
			ResultSet rs = null;
			List<Employee> employeeList = new ArrayList<>();
			try {
				String query = "SELECT * FROM employee WHERE joined_date BETWEEN ? AND ?";
				pStatement = con.prepareStatement(query);
				pStatement.setDate(1, fromJoinedDate);
				pStatement.setDate(2, toJoinedDate);
				
				rs = pStatement.executeQuery();
				while(rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDob(rs.getDate(3));
					employee.setEmail(rs.getString(4));
					employee.setGender(rs.getBoolean(5));
					employee.setJoined_date(rs.getDate(6));
					employee.setRelease_date(rs.getDate(7));
					employee.setNotice_period(rs.getInt(8));
					employeeList.add(employee);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employeeList;
		}
		
		public static List<Employee> findByReleaseDate(Connection con, Date fromReleaseDate, Date toReleaseDate){
			
			if(con==null) {
				return null;
			}
			Statement stmt = null;
			ResultSet rs = null;
			
			List<Employee> employeeList = new ArrayList<>();
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery("SELECT * FROM employee WHERE release_date BETWEEN ? AND ?");
				while(rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDob(rs.getDate(3));
					employee.setEmail(rs.getString(4));
					employee.setGender(rs.getBoolean(5));
					employee.setJoined_date(rs.getDate(6));
					employee.setRelease_date(rs.getDate(7));
					employee.setNotice_period(rs.getInt(8));
					employeeList.add(employee);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employeeList;
		}
		

		public static List<Employee> getEmployeeByNoticePeriod(Connection con, int noticePeriod){
			
			System.out.println("notice_Period: "+noticePeriod);
			List<Employee> employeeList = new ArrayList<>();
			String query = " select * from employee where notice_period like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + noticePeriod + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDob(rs.getDate(3));
					employee.setEmail(rs.getString(4));
					employee.setGender(rs.getBoolean(5));
					employee.setJoined_date(rs.getDate(6));
					employee.setNotice_period(rs.getInt(7));
					employee.setRelease_date(rs.getDate(8));
					employeeList.add(employee);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null) {
						rs.close();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}  
			}
			return employeeList;
		}
		
		public static List<Employee> getEmployeeByEmail(Connection con, String employeeemail){

			System.out.println("email: "+employeeemail);
			List<Employee> employeeList = new ArrayList<>();
			String query = " select * from employee where email like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + employeeemail + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDob(rs.getDate(3));
					employee.setEmail(rs.getString(4));
					employee.setGender(rs.getBoolean(5));
					employee.setJoined_date(rs.getDate(6));
					employee.setNotice_period(rs.getInt(7));
					employee.setRelease_date(rs.getDate(8));
					employeeList.add(employee);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null) {
						rs.close();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}  
			}
			return employeeList;
		}
		
		public static List<Employee> getEmployeeByGender(Connection con,String gender){
			
			System.out.println("gender: "+gender);
			List<Employee> employeeList = new ArrayList<>();
			String query = " select * from employee where gender like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + gender + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDob(rs.getDate(3));
					employee.setEmail(rs.getString(4));
					employee.setGender(rs.getBoolean(5));
					employee.setJoined_date(rs.getDate(6));
					employee.setNotice_period(rs.getInt(7));
					employee.setRelease_date(rs.getDate(8));
					employeeList.add(employee);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null) {
						rs.close();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}  
			}
			return employeeList;
		}
}
