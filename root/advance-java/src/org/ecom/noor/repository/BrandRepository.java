package org.ecom.noor.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.Brand;

public class BrandRepository {

	public static List<Brand> getAllBrand(Connection con) {

		System.out.println("-----------getAllBrand------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Brand> brandList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from brand");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					Brand brand=new Brand();
					brand.setId(rs.getInt(1));
					brand.setName(rs.getString(2));
					brand.setThumbnails(rs.getString(3));
					brandList.add(brand);
					
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
		return brandList;
	}
	
	public static Brand findBrandById(Connection con, long brandId) {

		System.out.println("-----------findbrandById brandid: "+brandId);

		ResultSet rs = null;
		Brand brand = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from brand where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1,brandId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
				    brand = new Brand();
					brand.setId(rs.getInt(1));
					brand.setName(rs.getString(2));
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
		return brand;
	}
	
public static void createBrand(Connection con, Brand brand) {
		
		System.out.println("-----------createBrand------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO brand(name, thumbnails) "
							+ " VALUES (?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, brand.getName());
			pStatement.setString(2, brand.getThumbnails());
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

public static void updateBrand(Connection con, Brand brand) {
	
	System.out.println("-----------updateBrand------------");
	
	PreparedStatement pStatement = null;
	
	try{  
		
		String query = " update brand set name=?, thumbnails=? "
				        + "where id=? ";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, brand.getName());
		pStatement.setString(2, brand.getThumbnails());
		pStatement.setInt(3, brand.getId());
		
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
    public static int deleteBrandById(Connection con, long brandId) {

	System.out.println("-----------deleteBrandById brandid: "+brandId);
	
	int executeUpdate = 0;
	PreparedStatement pStatement = null;
	
	try {
		String query = "delete from brand where id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setLong(1, brandId);
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
       
public static List<Brand> getBrandByName(Connection con, String name){
		
		System.out.println("name: "+name);
		List<Brand> brandList = new ArrayList<>();
		String query = " select * from brand where name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + name + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				Brand brand=new Brand();
				brand.setId(rs.getInt(1));
				brand.setName(rs.getString(2));
				brand.setThumbnails(rs.getString(3));
				
				brandList.add(brand);
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
		return brandList;
	}
}
