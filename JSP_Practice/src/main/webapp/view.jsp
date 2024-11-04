<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String add = request.getParameter("add");
	String mobile = request.getParameter("mobile");
	out.print("<br/>Your Name : "+name);
	out.print("<br/>Your Address : "+add);
	out.print("<br/>Your Phone Number : "+mobile);
	%>
</body>
</html>