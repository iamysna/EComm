<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table><center>
	<h2>User Register Form</h2>

	<form:form action="/register" method="GET">
		<table>
			<tbody>
				<tr>
					<td><form:label path="FirstName">FirstName :</form:label></td>
					<td><form:input path="firstName"></form:input></td>

				</tr>
				<tr>
					<td><form:label path="LastName"> LastNAme :</form:label></td>
					<td><form:input path="lastName"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="age">Age:</form:label></td>

					<td><form:input path="age"></form:input></td>

				</tr>
				<tr>
					<td><form:label path="Email">Email :</form:label></td>

					<td><form:input path="email"></form:input></td>

				</tr>
				<tr>
					<td><form:label path="ConfirmEmail">Confirm Email :</form:label></td>

					<td><form:input path="confirmEmail"></form:input></td>

				</tr>
				<tr>
					<td><form:label path="Mobile">Mobile :</form:label></td>

					<td><form:input path="mobile"></form:input></td>

				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Register" /></td>
				</tr>
			</tbody>
		</table>

		<a href="./login">Login</a>

</center></table>
	</form:form>
	</center></table>

</body>
</html>