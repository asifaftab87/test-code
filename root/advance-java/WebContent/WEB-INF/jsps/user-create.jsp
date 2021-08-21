<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create User</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
			  $(function() {
			    $("#datepicker").datepicker();
			  });
  	    </script>
	</head>
	
	<body>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/user/list">Users Detail</a></h2>
		</div>
		
		<h1>Add User</h1>
		<form action="/advance-java/user/add" method="post" id="userForm">
		  <label for="fname">First name:</label><br>
		  <input type="text" id="fname" name="fname"><br>
		  
		  <label for="lname">Last name:</label><br>
		  <input type="text" id="lname" name="lname"><br>
		  
		  <label for="fatherName">Father Name:</label><br>
		  <input type="text" id="fatherName" name="fatherName" onmouseover="testing();"><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob"><br>
		  
		  <label for="email">Email:</label><br>
		  <input type="text" id="email" name="email"><br><br>
		  
		  <input type="radio" id="male" name="gender" value="true">
		  <label for="male">Male</label>
		  
		  <input type="radio" id="female" name="gender" value="false">
		  <label for="female">Female</label><br><br>
		  
		  <label for="country">Country:</label>
		  <select id="country" name="country" onchange="changeCountry();">
			  <option value="-1">Please Select</option>
			  <option value="india">India</option>
			  <option value="yemen">Yemen</option>
			  <option value="syria">Syria</option>
			  <option value="saudi">Saudi</option>
		  </select>
		  <br><br>
		  
		  <!--  <input type="submit" value="Submit2">  -->
		  <input type="button" value="Submit" onclick="submitForm();">
		</form> 
		
		<script type="text/javascript">
		
			function testing(){
				console.log("on mouse hover this element");
			}
			function submitForm(){
				console.log('print in browser console');
				
				var firstName = document.getElementById("fname").value;
				console.log("firstName: "+firstName);
				if(firstName.length==0){
					alert('Please provide first name');
					return false;
				}
				
				var fatherName = document.getElementById("fatherName").value;
				if(fatherName.length==0){
					alert('Please provide father name');
					return false;
				}
				
				
				var dob = document.getElementById("datepicker").value;
				if(dob.length==0){
					alert('Please provide Date of Birth');
					return false;
				}
				
				var email = document.getElementById("email").value;
				if(email.length==0){
					alert('Please provide email');
					return false;
				}
				if(!validateEmail(email)){
					alert('Please provide correct email format');
					return false;
				}
				
				var countryValue = document.getElementById("country").value;
				if(countryValue==-1){
					alert('Please select country from drop down');
					return false;
				}
				
				document.getElementById("userForm").submit();
			}
			
			function changeCountry(){
				var val = document.getElementById('country').value;
				console.log('country change : '+val);
			}
			
			$(document).ready(function(){
				console.log("page loaded/refresh");
			    $("#fname").keydown(function(event){
			        var inputValue = event.which;
			        console.log('inputValue: '+inputValue);
			        // allow letters and whitespaces only.
			        if(!(inputValue >= 65 && inputValue <= 120) && (inputValue != 32 && inputValue != 0)) { 
			            event.preventDefault(); 
			        }
			    });
			    
			    $("#lname").keydown(function(event){
			        var inputValue = event.which;
			        // allow letters and whitespaces only.
			        if(!(inputValue >= 65 && inputValue <= 120) && (inputValue != 32 && inputValue != 0)) { 
			            event.preventDefault(); 
			        }
			    });
			});
			
			function validateEmail(email) {
				  const re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
				  return re.test(email);
				}
			
		</script>
	</body>
</html>