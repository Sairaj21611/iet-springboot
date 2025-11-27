<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List , com.demo.beans.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	List<Product> plst = (List<Product>) request.getAttribute("plist");
	%>

	<%
	for (Product p : plst) {
	%>
	<form action="addtocart">
		<div>
			Product id : <%=p.getPid()%><br>
			 product Name : <%=p.getPname()%><br /> 
			  product Price : <%=p.getPrice()%><br />
			  
			  <input type="hidden" name= "pid" id="pid" value="<%=p.getPid()%>">
			   <input type="hidden" name= "pname" id="pname" value="<%=p.getPname()%>">
			    <input type="hidden" name= "price" id="price" value="<%=p.getPrice()%>">
			    
			    Quantity : <input type="text" name="qty" id="qty" ><br />
			    
			    <button type="submit" name= "btn" id="btn">submit</button><br />
		</div>
	</form>
	<%
	}
	%>

</body>
</html>