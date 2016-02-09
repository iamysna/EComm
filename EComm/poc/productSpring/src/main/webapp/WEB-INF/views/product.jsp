<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<form action="/productSpring/addProduct" method="post">
			<table>
				<tr><td colspan="2"><label>Add Product</label></td></tr>
				<tr><td>Product ID</td><td><input type="text" name="productId"></td>
				<tr><td>Product Name</td><td><input type="text" name="productName"></td>
				<tr><td>Product Category</td><td><input type="text" name="category"></td>
				<tr><td>Product Price</td><td><input type="text" name="price"></td>
				<tr><td colspan="2"><input type="submit" value="Add Product"></td></tr>
			</table>
		</form>
	</body>
</html>
