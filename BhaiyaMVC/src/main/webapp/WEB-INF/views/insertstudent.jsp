<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertstudent" method="post">
		Student id : <input type="text" name="sid" id="sid">
		Student name : <input type="text" name="sname" id="sname">	
		Student marks : <input type="text" name="marks" id="marks">
		Student DOB : <input type="date" name="dob" id="dob">
		
		<button type="submit" id="btn">Add student</button>
				
	</form>
</body>
</html>