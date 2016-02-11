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
<h1 id="banner">Admin Login</h1>
		<form method="post" action="j_spring_security_check">  
  
    <table>  
     <tr>  
      <td colspan="3" style="color: red">${message}</td>  
  
     </tr>  
     <tr>  
      <td>User Name:</td>  
      <td><input type="text" name="j_username" />  
      </td>  
     </tr>  
     <tr>  
      <td>Password:</td>  
      <td><input type="password" name="j_password" />  
      </td>  
     </tr>  
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Login" />  
      </td>  
  
     </tr>  
    </table>  
   </form>  
		
		

Don't have an account?	
		<a href="reg">Registation</a></center>
</body>
</html>