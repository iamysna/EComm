<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form name="f" commandName="loginUser" action="addproduct" method="POST">
<table>
	<tr>
       <td><form:label path="productname" /></td>
       <td><form:input path="pname" /></td>
       <td><form:button>Submit</form:button></td>
   </tr>
   </table>
 </form:form>

</body>
</html>