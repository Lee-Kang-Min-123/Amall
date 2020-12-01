<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문서 출력</title>
<style>
      table {
        width: 80%;
      }
      table, th, td {
        border: 1px solid #bcbcbc;
        font-size: 20px;
      }
      .order-text {
      	font-size: 24px;
      }
</style>
</head>
<body>
	<br>
	<br>
	<br>
		<span class='order-text'>주문서 정보</span>
	<br>
	<br>
	<table border=1>
		<thead align = center>
			<tr>
				<th>
					주문서 번호
				</th>
				<th>
					주문 날짜
				</th>
				<th>
					총 금액 
				</th>
			<tr>
		</thead>
		<tbody align = center>
			<tr>
				<th>
					${order.orderId}
				</th>
				<th>
					${order.orderDate}
				</th>
				<th>
					${order.orderAmt}
				</th>
			<tr>
		</tbody>
	</table>
	<br>
	<br>
	<br>
		<span class='order-text'>주문서 상세</span>
	<br>
	<br>
	<table border=1>
		<thead align = center>
			<tr>
				<th>
					순서
				</th>
				<th>
					상품명
				</th>
				<th>
					수량
				</th>
				<th>
					단위금액
				</th>
			<tr>
		</thead>
		<tbody align = center>
	<c:forEach items="${list}" var="item">
		<tr>
			<td>
				${item.orderSeq}
			</td>
			<td>
				${item.productName}
			</td>
			<td>
				${item.qty}
			</td>
			<td>
				${item.productPrice}
			</td>
		</tr>
	</c:forEach>	
		</tbody>
	</table>	
</body>
</html>