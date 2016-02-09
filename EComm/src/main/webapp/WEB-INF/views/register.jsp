<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

<center>
<h2>Registration Page</h2>
<form action="addRegister" method="post" >
<table>
<tr>
	<td>FirstName</td>
	<td><input type="text" name="firstName"></td>
</tr>
<tr>
	<td>LastName</td>
	<td><input type="text" name="lastName"></td>
</tr>
<tr>
	<td>UserName</td>
	<td><input type="text" name="userName"></td>
</tr>
<tr>
	<td>Password</td>
	<td><input type="password" name="password"></td>
	
</tr>
<tr>
	<td>Conform-Password</td>
	<td><input type="password" name="paasword"></td>

</tr>
<tr>
	<td>MobileNumber</td>
	<td><input type="text" name="mobileNumber"></td>
</tr>
<tr>
	<td>UserType</td>
	<td>
	<select name="userType">
		<option value="customer">Customer</option>
		<option value="admin">Admin</option>
	</select>
	</td>

</tr>
<tr>
	<td>Location</td>
	<td><input type="text" name="location"></td>
</tr>
<tr>
	<td>Age</td>
	<td><input type="text" name="age"></td>
</tr>

<tr>
	<td>Gender</td>
	<td>
	<input type="radio" name="gender" value="Female">
	<input type="radio" name="gender" value="Male">
	</td>

</tr>

<tr>

	<td></td>
	<td><input type="submit" value="submit"></td>


</tr>
</table>
</form>

</body>
</center>
</html>