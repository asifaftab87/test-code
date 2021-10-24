<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<title>Balances</title>
</head>
<body>


	<div class="container">

		<div class="starter-template">
			<h1>Spring Boot Web JSP Example</h1>
			<h2>Message: ${message}</h2>
		</div>
	</div>
	<table>
		<thead>
			            <tr>
			                <th>Id</th>
			                <th>amount</th>
			                <th>active</th>
			                <th>status</th>
			            </tr>
			        </thead>
		<tr>
             <td><c:out value="${balanceDto.id}"/></td>
             <td><c:out value="${balanceDto.amount}"/></td>
             <td><c:out value="${balanceDto.active}"/></td>
             <td><c:out value="${balanceDto.status}"/></td>
         </tr>
	</table>
</body>

</html>