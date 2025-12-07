<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h4>${message}</h4>

<form action="/MySpringMVCdemo/login/validateuser" method="post">
User Name : <input type="text" name="uname" id="uid"><br>
Password : <input type="text" name="pass" id="ps"><br>
<button type="submit" name="login" id="login" value="btn">Submit</button>
</form>
</body>
</html>