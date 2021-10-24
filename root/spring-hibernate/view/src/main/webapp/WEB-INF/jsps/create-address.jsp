<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
    <head>
    	<title>Create Address</title>
    </head>
    <body>
        <h3>Create address</h3>
        <form:form method="POST" action="/view/balance/create/address" modelAttribute="addressDto">
             <table>
             	<tr>
                    <td><form:label path="userId">User Id</form:label></td>
                    <td><form:input path="userId" /></td>
                </tr>
                <tr>
                    <td><form:label path="street">Street</form:label></td>
                    <td><form:input path="street" /></td>
                </tr>
                <tr>
                    <td><form:label path="city">City</form:label></td>
                    <td><form:input path="city" /></td>
                </tr>
                <tr>
                    <td><form:label path="state">State</form:label></td>
                    <td><form:input path="state" /></td>
                </tr>
                <tr>
                    <td><form:label path="country">Country</form:label></td>
                    <td><form:input path="country" /></td>
                </tr>
                <tr>
                    <td><form:label path="postcode">postcode</form:label></td>
                    <td><form:input path="postcode" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form:form>
    </body>
    
    <style>
    	.error{
    		color: red;
    	}
    </style>
</html>