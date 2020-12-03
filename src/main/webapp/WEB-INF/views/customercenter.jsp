<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>고객센터</title>
</head>
<body>
    <h1>고객센터</h1>
<h3> 자주 묻는 질문</h3>
    <p>1.교환&환불은 어떻게 하나요?</p>
    
    <hr>
	<p>- 고객센터 ***번으로 연락주시면 확인 절차 후 진행됩니다.</p>
  <hr>
  <p>2.주문상품 배송기간은 얼마나 되나요?</p>
	<hr>
    <p>- 입금 확인후 1~2내에 발송완료됩니다.</p>
  <hr>
  <p>3.무통장입금 확인이 안될경우</p>
  <hr>
  <p>- 1시간 이내 입금 확인이 되지 않는 경우 고객센터 ***번으로 문의 바랍니다.</p>
  <hr>
  <form action = "productlist" method="get">
			<input type="submit" value="상품목록으로 돌아가기">
		</form>
  <footer>
  <hr>
    <p>Made by Amall</p>
  </footer>
</body>
</html>
