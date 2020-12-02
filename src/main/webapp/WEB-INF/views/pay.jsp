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

	<form role="form" action="pay" method="post">

		<div class="form-group">
			<label>User ID</label> <input class="form-control" name='userId'
				value='<c:out value="${userId }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Order ID</label> <input class="form-control" name='orderId'
				value='<c:out value="${orderId }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Amount</label> <input class="form-control" name='amount'
				value='<c:out value="${amount }"/>' readonly="readonly">
		</div>

		<div class="form-group">
			<label>Address</label> <input class="form=control" name='address'>
		</div>

		<div class="form-group">
			<label>Contact</label> <input class="form=control" name='contact'>
		</div>

		<div class="form-group">
			<label>Creditcard Number</label> <input class="form=control"
				name="creditNum">
		</div>

		<div class="form-group">
			<label>Creditcard pass</label> <input class="form=control"
				name='creditPass'>
		</div>

		<button type="submit" class="btn btn-default">Submit Button</button>
		<button type="reset" class="btn btn-default">Reset Button</button>

	</form>

</body>
</html>