<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>product</title>
</head>
<body>
<h6 align="right"><a href=login">Click here to logout</a></h6>
<center>
 
<h2>Product</h2> 
<form method="post" action="productDetails" >
 
    <table>
    <tr>
        <td>productid:</td>
        <td><input type="text" name="productId" /></td>
    </tr>
    <tr>
        <td>productname:</td>
        <td><input type="text" name="productName" /></td>
    </tr>
   
    <tr>
        <td>Description</td>
        <td><input type="text" name="description" /></td>
    </tr>
    <tr>
        <td>Price</td>
        <td><input type="text" name="price" /></td>
    </tr>
    
    <tr>
        <td colspan="1">
            <input type="submit" value="add">
        </td>
    </tr>
</table> 
</form>
</center></body>
</html>