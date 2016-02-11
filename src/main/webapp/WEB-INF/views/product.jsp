<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="productDetails" method="post">
<center>
<h1>Product Name:<input type="text" name="productName" required="required"></h1><br>
<h1>Description:<input type="textarea" name="description" required="required"></h1><br>
<h1>Price:<input type="text" name="price" required="required"></h1>
</center>
<input type="submit" value="Add">
</form>
</center>

</body>
</html>