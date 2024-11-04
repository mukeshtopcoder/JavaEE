<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP Practice</h1>
	<p>Table of 2</p>
	<%
	for(int a=1;a<=10;a++){
		for(int b=1;b<=10;b++)
			out.print(a*b+"&nbsp;&nbsp;&nbsp;&nbsp;");
		out.print("<br/>");
	}
	%>
	<!--  JSP scriptlet Tag  <% %>  -->
	
</body>
</html>