<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h2>Registration Page</h2><br>
	<form action="/ecomm/registerSuccess" method=POST>
		User Name:<br><input type="text" name="username" /><br><br>
		
		First Name:<br><input type="text" name="firstname" /><br><br>
		
		Last Name:<br><input type="text" name="lastname" /><br><br>
		
		Email ID:<br><input type="text" name="email" /><br><br>
		
		Password:<br><input type="password" name="password" /><br><br>
		
		Phone Number:<br><input type="text" name="phonenumber" /><br><br>
		
		<input type="submit" value="Register" /><br><br>
	</form>
</body>
</html>