<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/Tag"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<template:htmlTag pageTitle="this form">
	<!-- just after temp:page -->
	
<!--  if we have errors
display thoose errors with messages  -->
		<form:form method="POST" action="submitTagForm" commandName="tagForm">
   <table>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name"/></td>
    </tr>
    <tr>
        <td><form:label path="name">dateofyear</form:label></td>
        <td><form:select path="dateofyear" items="${years}"/></td>
    </tr>
    <tr>
        <td><form:label path="age">Age</form:label></td>
        <td><form:input path="age" /></td>
    </tr>
    <tr>
        <td><form:label path="id">id</form:label></td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
	<!--  just before end of temp:page -->
</template:htmlTag>