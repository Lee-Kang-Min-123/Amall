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
   
     table {
        width: 60%;
      }
      table, th, td {
        border: 1px solid #bcbcbc;
        font-size: 20px;
      }
      .order-text {
      	font-size: 20px;
      }
     
  </style>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
</head>
<body>

	<form role="form" action="paylist" method="get">   
	<table border=1>
		
		<tr>
		<td>Payment ID</td>
		<td><input class="form-control" name='paymentId'
				value='<c:out value="${board.paymentId }"/>' readonly="readonly"></td>
		</tr>
		
		<tr>
		<td>User ID</td>
		<td>${board.userId }</td>
		</tr>
		
		<tr>
		<td>Order ID</td>
		<td><input class="form-control" name='orderId'
				value='<c:out value="${board.orderId }"/>' readonly="readonly"></td>
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
		
		<button type="reset" data-oper="check" style="width:100pt;height:30pt;"  class="btn btn-default">Order Check</button>
		<button type="reset" data-oper="paymentremove" style="width:100pt;height:30pt;"  class="btn btn-default">Cancel</button>
		

	</form>

</body>

<script type="text/javascript">
	$(document).ready(function() {
		
		var formObj = $("form");

		$('button').on("click", function(e) {
			
			e.preventDefault();

			var operation = $(this).data("oper");

			console.log(operation);

			if (operation === 'check') {
				formObj.attr("action", "order?orderId="+${board.orderId});
			}
			formObj.submit();
		});

		$('button').on("click", function(e) {
			
			e.preventDefault();

			var operation = $(this).data("oper");

			console.log(operation);

			if (operation === 'paymentremove') {
				formObj.attr("action", "paymentremove?paymentId="+${board.paymentId});
			}
			formObj.submit();
		});

		
	});
</script>

</html>
