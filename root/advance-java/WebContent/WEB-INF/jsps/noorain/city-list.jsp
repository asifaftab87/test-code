<%@page import="org.ecom.noor.model.City"%>
<%@page import="java.util.List"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
	
<div class='text-center'>
	<h1 class="display-1">City</h1>
	<h3><medium class="text-muted">City List</medium></h3>
</div>
<div>
	<div class="container">
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
			</div>
			<div class="col-sm">
				<form action="/advance-java/city/add/noorain">
					<div class="form-group mx-sm-3 mb-2 container">
						<input type="submit" value="Add City" style="float: right;" class="btn btn-primary" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<br />
<br />

<div>
	<form action="/advance-java/city/search/noorain" class="form-inline">
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
			<th scope="col" class="pl-5">Action</th>
		</tr>
	</thead>
	<tbody>
		<%
			List<City> cityList = (List<City>)request.getAttribute("cityList");
			if(!cityList.isEmpty()){
				for(City city : cityList){
					%>
						<tr>
							<td>
								<a href="/advance-java/city/detail/noorain?cityId=<%= city.getId() %>">
									<%= city.getName() %>
								</a>
							</td>
							<td>
								<div class="row">
									<div class="col-sm-3">
										<a href="/advance-java/city/delete/noorain?cityId=<%= city.getId() %>" 
											class="btn btn-danger">Delete</a>
									</div>
									<div class="col-sm-3">
										<a href="/advance-java/city/update/noorain?cityId=<%= city.getId() %>"
											class="btn btn-secondary">Update</a>
									</div>
								</div>
						</tr>
					<%
				}
			}
			else{
				%>
					<tr>
						<td colspan="4">No city found</td>
					</tr>
				<%
			}
		%>
	<tbody>
</table>

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 