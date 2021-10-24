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
		</div>
	</div>
	<table>
		<thead>
            <tr>
                <th>Id</th>
                <th>userId</th>
                <th>street</th>
                <th>city</th>
                <th>state</th>
                <th>country</th>
                <th>postcode</th>
            </tr>
        </thead>
		<tr>
             <td><c:out value="${addressDto.id}"/></td>
             <td><c:out value="${addressDto.userId}"/></td>
             <td><c:out value="${addressDto.street}"/></td>
             <td><c:out value="${addressDto.city}"/></td>
             <td><c:out value="${addressDto.state}"/></td>
             <td><c:out value="${addressDto.country}"/></td>
             <td><c:out value="${addressDto.postcode}"/></td>
         </tr>
	</table>
</body>

</html>