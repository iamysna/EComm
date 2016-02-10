<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>product</title>
</head>
<body>
 
<h2>Product</h2>
 <h6><a href="<c:url value='j_spring_security_logout'/>">Click here to logout</a></h6>
 
<form:form method="post" action="pro" commandName="product">
 
    <table>
    <tr>
       	<td>productid:</td>
        <td><form:input path="productid" /></td>
    </tr>
    <tr>
       	<td>productname:</td>
        <td><form:input path="pname" /></td>
    </tr>
   
    <tr>
        <td>Description:</td>
        <td><form:input path="description" /></td>
    </tr>
    <tr>
        <td>price:</td>
        <td><form:input path="price" /></td>
    </tr>
    
    <tr>
        	<td></td>
            <td><form:button>Submit</form:button></td>
        </td>
    </tr>
</table> 
</form:form>
</body>
</html>