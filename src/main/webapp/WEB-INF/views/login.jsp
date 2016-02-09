<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>

<html>
<body>

<%@include file="header.jsp" %>
<section id="body-section">
		<form action="/" id="login">	
		<small id="login-status">${status}</small>		
			<div id="loginform-wrapper">
			
			<div><input type="text" placeholder="Email Id" id="emailId"/></div>
			<div><input type="password" placeholder="Password" id="password"/></div>
			<div><input type="button" value="Login" id="login-button" onclick="loginFun()"/></div>
			</div>
		</form>
	</section>
	






</body>
<script>

function loginFun(){
var emailId=document.getElementById("emailId").value;
var password=document.getElementById("password").value;
$.ajax({
type:"post",
url:"login",
data:"emailId="+emailId+"&password="+password,
success:function(result){
  /* $("#login-status").html(result);  
  window.location.reload(false); */
}
});
}
</script>
</html>