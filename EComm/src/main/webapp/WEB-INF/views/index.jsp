<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<center><h2><b>Login Page</b></h2><center>
<form:form action="print details" method="post" commandName="login">
   <table>
    <tr>
        <td>Username :</td>
       <td> <form:input path="username" /></td>
        
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="password" /></td>
    </tr>
    <tr>
        <td colspan="2">
           <center><form:button>submit</form:button><center>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>