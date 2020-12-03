<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>highprice</title>
</head>
<body>
	
	<h2>높은가격순</h2>
	<form action = highprice" method = "post">
		<input type="submit" value = "backlist">
	</form>
	
	<table border="2px">
		<thread>
  		<tr>
  			<th width="100">Product ID</th>
  			<th width="150">Product Type</th>
  			<th width="200">Product Name</th>
  			<th width="400">Explanation</th>
  			<th width="150">Price</th>
  			<th width="100">Inventory</th>
  		</tr>
  		<thread>
  	
  	
  	<c:forEach items = "${list }" var="list">
  		<tr>
  			<td>${list.productId }</td>
  			<td>${list.productType }</td>
  			<td>${list.productName }</td>
  			<td>${list.explanation }</td>
  			<td>${list.productPrice }</td>
  			<td>${list.inventory }</td>
  		</tr>
  	</c:forEach>
	</table>

</body>
</html>