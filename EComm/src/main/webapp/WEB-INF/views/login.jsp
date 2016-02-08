<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<div>
				<form:form method="POST" action="login" commandName="login">
				   <table>
				   		<tr>
				   			<td colspan="2">Login Here...!!!</td>
				   		</tr>
					    <tr>
					        <td><form:label path="uname">Username</form:label></td>
					        <td><form:input path="uname"/></td>
					    </tr>
					    <tr>
					        <td><form:label path="pass">Password</form:label></td>
					        <td><form:password path="pass"/></td>
					    </tr>
						<tr>
					        <td colspan="2">
					            <input type="submit" value="Submit"/>
					        </td>
					    </tr>
					</table>
					</form:form>
			</div>
	</body>
</html>
