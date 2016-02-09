<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table><center>
	<h2>Admin Product Form</h2>

	<form:form action="./products" method="GET">
		<table>
			<tbody>
				
				<tr>
					<td><form:label path="ProductId">ProductId :</form:label></td>
					<td><form:input path="productId"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="ProductName">ProductName :</form:label></td>
					<td><form:input path="productName"></form:input></td>

				</tr>
				<tr>
					<td><form:label path="price">price:</form:label></td>

					<td><form:input path="price"></form:input></td>

				</tr>
				<tr>
					<td><form:label path="Description">Description:</form:label></td>

					<td><form:input path="description"></form:input></td>

				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="addProducts" /></td>
				</tr>
			</tbody>
		</table>

		<a href=".batchupdate/">Batchupdate</a>

</center></table>
	</form:form>
	</center></table>
</body>
</html>