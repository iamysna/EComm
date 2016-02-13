<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="java.util.List" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% List pList = (List)session.getAttribute("productList");
   request.setAttribute("pList", pList);
%>



<table class="table table-hover">
                
                    <tr>
                        <th>productId</th>
                        <th>productName</th>
                        <th>description</th>
                        <th>price</th>
                        
                
                </tr>
<c:forEach var="product" items="${pList}">


                    <tr>
                        <td>${product.productId}</td>
                        <td>${product.productName}</td>
                        <td>${product.description}</td>
                        <td>${product.price}</td>
                                           
                </c:forEach>
                </tbody>
            </table>
 

</body>

</html>