<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Servlet Project</title>
	</head>
	<body>
		<h1>Welcome to Users Page</h1>
		<h2><a href="user/list">User</a></h2>
		<h2><a href="student/list">Student</a></h2>
		<h2><a href="team/list">Team</a></h2>
		<h2><a href="employeeController/list">Employee</a></h2>
		<h2><a href="address/list">Address</a></h2>
		<h2><a href="MoneyDetail/list">MoneyDetail</a></h2>
		<h2><a href="CreditCard/list">CreditCard</a></h2>
		<h2><a href="Employeefive/list">Employeefive</a></h2>
		<h2><a href="EmployeeTwo/list">EmployeeTwo</a></h2>
		<div>
			<button type="button" onclick="message();"> Click here </button>
		</div>
		
		<script> 
			function message(){
				alert ('Hello');
			}
		</script>
	</body>
</html>