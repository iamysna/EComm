<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
			<tr><td>Singleton / Default</td><td><a href="${pageContext.servletContext.contextPath}/singleton">click Here</a></td></tr>
			<tr><td>Request</td><td><a href="${pageContext.servletContext.contextPath}/request">Click Here</a></td></tr>
			<tr><td>Session</td><td><a href="${pageContext.servletContext.contextPath}/session">Click Here</a></td></tr>
			<tr><td>Prototype</td><td><a href="${pageContext.servletContext.contextPath}/prototype">Click Here</a></td></tr>
</table>
</body>
</html>