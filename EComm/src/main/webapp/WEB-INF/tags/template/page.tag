<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template" %>
<%@ taglib prefix="header" tagdir="/WEB-INF/tags/common/header" %>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/common/footer" %>

<%@ attribute name="pageTitle" required="false"  %>

<%@ attribute name="bodyCss" required="false" type="java.lang.String" %>
<%@ attribute name="imglink" required="false" type="java.lang.String" %>

<template:master pageTitle="${pageTitle}">
	
		<div id="wrapper">
<%-- 		<div class="${bodyCss}"> --%>
			
			<header:header imglink="${imglink}" />
			 		
			 <div class="content">
					<jsp:doBody />
			</div>
						
			<footer:footer imglink="${imglink}" />
		
		</div>
	
	
	
</template:master>