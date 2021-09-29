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

<div class='text-center mb-3'>
	<h3><medium class="text-muted">Create City</medium></h3>
</div>
<form action="/advance-java/city/add/noorain" method="post" id="cityForm" class="container mb-5">
	<div class="form-group">
		<label for="name"> Name</label>
		<input type="text" class="form-control" name="name" id="name" aria-describedby="NameHelp" placeholder="Enter Name">
		<small id="NameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/city/list/noorain" role="button">Cancel</a>
</form> 

<script type="text/javascript">

	function testing(){
		console.log("on mouse hover this element");
	}
	function submitForm(){
		console.log('print in browser console');
		
		var firstName = document.getElementById("name").value;
		console.log("Name: "+Name);
		if(Name.length==0){
			alert('Please provide name');
			return false;
		}
		
		document.getElementById("cityForm").submit();
	}
	
	
	$(document).ready(function(){
		console.log("page loaded/refresh");
	
</script>
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 