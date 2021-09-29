<%@page import="java.util.List"%>
<%@page import="org.ecom.noor.model.Employee"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 

<div class='text-center'>
	<h1 class="display-1">Employee</h1>
</div>

<%
	Employee employee = (Employee)request.getAttribute("employee");
%>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/employee/list/noorain" role="button">Back</a>
	</h2>
</div>

<div class='text-center mb-3'>
	<h3><medium class="text-muted">Employee Details</medium></h3>
</div>
<div class="container-fluid text-dark mb-5">
	<div class="row justify-content-center align-items-center">
		<form>
			<div class="form-group row">
				<label for="name" class="col-sm-6 col-form-label">Name</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="name" 
							value="<%= employee.getName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="age" class="col-sm-6 col-form-label">Age</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="age" 
							value="<%= employee.getAge() %>">
				</div>
			</div>
		   <div class="form-group row">
				<label for="salary" class="col-sm-6 col-form-label">Salary</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="salary" 
							value="<%= employee.getSalary() %>">
				</div>
			</div>
		</form>
	</div>
</div>
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
