<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">Employee</h1>
</div>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Create Employee</medium></h3>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/employee/list/jamal" role="button">Back</a>
	</h2>
</div>

<form action="/advance-java/employee/add/jamal" method="post" id="employeeForm" class="container mb-5">
	<div class="form-group">
		<label for="name">Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="nameHelp" placeholder="Enter Name">
		<small id="nameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="age">Email</label>
		<input type="text" class="form-control" name="email" id="email" aria-describedby="emailHelp" placeholder="Enter Email">
		<small id="emailHelp" class="form-text text-muted">
			Please provide your email
		</small>
	</div>
	<div class="form-group">
		<label for="age">Age</label>
		<input type="text" class="form-control" name="age" id="age" aria-describedby="ageHelp" placeholder="Enter Age">
		<small id="ageHelp" class="form-text text-muted">
			Please provide number
		</small>
		</div>
	<div class="form-group">
		<label for="joined_date">Joined Date</label>
		<input type="text" name="joined_date" class="form-control" id="joined_date" aria-describedby="joined_dateHelp" placeholder="Enter joined date">
		<small id="joined_dateHelp" class="form-text text-muted">
			Please provide Joined Date
			</small>
			</div>
	<div class="form-group">
		<label for="release_date">Joined Date</label>
		<input type="text" name="release_date" class="form-control" id="release_date" aria-describedby="release_dateHelp" placeholder="Enter Eelease Date">
		<small id="release_dateHelp" class="form-text text-muted">
			Please provide Release Date
			</small>
			</div>
	<div class="form-group">
		<label for="notice_period">Notice Period</label>
		<input type="text" class="form-control" name="notice_period" id="notice_period" aria-describedby="notice_periodHelp" placeholder="Enter Notice Period">
		<small id="notice_periodHelp" class="form-text text-muted">
			Please provide Notice Period
		</small>
			
		
	</div>
	<div class="form-group">
		<label for="salary">Salary</label>
		<input type="text" class="form-control" name="salary" id="salary" aria-describedby="salaryHelp" placeholder="Enter Salary">
		<small id="salaryHelp" class="form-text text-muted">
			Please provide number
		</small>
		
	<div class="form-check form-check-inline">
		<input class="form-check-input" type="radio" name="gender" id="male" value="true">
		<label class="form-check-label" for="male">
			Male
		</label>
	</div>
	<div class="form-check form-check-inline">
		<input class="form-check-input" type="radio" name="gender" id="female" value="false">
		<label class="form-check-label" for="female">
			Female	
		</label>
		
		</div>
	</div>
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/employee/list/jamal" role="button">Cancel</a>
</form> 

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 