<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome!</title>

	<style>
		html{
			text-ailgn:center;
		}
		#d1{
			
		}
	</style>
</head>
<body>

	<h1 style="font-size: 4em;">Welcome Amall!</h1>
	<div id="d1">
		<form name = "welcome" action="welcome" method = "get">
	
		</form>
	
		Amall을 즐기려면 로그인을 해주세요!
		<form action = "login" method="GET">
			<input type = "submit" value="login">
		</form>
	
		Amall 회원이 아니시라면 회원가입을 진행해주세요!
		<form action = "join" method="get">
			<input type="submit" value="Join">
		</form>
	</div>

</body>
</html>