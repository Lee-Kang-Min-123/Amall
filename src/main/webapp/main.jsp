<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
​<%@page session="false" import="java.util.Iterator"%>

<html>
    <head><title>Login Form</title></head>
    <body>
        <h2>Login Form</h2>
        <form action="login" method="post">
            <table>
                <tr><td>Login Select:</td>
                    <td><select name="usertype">
                            <option name="usertype" value="unknown">Your Select
                            <option name="usertype" value="A">Administrator
                            <option name="usertype" value="C">Customer</select></td></tr>
                <tr><td>Username:</td><td>
                        <input type="text" name="username" size="24"></td></tr>
                <tr><td>Password:</td><td>
                        <input type="password" name="password" size="24"></td></tr></table>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
