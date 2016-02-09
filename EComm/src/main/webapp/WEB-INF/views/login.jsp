<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>login</title>
</head>
<body>
<h1>Login Form</h1>
	  <p1>${error}</p1>
<form method="post" action="j_spring_security_check">
UserName<input type="text" class="span12" placeholder="Username"name="j_username" /> <br>
Password<input type="password" class="span12" placeholder="Password" name="j_password" /><br> 
										
<button onclick="return true;" class="width-35 pull-right btn btn-small btn-primary">
										<i class="icon-key"></i> Login
									</button>
</form>
</body>
</html>
