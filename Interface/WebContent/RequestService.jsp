<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Request Service</h1>
<form action="RequestServiceResponse.jsp">
	<label>Customer</label>
	<select name="Customer">
			<option value="3">Marium</option>
			<option value="2">AbdusSalam</option>
			<option value="1">Maria</option>
	</select>
	<br>
	<br>
	<label>Service you need</label>
	<select name="Service">
			<option value="Digital Marketing">Digital Marketing</option>
			<option value="Website development">Website development</option>
			<option value="Graohic Designing">Graohic Designing</option>
	</select>
	<br>
	<br>
	<label>Description/Extra Demands</label>
	<input name="description" type="Text"></input>
	<br>
	<br>
	
	<button type="submit">Request</button>
	
	


</form>

</body>
</html>