<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<h3>Login with Username and Password (Custom Login Page)</h3>

				<c:if test="${not empty error}">
					<div class="errorblock">Your login attempt was not
						successful, try again. Caused :
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div>
				</c:if>
				<form name='f' action="<c:url value='j_spring_security_check' />"
					method='POST'>
					<table>
						<tr>
							<td>User:</td>
							<td><input type='text' name='j_username' value=''></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input type='password' name='j_password' /></td>
						</tr>
						<tr>
							<td colspan='2'><input name="submit" type="submit"
								value="submit" /></td>
						</tr>
						<tr>
							<td colspan='2'><input name="reset" type="reset" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<!-- footer -->
	</div>
	<div class="cleaner">&nbsp;</div>
</template:page>