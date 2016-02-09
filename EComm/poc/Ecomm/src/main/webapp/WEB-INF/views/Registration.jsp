<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<form:form action="proceedRegister" method="POST" commandName="registration">
			<table>
				<tr>
					<td colspan="2"> New User Registration </td>
				</tr>
				<tr>
					<td><form:label path="fname">First Name</form:label></td>
					<td><form:input path="fname"/></td>
				</tr>
				<tr>
					<td><form:label path="lname">Last Name</form:label></td>
					<td><form:input path="lname"/></td>
				</tr>
				<tr>
					<td><form:label path="dob">Date of Birth</form:label></td>
					<td><form:input path="dob"/></td>
				</tr>
				<tr>
					<td><form:label path="gender">Gender</form:label></td>
					<td><form:input path="gender"/></td>
				</tr>
				<tr>
					<td><form:label path="email">Email-ID</form:label></td>
					<td><form:input path="email"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type=submit value="proceed" /></td>
				<tr>
			</table>
		</form:form>
	</body>
</html>