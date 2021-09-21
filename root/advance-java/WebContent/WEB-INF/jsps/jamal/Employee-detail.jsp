<%@page import="java.util.List"%>
<%@ page import="org.ecom.jamal.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Employee Detail</title>
		<style>
			table {
			  font-family: arial, sans-serif;
			  border-collapse: collapse;
			  width: 100%;
			}
			
			td, th {
			  border: 1px solid #dddddd;
			  text-align: left;
			  padding: 8px;
			}
			
			tr:nth-child(even) {
			  background-color: #dddddd;
			}
		</style>
	</head>
	<body>
		<%
		Employee employee = (Employee)request.getAttribute("employee");
		%>
		<div>
			<h2><a href="/advance-java/jamal">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/employee/list/jamal">Back</a></h2>
		</div>
		
		<h1>Update Detail</h1>
		
		  <label for="name">Name:</label><br>
		  <input type="text" id="name" name="name" value="<%= employee.getName() %>" readonly="readonly" /><br><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob" value="<%= employee.getDob() %>" readonly="readonly" /><br><br>
		  
		  <label for="jdate">Joined Date:</label><br>
		  <input type="text" id="jdatepicker" name="jdate" value="<%= employee.getJoined_date() %>" readonly="readonly"/><br><br>
		  
		  <label for="rdate">Release Date:</label><br>
		  <input type="text" id="rdatepicker" name="rdate" value="<%= employee.getRelease_date() %>" readonly="readonly"/><br><br>
		  
		  <label for="notice_period">Notice Period:</label><br>
		  <input type="text" id="notice_period" name="notice_period" value="<%= employee.getNotice_period() %>" readonly="readonly"/><br><br>
		  
		  <label for="email">Email:</label><br>
		  <input type="text" id="email" name="email" value="<%= employee.getEmail() %>" readonly="readonly"/><br><br>
		  
		  <label for="gender">Gender:</label><br>
		  <input type="text" id="gender" name="gender" value="<%= employee.getGender() ? "male" : "female" %>" readonly="readonly" /><br><br>
		  <br>
		  <br>
		
	</body>
</html>