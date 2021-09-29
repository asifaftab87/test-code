package org.ecom.noor.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.Category;

public class CategoryRepository {
	
	public static List<Category> getAllCategory(Connection con) {

		System.out.println("-----------getAllCategory------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Category> categoryList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from category");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					Category category=new Category();
					category.setId(rs.getInt(1));
					category.setName(rs.getString(2));
					category.setThumbnails(rs.getString(3));
					categoryList.add(category);
					
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
		return categoryList;
	}
	
	public static Category findCategoryById(Connection con, long categoryId) {

		System.out.println("-----------findcategoryById categoryid: "+categoryId);

		ResultSet rs = null;
		Category category = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from category where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1,categoryId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					category = new Category();
					category.setId(rs.getInt(1));
					category.setName(rs.getString(2));
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
		return category;
	}
	
public static void createCategory(Connection con, Category category) {
		
		System.out.println("-----------createCategory------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO category(name, thumbnails) "
							+ " VALUES (?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, category.getName());
			pStatement.setString(2, category.getThumbnails());
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

public static void updateCategory(Connection con, Category category) {
	
	System.out.println("-----------updateCategory------------");
	
	PreparedStatement pStatement = null;
	
	try{  
		
		String query = " update category set name=?, thumbnails=? "
				        + "where id=? ";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, category.getName());
		pStatement.setString(2, category.getThumbnails());
		pStatement.setInt(3, category.getId());
		
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

public static int deleteCategoryById(Connection con, long categoryId) {

	System.out.println("-----------deleteCategoryById categoryid: "+categoryId);
	
	int executeUpdate = 0;
	PreparedStatement pStatement = null;
	
	try {
		String query = "delete from category where id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setLong(1, categoryId);
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

public static List<Category> getCategoryByName(Connection con, String name){
	
	System.out.println("name: "+name);
	List<Category> categoryList = new ArrayList<>();
	String query = " select * from category where name like ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setString(1,  "%" + name + "%");
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			Category category=new Category();
			category.setId(rs.getInt(1));
			category.setName(rs.getString(2));
			category.setThumbnails(rs.getString(3));
			
			categoryList.add(category);
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
	return categoryList;
}

}
