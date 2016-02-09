<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>		
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1 id="banner">Customer Login</h1>
		<form:form name="f" commandName="loginUser" 
					method="POST">
			<table>
				<tr>
					<td>Userid:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="pwd" /></td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
				<td></td>
					<td><form:button>Submit</form:button></td>
					
				</tr>				
			</table>
		</form:form>
		

Don't have an account?	
		<a href="reg">Registation</a></center>
</body>
</html>