<%@page import="org.ecom.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
			  $(function() {
			    $("#datepicker").datepicker();
			  });
  	    </script>		
	</head>
	<body>
		<%
			User user = (User)request.getAttribute("user");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/user/list/asif">Users Detail</a></h2>
		</div>
		
		<h1>Update User</h1>
		
		<form action="/advance-java/user/update/asif" method="post">
		
		  <input type="hidden" id="userId" name="userId" value="<%= user.getId() %>" />
		  
		  <label for="fname">First name:</label><br>
		  <input type="text" id="fname" name="fname" value="<%= user.getFirstName() %>" /><br><br>
		  
		  <label for="lname">Last name:</label><br>
		  <input type="text" id="lname" name="lname" value="<%= user.getLastName() %>" /><br><br>
		  
		  <label for="fatherName">Father Name:</label><br>
		  <input type="text" id="fatherName" name="fatherName" value="<%= user.getFatherName() %>" /><br><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob" value="<%= user.getDob() %>" /><br><br>
		  
		  <label for="email">Email:</label><br>
		  <input type="text" id="email" name="email" value="<%= user.getEmail() %>" /><br><br>
		  
		  <input type="radio" id="male" name="gender" value="true" />
		  <label for="male">Male</label>
		  
		  <input type="radio" id="female" name="gender" value="false" />
		  <label for="female">Female</label><br><br>
		  
		  <input type="submit" value="Submit">
		</form> 
	</body>
</html>