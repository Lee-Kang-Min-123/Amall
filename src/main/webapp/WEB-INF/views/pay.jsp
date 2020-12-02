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
	<table border=1>
	<tr>
	<td>User ID</td>
	<td><input class="form-control" name='userId'
				value='<c:out value="${userId }"/>' readonly="readonly"> </td>
	</tr>
	
	<tr>
	<td>Order ID</td>
	<td><input class="form-control" name='orderId'
				value='<c:out value="${orderId }"/>' readonly="readonly"> </td>
	</tr>
	
	<tr>
	<td>Amount</td>
	<td><input class="form-control" name='amount'
				value='<c:out value="${amount }"/>' readonly="readonly"> </td>
	</tr>
	
	<tr>
	<td>Address</td>
	<td> <input class="form=control" name='address'></td>
	</tr>
	
	<tr>
	<td>Contact</td>
	<td><input class="form=control" name='contact'> </td>
	</tr>
	
	<tr>
	<td>Creditcard Number</td>
	<td><input class="form=control"	name="creditcardNumber"> </td>
	</tr>
	
	<tr>
	<td>Creditcard pass</td>
	<td><input class="form=control"	name='creditcardPassword'></td>
	</tr>

	</table>


		<button type="submit" class="btn btn-default">Submit Button</button>
		<button type="reset" class="btn btn-default">Reset Button</button>

	</form>

</body>
</html>