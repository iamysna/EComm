<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<center>Ecommerce website</center>
</h1>
<form:form action="click" method="POST">
 
<a href="login"> Login</a>
<a href="reg">Registation</a>

</form:form>

<%-- <P>  The time on the server is ${serverTime}. </P> --%>
</body>
</html>
