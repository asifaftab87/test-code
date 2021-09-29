<%@page import="org.ecom.noor.model.Brand"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">Brand</h1>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/brand/list/noorain" role="button">Back</a>
	</h2>
</div>
<%
	Brand brand = (Brand)request.getAttribute("brand");
%>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Update Brand</medium></h3>
</div>
<form action="/advance-java/brand/update/noorain" method="post" class="container mb-5">

  <input type="hidden" id="brandId" name="brandId" value="<%= brand.getId() %>" />
  <div class="form-group">
		<label for="name">Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="NameHelp" 
				value="<%= brand.getName() %>" placeholder="Enter Name">
		<small id="NameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	  <div class="form-group">
		<label for="thumbnails">Thumbnails</label>
		<input type="text" class="form-control" name="thumbnails" id="thumbnails" aria-describedby="thumbnailsHelp" 
				value="<%= brand.getThumbnails() %>" placeholder="Enter thumbnails">
		<small id="thumbnailsHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/brand/list/noorain" role="button">Cancel</a>
</form> 
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 