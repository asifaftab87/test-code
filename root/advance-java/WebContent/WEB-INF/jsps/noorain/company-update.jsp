<%@page import="org.ecom.noor.model.Company"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">Company</h1>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/company/list/noorain" role="button">Back</a>
	</h2>
</div>
<%
Company company = (Company)request.getAttribute("company");
%>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Update Company</medium></h3>
</div>
<form action="/advance-java/company/update/noorain" method="post" class="container mb-5">

  <input type="hidden" id="companyId" name="companyId" value="<%= company.getId() %>" />
  <div class="form-group">
		<label for="name"> Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="NameHelp" 
				value="<%= company.getName() %>" placeholder="Enter Name">
		<small id="NameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="age">description</label>
		<input type="text" class="form-control" name="description" id="description" aria-describedby="descriptionHelp" 
				value="<%= company.getdescription() %>" placeholder="Enter description">
		<small id="AgeHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>  
	<div class="form-group">
		<label for="primary_contact_attendee_id">primary_contact_attendee_id</label>
		<input type="text" class="form-control" name="primary_contact_attendee_id" id="primary_contact_attendee_id" aria-describedby="primary_contact_attendee_idHelp" 
				value="<%= company.getprimary_contact_attendee_id() %>"  placeholder="Enter primary_contact_attendee_id">
		<small id="SalaryHelp" class="form-text text-muted">
			Please provide numbers
		</small>
	</div>  
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/company/list/noorain" role="button">Cancel</a>
</form> 
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 