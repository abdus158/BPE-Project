<%@page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

          String service = request.getParameter("Service");
          String description = request.getParameter("description");
          int customer_ID = Integer.parseInt(request.getParameter("Customer"));
          
          
        Request_A_Services obj = new Request_A_ServicesProxy().getRequest_A_Services();
       String r = obj.rrequestAservixce(customer_ID, service, description);
       obj.rrequestAservixce(customer_ID, service, description);
           out.println(r);
      
           %>

</body>
</html>