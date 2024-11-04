<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP Expression Tag</h1>
	<%
	String name = "Rahul Kumar Shrivastav";
	String course = "Data Science";
	int fee = 45_000;
	%>
	<p>Your Student Details</p>
	<p>
	Student Name : <%out.print(name); %><br/> <!-- JSP Scriplet Tag -->
	Student course : <%=course %> <br/>  <!-- JSP Expression Tag -->
	Student Course Fee : <%=fee %>	</p>
</body>
</html>