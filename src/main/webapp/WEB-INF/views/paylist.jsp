<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Pay</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<html>
<head>
<meta charset="UTF-8">
<title>Pay</title>

<style>
     #button1 { position: relative; left:180px; bottom:0px }
     #button2 { position: relative; left:250px; bottom:70px }
  </style>
  
</head>
<body>

	<form role="form" action="paylist" method="get">   
	<table border=1>
		<tr>
		<td>User ID</td>
		<td>${board.userId }</td>
		</tr>
		
		<tr>
		<td>Order ID</td>
		<td>${board.orderId }</td>
		</tr>
		
		<tr>
		<td>Amount</td>
		<td>${board.amount }</td>
		</tr>
		
		<tr>
		<td>Address</td>
		<td>${board.address }</td>
		</tr>
		
		<tr>
		<td>Contact</td>
		<td>${board.contact }</td>
		</tr>
		
		<tr>
		<td>Creditcard Number</td>
		<td>${board.creditcardNumber}</td>
		</tr>
		
		<tr>
		<td>Creditcard pass</td>
		<td>${board.creditcardPassword }</td>
		</tr>
		
		

		</table>
		
		<button type="button" onClick="location.href='http://localhost:8080/amall/order?orderId='+'${board.orderId }'"  class="btn btn-default">Order Check</button>
		

	</form>

</body>
</html>
