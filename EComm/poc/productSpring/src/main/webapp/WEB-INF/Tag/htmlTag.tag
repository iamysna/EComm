<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/Tag"%>
<%@ attribute name="pageTitle" required="false"%>
<html>
<head>
	<title>${not empty pageTitle ? pageTitle : 'set Title'}</title>
</head>
<body>
	<h1>Tag Demo Test</h1>
	
	<!--  here start of do body -->
	<jsp:doBody />
	<!--  this is end of do body -->
	</body>
	</html>