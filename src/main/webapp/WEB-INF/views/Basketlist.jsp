<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
$(function(){

    $("#btnList").click(function(){
        location.href="${path}/BasketController/Basketlist";
    });

    $("#btnDelete").click(function(){
        if(confirm("장바구니를 비우시겠습니까?")){
            location.href="${path}/BasketController/deleteAll";
        }
    });
});
</script>
</head>
<body>
<h2>장바구니</h2>
<c:choose>
    <c:when test="${map.count == 0 }">
        장바구니가 비었습니다.
    </c:when>
    
    <c:otherwise>
    <!-- map.count가 0이 아닐때, 즉 자료가 있을때 -->
    <!-- form을 실행한다.  -->
            <table border="1" width="400px">
                <tr>
                    <th>상품명</th>
                    <th>단가</th>
                    <th>수량</th>
                    <th>금액</th>
                    <th>&nbsp;</th>
                </tr>
                <!-- map에 있는 list출력하기 위해 forEach문을 사용해 row라는 변수에 넣는다. -->
            <c:forEach items="${map.list}"  var="row">
                <tr align="center">
                    <td>
                    	${row.productName}
                    </td>
                    
                    <td>
                    	<fmt:formatNumber value="${row.productPrice}"
                            pattern="#,###,###" />
                    </td>
                            
                    <td>
                    	<input type="number" name="amount" style="width:30px;"
                        value="<fmt:formatNumber value="${row.qty}"
                            pattern="#,###,###" />">
                    <!-- 물건의 개수 (amount)를 fmt태그를 사용해서 패턴의 형식에 맞춰서 문자열로 변환함 -->
                    <!--1,000 / 5,000 등등~  -->
                    
                            <input type="hidden" name="product_id"
                            value="${row.productId}">
                            
                                
                    </td>
                    <td>
                    	<fmt:formatNumber value="${row.money}"
                            pattern="#,###,###" />
                    </td>
                    
                    <td>
                    	<a href="${path}/deleteproduct?product_id=${row.productId}">[삭제]</a>
						<!-- 삭제 버튼을 누르면 delete로 장바구니 개별 id (삭제하길원하는 장바구니 id)를 보내서 삭제한다. -->
                    </td>
                </tr>
            </c:forEach>
                <tr>
                    <td colspan="5" align="right">
                        장바구니 금액 합계 :
                        <fmt:formatNumber value="${map.sumMoney}"
                            pattern="#,###,###" /><br>
                    </td>
                </tr>
            </table>
            <button type="button" id="btnDelete">장바구니 비우기</button>
            <!--  btnUpdate와 btnDelete id는 위쪽에 있는 자바스크립트가 처리한다.-->
        </form>
    </c:otherwise>
</c:choose>
<input type="button" value="상품목록" onclick="location.href='Productlist2'">
<input type="button" value="결제" onclick="location.href='pay?userId=stableyoung'">
<!--  <button type="button" id="btnList">상품목록</button>-->
</body>
</html>
