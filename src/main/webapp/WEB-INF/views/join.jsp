<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<head><title>회원 가입</title></head>
<body>
	<h2>회원 가입</h2>
	<form action="join" method="post">
		<table>
			<tr><td>Login Select</td>
					<td><select name ="userType">
						<option name="userType" value="unknown">Your Select
						<option name="userType" value="A">Administrator
						<option name="userType" value="C">Customer</select>
			</td></tr>
			<tr><td>이름:</td><td>
				<input type="text" name="userName" size="24"></td></tr>
			<tr><td>ID:</td><td>
				<input type="text" name="userId" size="24"></td></tr>
			<tr><td>PW:</td><td>
				<input type="password" name="password" size="24"></td></tr>
			<tr><td>생년월일(YYYY-MM-DD):</td><td>
				<input type="text" name="birthday" size="24"></td></tr>		
			<tr><td>성별:</td><td>
				<input type="text" name="gender" size="24"></td></tr>
			<tr><td>Email:</td><td>
				<input type="text" name="email" size="24"></td></tr>
			<tr><td>휴대폰 번호:</td><td>
				<input type="text" name="contact" size="24"></td></tr>
			<tr><td>주소:</td><td>
				<input type="text" name="address" size="50"></td></tr>
		</table>
		<input type="submit" value="가입" >
		
	</form>
	</body>
</html>

