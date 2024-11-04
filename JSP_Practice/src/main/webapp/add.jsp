<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Your Output</h1>
<!-- JSP Scriplet Tag -->
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int num3 = num1+num2;
	out.print("Your Addition of "+num1+" and "+num2+" is : "+num3);
	%>
</body>
</html>