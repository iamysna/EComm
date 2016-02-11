<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="pageTitle">E-commerce</c:set>
<c:set var="imglink">${pageContext.request.contextPath}/assets/img</c:set>
<template:page pageTitle="${pageTitle}" bodyCss="home"
	imglink="${imglink}">
	<div class="column-left">
		<h3>MENU</h3>
		<a href="#skip-menu" class="hidden">Skip menu</a>
		<ul class="menu">
			<li><a
				href="http://all-free-download.com/free-website-templates/"
				class="active">Home</a></li>
			<li><a
				href="http://all-free-download.com/free-website-templates/">About
					me</a></li>
			<li><a
				href="http://all-free-download.com/free-website-templates/">Portfolio</a></li>
			<li class="last"><a
				href="http://all-free-download.com/free-website-templates/">Contact</a></li>
		</ul>
	</div>
	<div id="skip-menu"></div>
	<div class="column-right">
		<div class="box">
			<div class="box-top"></div>
			<div class="box-in">
				<h3>Registration (Custom Login Page)</h3>

<%-- 				<c:if test="${not empty error}"> --%>
<!-- 					<div class="errorblock">Your login attempt was not -->
<!-- 						successful, try again. Caused : -->
<%-- 						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div> --%>
<%-- 				</c:if> --%>
				<form:form action="regit" method="post" commandName="user">
					<table border="1">
						<tr>
							<td><form:label path="name">Name</form:label></td>
							<td><form:input path="name" /></td>
							<td><form:errors path="name" /></td>
						</tr>
						<tr>
							<td><form:label path="username">Username</form:label></td>
							<td><form:input path="username" /></td>
							<td><form:errors path="username" /></td>
						</tr>
						<tr>
							<td><form:label path="password">password</form:label></td>
							<td><form:input path="password" /></td>
							<td><form:errors path="password" /></td>
						</tr>
						<tr>
							<td><form:label path="emailid">emailid</form:label></td>
							<td><form:input path="emailid" /></td>
							<td><form:errors path="emailid" /></td>
						</tr>
						<tr>
							<td><form:label path="mobile">mobile</form:label></td>
							<td><form:input path="mobile" /></td>
							<td><form:errors path="mobile" /></td>
						</tr>
						
						
						<tr>
		                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
		                </tr>
					</table>
				</form:form>
			</div>
		</div>
		<!-- footer -->
	</div>
	<div class="cleaner">&nbsp;</div>
</template:page>