package org.ecom.noor.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.Company;

public class CompanyRepository {
	public static List<Company> getAllCompany(Connection con) {

		System.out.println("-----------getAllCompany------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Company> companyList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from company");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					Company company=new Company();
					company.setId(rs.getInt(1));
					company.setName(rs.getString(2));
					company.setdescription(rs.getString(3));
					company.setprimary_contact_attendee_id(rs.getInt(4));
					companyList.add(company);
				}
				
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return companyList;
	}
	
	public static Company findCompanyById(Connection con, long companyId) {
		
		System.out.println("-----------findCompanyById companyid: "+companyId);

		ResultSet rs = null;
		Company company = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from company where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, companyId);
			rs = pStatement.executeQuery();
			if(rs!=null) {
				while(rs.next())  {
				    company=new Company();
					company.setId(rs.getInt(1));
					company.setName(rs.getString(2));
					company.setdescription(rs.getString(3));
					company.setprimary_contact_attendee_id(rs.getInt(4));
				}
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
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return company;
	}
	
public static void createCompany(Connection con, Company company) {
		
		System.out.println("-----------createCompany------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO company(Name,description,primary_contact_attendee_id) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, company.getName());
			pStatement.setString(2, company.getdescription());
			pStatement.setInt(3, company.getprimary_contact_attendee_id());
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("data created successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to insert data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

    public static void updateCompany(Connection con, Company company) {
	
	System.out.println("-----------updateCompany------------");
	
	PreparedStatement pStatement = null;
	
	try{  
		
		String query = 	  " update company set Name=?, description=?, primary_contact_attendee_id=? "
				+ "where id=? ";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, company.getName());
		pStatement.setString(2, company.getdescription());
		pStatement.setInt(3, company.getprimary_contact_attendee_id());
		pStatement.setInt(4, company.getId());
		
		int executeUpdate = pStatement.executeUpdate();
		
		if(executeUpdate>0) {
			System.out.println("data updated successfully: "+executeUpdate);
		}
		else {
			System.out.println("failed to update data: "+executeUpdate);
		}
	}
	catch(SQLException se){
	      se.printStackTrace();
	}
	catch(Exception e){ 
		System.out.println(e);
	} 
	finally {
		try {
			if(pStatement!=null) {
				pStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}  
    
    public static int deleteCompanyById(Connection con, long companyId) {

		System.out.println("-----------deleteCompanyById companyid: "+companyId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from company where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, companyId);
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
	
public static List<Company> getCompanyByName(Connection con, String name){
		
		System.out.println("name: "+name);
		List<Company> companyList = new ArrayList<>();
		String query = " select * from company where name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + name + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				Company company=new Company();
				company.setId(rs.getInt(1));
				company.setName(rs.getString(2));
				company.setdescription(rs.getString(3));
				company.setprimary_contact_attendee_id(rs.getInt(4));
				companyList.add(company);
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
		return companyList;
	}
 
}
