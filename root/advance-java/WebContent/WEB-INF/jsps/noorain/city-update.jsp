<%@page import="org.ecom.noor.model.City"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">City</h1>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/city/list/noorain" role="button">Back</a>
	</h2>
</div>
<%
	City city = (City)request.getAttribute("city");
%>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Update City</medium></h3>
</div>
<form action="/advance-java/city/update/noorain" method="post" class="container mb-5">

  <input type="hidden" id="cityId" name="cityId" value="<%= city.getId() %>" />
  <div class="form-group">
		<label for="name">Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="NameHelp" 
				value="<%= city.getName() %>" placeholder="Enter Name">
		<small id="firstNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/city/list/noorain" role="button">Cancel</a>
</form> 
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
