<%@page import="java.util.List"%>
<%@page import="org.ecom.noor.model.Company"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 

<div class='text-center'>
	<h1 class="display-1">Company</h1>
</div>

<%
Company company = (Company)request.getAttribute("company");
%>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/company/list/noorain" role="button">Back</a>
	</h2>
</div>

<div class='text-center mb-3'>
	<h3><medium class="text-muted">Company Details</medium></h3>
</div>
<div class="container-fluid text-dark mb-5">
	<div class="row justify-content-center align-items-center">
		<form>
			<div class="form-group row">
				<label for="name" class="col-sm-6 col-form-label">Name</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="name" 
							value="<%= company.getName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="description" class="col-sm-6 col-form-label">description</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="description" 
							value="<%= company.getdescription() %>">
				</div>
			</div>
		   <div class="form-group row">
				<label for="salary" class="col-sm-6 col-form-label">primary_contact_attendee_id</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="primary_contact_attendee_id" 
							value="<%= company.getprimary_contact_attendee_id() %>">
				</div>
			</div>
		</form>
	</div>
</div>
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
