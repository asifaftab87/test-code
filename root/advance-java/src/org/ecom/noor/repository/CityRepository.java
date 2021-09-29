package org.ecom.noor.repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.City;

public class CityRepository {

	public static List<City> getAllCity(Connection con) {

		System.out.println("-----------getAllCity------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<City> cityList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from city");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					City city=new City();
					city.setId(rs.getInt(1));
					city.setName(rs.getString(2));
					
					cityList.add(city);
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
		return cityList;
	}
	
	public static City findCityById(Connection con, long cityId) {

		System.out.println("-----------findcityById cityid: "+cityId);

		ResultSet rs = null;
		City city = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from city where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1,cityId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
				   city = new City();
					city.setId(rs.getInt(1));
					city.setName(rs.getString(2));

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
		return city;
	}
	
public static void createCity(Connection con, City city) {
		
		System.out.println("-----------createCity------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO city(name) "
							+ " VALUES (?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, city.getName());

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

   public static void updateCity(Connection con, City city) {
	
	System.out.println("-----------updateCity------------");
	
	PreparedStatement pStatement = null;
	
	try{  
		
		String query = 	  " update city set name=?"
						+ " where id=? ";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, city.getName());
		pStatement.setInt(2, city.getId());

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
	public static int deleteCityById(Connection con, long cityId) {
		
		System.out.println("-----------deleteCityById cityid: "+cityId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from city where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, cityId);
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
	
public static List<City> getCityByName(Connection con, String name) {
		
		System.out.println("name: "+name);
		List<City> cityList= new ArrayList<>();
		String query = " select * from city where name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + name + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				City city=new City();
				city.setId(rs.getInt(1));
				city.setName(rs.getString(2));
				
				cityList.add(city);

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
		return cityList;
	}
}
