<%@page import="org.ecom.noor.model.Category"%>
<%@page import="java.util.List"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
	
<div class='text-center'>
	<h1 class="display-1">Category</h1>
	<h3><medium class="text-muted">Category List</medium></h3>
</div>
<div>
	<div class="container">
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
			</div>
			<div class="col-sm">
				<form action="/advance-java/category/add/noorain">
					<div class="form-group mx-sm-3 mb-2 container">
						<input type="submit" value="Add Category" style="float: right;" class="btn btn-primary" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<br />
<br />

<div>
	<form action="/advance-java/category/search/noorain" class="form-inline">
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
			<th scope="col">thumbnails</th>
			<th scope="col">Gender</th>
			<th scope="col" class="pl-5">Action</th>
		</tr>
	</thead>
	<tbody>
		<%
			List<Category> categoryList = (List<Category>)request.getAttribute("categoryList");
			if(!categoryList.isEmpty()){
				for(Category category : categoryList){
					%>
						<tr>
							<td>
								<a href="/advance-java/category/detail/noorain?categoryId=<%= category.getId() %>">
									<%= category.getName() %>
								</a>
							</td>
							<td><%= category.getThumbnails() %></td>
							<td>
								<div class="row">
									<div class="col-sm-3">
										<a href="/advance-java/category/delete/noorain?categoryId=<%= category.getId() %>" 
											class="btn btn-danger">Delete</a>
									</div>
									<div class="col-sm-3">
										<a href="/advance-java/category/update/noorain?categoryId=<%= category.getId() %>"
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
						<td colspan="4">No category found</td>
					</tr>
				<%
			}
		%>
	<tbody>
</table>

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 