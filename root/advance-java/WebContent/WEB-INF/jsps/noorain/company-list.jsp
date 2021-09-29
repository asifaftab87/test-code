<%@ page import="org.ecom.noor.model.Company"%>
<%@ page import="java.util.List"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %>
<div class='text-center'>
	<h1 class="display-1">Company</h1>
	<h3><medium class="text-muted">Company List</medium></h3>
</div>

<div>
	<div class="container">
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
			</div>
			<div class="col-sm">
				<form action="/advance-java/company/add/noorain">
					<div class="form-group mx-sm-3 mb-2 container">
						<input type="submit" value="Add Company" style="float: right;" class="btn btn-primary" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<br />
<br />

<div>
	<form action="/advance-java/company/search/noorain" class="form-inline">
		<div class="form-group mx-sm-3 mb-2 container">
			<label for="name" class="mr-2">Search By Name</label>
	    	<input type="text" class="form-control mx-2" id="name" placeholder="Enter Name" name="name" />
	    	<input type="submit" value="Search" class="btn btn-outline-primary mx-2" />
		</div>
	</form>
</div>

<br />
<br />

<table class="table table-hover">
	<thead class="table-primary">
		<tr>
			<th scope="col">Name</th>
			<th scope="col">description</th>
			<th scope="col">primary_contact_attendee_id</th>
			<th scope="col" class="pl-5">Action</th>
		</tr>
	</thead>
	<tbody>
		<%
		List<Company> companyList = (List<Company>)request.getAttribute("companyList");
			if(!companyList.isEmpty()){
				for(Company company : companyList){
					%>
						<tr>
							<td>
								<a href="/advance-java/company/detail/noorain?companyId=<%= company.getId() %>">
									<%= company.getName() %>
								</a>
							</td>
							<td><%= company.getdescription() %></td>
							<td><%= company.getprimary_contact_attendee_id() %></td>
							<td>
								<div class="row">
									<div class="col-sm-3">
										<a href="/advance-java/company/delete/noorain?companyId=<%= company.getId() %>" 
											class="btn btn-danger">Delete</a>
									</div>
									<div class="col-sm-3">
										<a href="/advance-java/company/update/noorain?companyId=<%= company.getId() %>"
											class="btn btn-secondary">Update</a>
									</div>
								</div>
							</td>
						</tr>
					<%
				}
			}
			else{
				%>
					<tr>
						<td colspan="4">No company found</td>
					</tr>
				<%
			}
		%>
	<tbody>
</table>

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %>