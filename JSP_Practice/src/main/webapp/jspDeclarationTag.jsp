<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  JSP : Java Server Pages -->
<h1>JSP Declaration Tag</h1>
	<% String name = "Rahul Sharma"; %> <!-- Scriplet Tag -->
	<!-- Declaration Tag -->
	<%! 			
		String add = "Noida Sec 16";
		int square(int num ){
			return num*num;
		}
	%>  
	<p>
	Name : <%=name %><br/>
	Address : <%=add %> <br/>
	Square of 5 : <%=square(5) %>
	</p>
</body>
</html>