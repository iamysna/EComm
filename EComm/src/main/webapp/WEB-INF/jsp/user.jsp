<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<center><h2>Welcome to user page </h2><center>
   <table>
    <tr>
        <td>Welcome </td>
        <td><b><c:out value="${username}"></c:out></b></td>
    </tr>   
</table>  
</body>
</html>