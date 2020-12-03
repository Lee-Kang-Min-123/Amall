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


		<button type="submit" style="width:100pt;height:30pt;" class="btn btn-default">Submit Button</button>
		<button type="reset" style="width:100pt;height:30pt;" data-oper="remove" class="btn btn-default">Cancel</button>

	</form>

</body>

<script type="text/javascript">
	$(document).ready(function() {
		
		var formObj = $("form");

		$('button').on("click", function(e) {
			
			e.preventDefault();

			var operation = $(this).data("oper");

			console.log(operation);

			if (operation === 'remove') {
				formObj.attr("action", "payremove?orderId=${orderId}");
			}
			formObj.submit();
		});
	});
</script>


</html>