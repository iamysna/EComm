<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template" %>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="pageTitle">E-commerce</c:set>
<c:set var="imglink">${pageContext.request.contextPath}/assets/img</c:set>
<template:page pageTitle="${pageTitle}" bodyCss="home" imglink="${imglink}">
	<div class="column-left">
      <h3>MENU</h3>
      <a href="#skip-menu" class="hidden">Skip menu</a>
      <ul class="menu">
        <li><a href="http://all-free-download.com/free-website-templates/" class="active">Home</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">About me</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Portfolio</a></li>
        <li class="last"><a href="http://all-free-download.com/free-website-templates/">Contact</a></li>
      </ul>
    </div>
    <div id="skip-menu"></div>
    <div class="column-right">
      <div class="box">
        <div class="box-top"></div>
        <div class="box-in">
          <h2>Welcome to my website</h2>
          <p>Integer metus enim, laoreet vitae, blandit sit amet, gravida eu, eros. Morbi quis enim. Sed velit. Proin a sapien a lacus semper auctor. Maecenas faucibus aliquam diam. Duis aliquet. Donec feugiat tincidunt orci. Aliquam suscipit. Cras vehicula sodales erat. Duis non felis.</p>
          <p>Sed pharetra felis quis quam. Morbi aliquet consectetuer ligula. Curabitur velit elit, pellentesque tincidunt, ultrices ut, ullamcorper eget, ante. Curabitur ipsum orci, cursus eget, ultricies et, fringilla in, felis. Aliquam porta augue ac arcu. Aliquam mi. Fusce cursus lorem sed mi.</p>
          <br />
          <h2>Lorem ipsum dolor</h2>
          <ul class="main-list">
            <li>Mauris viverra, <strong>tellus sed euismod</strong> auctor</li>
            <li>Cras <strong>condimentum</strong>, sapien et ultrices</li>
            <li>Pellentesque habitant <strong>morbi tristique</strong> senectus</li>
            <li>Nam rutrum, <strong>turpis sed ornare</strong></li>
            <li>Praesent <strong>feugiat</strong>, libero eget tincidunt</li>
          </ul>
        </div>
      </div>
      <!-- footer -->
    </div>
    <div class="cleaner">&nbsp;</div>
</template:page>