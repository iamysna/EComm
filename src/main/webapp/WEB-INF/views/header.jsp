<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
	<meta name="Author" content="MAHIE">
	<meta name="viewport" content="width=device-width, initial-scale=1">

 <link  href=
"<c:url value="/resources/css/jquery-ui.css"/>" rel="stylesheet"></link>
 <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/normalize.css" />"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />"/>
	
	
 <script src="<c:url value="/resources/js/jquery-1.10.2.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery-ui.js"/>" type="text/javascript"></script>
<script src="<c:url value="resources/js/justjquery.js"/>" type="text/javascript"></script>

	<script src="<c:url value="resources/js/modernizr.js"/>" type="text/javascript"></script>
	<script src="<c:url value="resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="resources/js/main.js"/>" type="text/javascript"></script>
		<script src="<c:url value="resources/js/jquery.nicescroll.js"/>" type="text/javascript"></script>
		<script src="<c:url value="resources/js/npm.js"/>" type="text/javascript"></script>
			<script src="<c:url value="resources/js/waypoints.js"/>" type="text/javascript"></script>
		
	
	          
	
	
	<title>Welcome to SampleShop..!!</title>
</head>
	
<body>
	<nav id="main-nav">
		<h1 id="desktop-name">
			<a href="home"><i><span id="name-first-half">Sample</span><span id="name-second-half">Shop</span></i></a>
		</h1>
		<form action="#" id="desktop-search">
			<div>
				<input type="text" placeholder="Find it Easily..!!">
				<button type="submit"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
			</div>
		</form>
		<div id="deskto-navigation">
			<div id="tracker">
				<a href="#">
					<span class="glyphicon glyphicon-send" aria-hidden="true"></span>
					<span>Track Order</span>
				</a>
			</div>
			<div id="my-account">
				<a href="#">
					<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
					<span>My Account</span>
				</a>
				<div id="login-popup">
					<div>
						<a href="login" id="seller-login" >Admin Login</a><br/>
					</div>
					<div>
						<a href="login" id="customer-login">Customer Login</a><br/>
						<span>New User..? <a href="customerregistration">Signup</a></span>
					</div>
				</div>
			</div>
			<div id="cart">
				<a href="#">
					<span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
					<span id="counter">0</span>
				</a>
			</div>
		</div>
	</nav><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	
	<h1><a href="customer"><font color="red">For Customer</font></a></h1><br><br>
	<h1><a href="admin"><font color="red">For Admin</font></a></h1><br><br>
	
	

</head>
</html>
