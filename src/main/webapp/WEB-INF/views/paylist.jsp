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

		<div class="form-group">
			<label>User ID</label> <input class="form-control" name='userId'
				value='<c:out value="${board.userId }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Order ID</label> <input class="form-control" name='orderId'
				value='<c:out value="${board.orderId }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Amount</label> <input class="form-control" name='amount'
				value='<c:out value="${board.amount }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Address</label> <input class="form=control" name='address'
			value='<c:out value="${board.address }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Contact</label> <input class="form=control" name='contact'
			value='<c:out value="${board.contact }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Creditcard Number</label> <input class="form=control" name='creditcardNumber'
			value='<c:out value="${board.creditcardNumber }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Creditcard pass</label> <input class="form=control" name='creditcardPassword'
			value='<c:out value="${board.creditcardPassword }"/>' readonly="readonly">
		</div>
		
		<button type="button" onClick="location.href='http://localhost:8080/amall/order?orderId='+'${board.orderId }'"  class="btn btn-default">Order Check</button>
		

	</form>

</body>
</html>
