



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
		<%@taglib prefix="c" uri="jakarta.tags.core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>student id</th>
			<th>student name</th>
			<th>student marks</th>
			<th>student DOB</th>
			<th>action</th>
		</tr>
		<c:forEach var="stud" items="${slist}">
			<tr>
				<td>${stud.sid}</td>
				<td>${stud.sname}</td>
				<td>${stud.marks}</td>
				<td>${stud.dob}</td>
				<td><a href="#">Edit</a> /<a href="#">delete</a></td>
			</tr>
		</c:forEach>
		<a href="addstudent">Add new product</a>
	</table>
</body>
</html>