<%@page import="org.ecom.noor.model.Employee"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">Employee</h1>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/employee/list/noorain" role="button">Back</a>
	</h2>
</div>
<%
	Employee employee = (Employee)request.getAttribute("employee");
%>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Update Employee</medium></h3>
</div>
<form action="/advance-java/employee/update/noorain" method="post" class="container mb-5">

  <input type="hidden" id="empId" name="empId" value="<%= employee.getId() %>" />
  <div class="form-group">
		<label for="name"> Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="NameHelp" 
				value="<%= employee.getName() %>" placeholder="Enter Name">
		<small id="NameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="age">Age</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="AgeHelp" 
				value="<%= employee.getAge() %>" placeholder="Enter Age">
		<small id="AgeHelp" class="form-text text-muted">
			Please provide numbers
		</small>
	</div>  
	<div class="form-group">
		<label for="salary">Salary</label>
		<input type="text" class="form-control" name="salary" id="salary" aria-describedby="SalaryHelp" 
				value="<%= employee.getSalary() %>"  placeholder="Enter Salary">
		<small id="SalaryHelp" class="form-text text-muted">
			Please provide numbers
		</small>
	</div>  
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/employee/list/noorain" role="button">Cancel</a>
</form> 
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 