<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
    <script src = "http://localhost:8080/amall/login"></script>
</head>
<body>
	<h1>Login Form</h1> <!-- 로그인 제목-->
   		 <form action="login" method = "post">
			<table>
				<tr><td>Login Select</td> <!-- 로그인 종류 선택-->
					<td><select name ="userType">
						<option name="userType" value="unknown">Your Select
						<option name="userType" value="A">Administrator
						<option name="userType" value="C">Customer</select>
				</td></tr>
				<!-- 유저이름, 패스워드-->
				<tr><td>Username:</td><td>
					<input type = "text" name="userId" size="24"></td></tr>
				<tr><td>Password:</td><td>
					<input type ="password" name="password" size="24"></td>
				</tr></table>
					<input type = "submit" value="Submit">
		</form>
		</br>
		<hr/> <!-- 구분 선-->
		<!-- 회원가입 부분-->
		Amall 회원이 아니시라면 회원가입을 진행해주세요!
		<form action = "join.jsp" method="post">
			<input type="submit" value="Join">
		</form>
</body>
</html>