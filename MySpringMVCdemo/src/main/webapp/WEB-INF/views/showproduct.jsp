<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>${message}</h4>

	<table border="2">
		<tr>
			<th>product id
			</th>
			<th>product name
			</th>
			<th>product quantity
			</th>
			<th>product price
			</th>
			<th>product Date
			</th>
			<th>product customer id
			</th>
		</tr>
		
			<c:forEach var="prod" items="${plist}">
	
		<tr>
		<td>${prod.pid }</td>
		<td>${prod.pname }</td>
		<td>${prod.qty }</td>
		<td>${prod.price }</td>
		<td>${prod.mfgdate }</td>
		<td>${prod.cid }</td>
	
		</tr>
	
		</c:forEach>
	
	</table>
</body>
</html>