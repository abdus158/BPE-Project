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

          String service = request.getParameter("Services");
          String feedback = request.getParameter("feedback");
          int customer_ID = Integer.parseInt(request.getParameter("Customer"));
          
          Feedback obj = new FeedbackProxy().getFeedback();
         String result =  obj.giveFeedback(customer_ID, service, feedback);
         
           out.println(result);
      
           %>

</body>
</html>