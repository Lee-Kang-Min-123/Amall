
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Form</title>

</head>
<body>
	<h2>Hello<br/>This is Create Form</h2>

 		<form action="createprocess" method="post">
  <table>
  <tr>
  	<tr> <td>Product Type:</td><td>
  	 <input type="text" name="producttype" size="20"></td></tr>
  	<tr><td>Product Name:</td><td>
  		<input type="text" name="productname" size="20"></td></tr>
  	<tr><td>Explanation:</td><td>
  		<input type="text" name="explanation" size="50"></td></tr>
  	<tr><td>Price:</td><td>
  		<input type="text" name="price" size="5"></td></tr>
  	<tr><td>Inventory:</td><td>
  		<input type="text" name="inventory" size="5"></td></tr>
  	</table>
  	<input type="submit"value="Submit">

  	</form>
</body>
</html>
