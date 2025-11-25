<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
int pid = Interger.parseInt(request.getParameter("pid"));
String pname = request.getParameter("pname");
int qty = Interger.parseInt(request.getParameter("qty"));
double price = Double.parseInt(request.getParameter("price"));
Product p = new Product()
--%>
<jsp:useBean id="p" class="com.demo.beans.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>

<h1>Product Data</h1>

Product Id : <jsp:getProperty property="pid" name="p"/><br>
Product Name : <jsp:getProperty property="pname" name="p"/><br>
Product quantity : <jsp:getProperty property="qty" name="p"/><br>
Product price : <jsp:getProperty property="price" name="p"/><br>
</body>
</html>