<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Login Manager</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 100%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
</head>
<body>

<h2>Sign in</h2>

<form:form method="post" action="add.html" commandName="logindetails">

	<table>
	<tr>
		<td><form:label path="username"><spring:message code="label.username"/></form:label></td>
		<td><form:input path="username" /></td> 
	</tr>
	<tr>
		<td><form:label path="password"><spring:message code="label.password"/></form:label></td>
		<td><form:password path="password" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.addlogin"/>"/>
		</td>
	</tr>
</table>	
</form:form>

	


</body>
</html>
