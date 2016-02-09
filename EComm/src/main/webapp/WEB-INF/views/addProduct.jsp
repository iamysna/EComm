<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add product</title>
</head>
<body>
	<h2>Add Product Page</h2><br>
	<form action="/ecomm/addedProduct" method=POST>

		Product Name:<br><input type="text" name="name" /><br><br>
		
		Description:<br><input type="text" name="description" /><br><br>
		
		Price:<br><input type="text" name="price" /><br><br>
		
		<input type="submit" value="Add Product" /><br><br>
	</form>
</body>
</html>