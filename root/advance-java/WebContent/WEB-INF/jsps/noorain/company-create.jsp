<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">Company</h1>
</div>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Create Company</medium></h3>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/company/list/noorain" role="button">Back</a>
	</h2>
</div>

<form action="/advance-java/company/add/noorain" method="post" id="companyForm" class="container mb-5">
	<div class="form-group">
		<label for="name">Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="nameHelp" placeholder="Enter Name">
		<small id="nameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="description">description</label>
		<input type="text" class="form-control" name="description" id="description" aria-describedby="descriptionHelp" placeholder="Enter description">
		<small id="descriptionHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="primary_contact_attendee_id">primary_contact_attendee_id</label>
		<input type="text" class="form-control" name="primary_contact_attendee_id" id="primary_contact_attendee_id" aria-describedby="primary_contact_attendee_idHelp" placeholder="Enter primary_contact_attendee_id">
		<small id="primary_contact_attendee_idHelp" class="form-text text-muted">
			Please provide number
		</small>
	</div>
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/company/list/noorain" role="button">Cancel</a>
</form> 

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 