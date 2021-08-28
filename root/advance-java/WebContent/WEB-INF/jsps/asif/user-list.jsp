<%@page import="org.ecom.model.User"%>
<%@page import="java.util.List"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class="backg-color">	
	
	<div class='text-center'>
		<h1 class="display-1">User</h1>
		<h3><small class="text-muted">User List</small></h3>
	</div>
	<div>
		<form action="/advance-java/user/add/asif">
			<div class="form-group mx-sm-3 mb-2 container">
				<input type="submit" value="Add User" style="float: right;" class="btn btn-primary" />
			</div>
		</form>
	</div>
	
	<br />
	<br />
	
	<div>
		<form action="/advance-java/user/search/asif" class="form-inline">
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
				<th scope="col">First Name</th>
				<th scope="col">Email</th>
				<th scope="col">Gender</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<User> userList = (List<User>)request.getAttribute("userList");
				if(!userList.isEmpty()){
					for(User user : userList){
						%>
							<tr>
								<td>
									<a href="/advance-java/user/detail/asif?userId=<%= user.getId() %>">
										<%= user.getFirstName() %>
									</a>
								</td>
								<td><%= user.getEmail() %></td>
								<td><%= user.getGender() ? "male" : "female" %></td>
								<td>
									<a href="/advance-java/user/delete/asif?userId=<%= user.getId() %>">Delete</a>
									<a href="/advance-java/user/update/asif?userId=<%= user.getId() %>">Update</a>
								</td>
							</tr>
						<%
					}
				}
				else{
					%>
						<tr>
							<td colspan="4">No user found</td>
						</tr>
					<%
				}
			%>
		<tbody>
	</table>
</div>
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
	