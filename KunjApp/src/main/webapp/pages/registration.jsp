<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register.hasi">
		${msg}
		<br> UserName:<input type="text" name="name" placeholder=""></br>
		<br> Gender:<input type="text" name="gender" placeholder="gender"></br> 
		<br> Password:<input type="password" name="password" placeholder="Enter password">
		<br> ConfirmPassword:<input type="password" name="conformPassword" placeholder="Re-Enter password">
		<br><input type="submit" name="register">
	</form>
</body>
</html>