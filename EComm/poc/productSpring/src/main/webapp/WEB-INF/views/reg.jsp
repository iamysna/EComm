<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="xyz" method="POST" commandName="regis">
<table>
<tr><td colspan=2>Registration form</td></tr>
<tr><td><form:label path="uname">Name</form:label></td><td><form:input path="uname"/><form:errors path="uname"></form:errors></td><tr>
<tr><td><form:label path="pass">Password</form:label></td><td><form:password path="pass"/><form:errors path="pass"></form:errors></td><tr>
<tr><td><form:label path="fname">First Name</form:label></td><td><form:input path="fname"/><form:errors path="fname"></form:errors></td><tr>
<tr><td><form:label path="lname">Last Name</form:label></td><td><form:input path="lname"/><form:errors path="lname"></form:errors></td><tr>
<tr><td><form:label path="gender">Gender</form:label></td><td><form:radiobutton path="gender" value="Male" label="Male"/>&nbsp;<form:radiobutton path="gender" value="Female" label="Female"/><form:errors path="gender"></form:errors></td><tr>
<tr><td><form:label path="email">Email-id</form:label></td><td><form:input path="email"></form:input><form:errors path="email"></form:errors></td></tr>
<tr><td><form:label path="phone">Phone</form:label></td><td><form:input path="phone"></form:input><form:errors path="phone"></form:errors></td></tr>
<tr><td><form:label path="country">Country</form:label></td><td><form:select path="country" items="${countryList}" /><form:errors path="country"></form:errors></td><tr>
<tr><td><form:label path="hobby">Hobby</form:label></td><td><form:checkboxes path="hobby" items="${hobbyList}" /><form:errors path="hobby"></form:errors></td><tr>
<tr><td><form:label path="address">Address</form:label></td><td><form:textarea path="address"></form:textarea><form:errors path="address"></form:errors></td></tr>
<tr><td><form:checkbox path="mail" label="Would you like to have newsletters!!!"/></td><td></td><tr>
<tr><td><form:button>Register</form:button></td><tr> 
</table>
</form:form>
</body>
</html>