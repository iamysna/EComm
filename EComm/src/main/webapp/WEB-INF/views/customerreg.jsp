<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>customer_registation</title>
</head>
<body>
 
<h2>Customer Registation</h2>
 <h6><a href="<c:url value='j_spring_security_logout'/>">Click here to logout</a></h6>
 
<form:form method="post" action="add" commandName="regist">
 
    <table>
    <tr>
        <td><form:label path="userid"></form:label></td>
        <td><form:input path="userid" /></td>
    </tr>
    <tr>
        <td><form:label path="firstname"></form:label></td>
        <td><form:input path="firstname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname"></form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>    
    <tr>
        <td><form:label path="dob"></form:label></td>
        <td><form:input path="dob" /></td>
    </tr>
    <tr>
        <td><form:label path="email"></form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <form:button name="submit" />
        </td>
    </tr>
</table> 
</form:form>
</body>
</html>