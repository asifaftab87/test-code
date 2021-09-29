<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">Category</h1>
</div>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Create Category</medium></h3>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/category/list/noorain" role="button">Back</a>
	</h2>
</div>

<form action="/advance-java/category/add/noorain" method="post" id="categoryForm" class="container mb-5">
	<div class="form-group">
		<label for="name">Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="nameHelp" placeholder="Enter Name">
		<small id="nameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="thumbnails">Thumbnails</label>
		<input type="text" class="form-control" name="thumbnails" id="thumbnails" aria-describedby="thumbnailsHelp" placeholder="Enter thumbnails">
		<small id="thumbnailsHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/category/list/noorain" role="button">Cancel</a>
</form> 

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 