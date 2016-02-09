<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%> --%>

<%-- <%@ taglib prefix="template" tagdir="/WEB-INF/tags/template"%> --%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<h1>WelCome To Online Products</h1>

<c:set var="pageTitle">WelCome TO Online Products :: Login</c:set>
<template:page pageTitle="${pageTitle}" bodyCss="login-layout">
		<center>
									<h4> Please Enter Your Information</h4>

									<div class="space-6"></div>
									<form method="post" action="j_spring_security_check">
										<fieldset>
											<label> <span
												class="block input-icon input-icon-right"> <input
													type="text" class="span12" placeholder="Username"
													name="j_username" /> 
											</span>
											<br>
											<br>
											</label> <label> <span
												class="block input-icon input-icon-right"> <input
													type="password" class="span12" placeholder="Password"
													name="j_password" />
											</span>
											</label>

												<button onclick="return true;"
													class="width-35 pull-right btn btn-small btn-primary">
													<i class="icon-key"></i> Login
												</button>
											</div>

											<div class="space-4"></div>
										</fieldset>
									</form>
									<a href="./register"></a>
		</center>
		For New Users signUp here
		<a href="./register">Register</a>
</template:page>