<%@page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service Catalog</title>
</head>
<body>

<h1>Service Catalog</h1>
<%
	Services obj = new ServicesProxy().getServices();
	String result = obj.serviceCatalog();
	out.println(result);
%>

</body>
</html>
