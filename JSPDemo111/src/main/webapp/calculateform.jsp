<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file = "MyHeader.html" %>
	<form action = "getresult.jsp">
		enter number first : <input type="text" name="num1" id="num1"><br>
		enter number second : <input type="text" name="num2" id="num2"><br>
		<button input="submit" name="btn" id="btn" value="add">addition</button>
		<button input="submit" name="btn" id="btn" value="fact">factorial</button>
	</form>
	<%@ include file = "MyFooter.html" %>
</body>
</html>