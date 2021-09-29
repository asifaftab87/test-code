<%@ page import="org.ecom.jamal.model.Employee"%>
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
		  $(function() {
		    $("#jdatepicker").datepicker();
		  });
		  $(function() {
		    $("#rdatepicker").datepicker();
		  });
  	    </script>		
	</head>
	<body>
		<%
		Employee employee = (Employee)request.getAttribute("employee");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/employee/list/jamal">Employee Detail</a></h2>
		</div>
		
		<h1>Update Employee </h1>
		
		<form action="/advance-java/employee/Update/jamal" method="post">
		
		  <input type="hidden" id="employeeid" name="employeeid" value="<%= employee.getId() %>" />
		  
		  <label for="name">Name:</label><br>
		  <input type="text" id="name" name="name" value="<%= employee.getName() %>" /><br><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob" value="<%= employee.getDob() %>" /><br><br>
		  
		  <label for="jdate">Joined Date:</label><br>
		  <input type="text" id="jdatepicker" name="jdate" value="<%= employee.getJoined_date() %>" /><br><br>
		  
		  <label for="rdate">Release Date:</label><br>
		  <input type="text" id="rdatepicker" name="rdate" value="<%= employee.getRelease_date() %>" /><br><br>
		  
		  <label for="notice_period">Notice Period:</label><br>
		  <input type="text" id="notice_period" name="notice_period" value="<%= employee.getNotice_period() %>" /><br><br>
		  
		  <label for="email">Email:</label><br>
		  <input type="text" id="email" name="email" value="<%= employee.getEmail() %>" /><br><br>
		  
		  <input type="radio" id="male" name="gender" value="true" />
		  <label for="male">Male</label>
		  
		  <input type="radio" id="female" name="gender" value="false" />
		  <label for="female">Female</label><br><br>
		  
		  <input type="submit" value="Submit">
		</form> 
	</body>
</html>