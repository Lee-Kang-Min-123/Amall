
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품</title>

</head>
<body>
	<h2>Hello</h2>
 	<form action="paymentlist" method="post">
 		<input type ="submit" value="All payment">
 		</form>
 		
  <table border="2px">
  <tr>
  	<th width="100">Product ID</th>
  	<th width="150">Product Type</th>
  	<th width="200">Product Name</th>
  	<th width="400">Explanation</th>
  	<th width="150">Price</th>
  	<th width="100">Inventory</th>
  	</tr>
  	</table>
  	
  	<form action="productcreate" method="post">
  		<input type ="submit" value="creat">
  	</form>
</body>
</html>
