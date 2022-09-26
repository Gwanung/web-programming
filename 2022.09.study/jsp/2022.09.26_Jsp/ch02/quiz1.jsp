<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String data = "Java Server Pages";

	String getString(String d) {
		return d;
	}%>
	<%
		out.println("Today: " + getString(data));
	%>
</body>
</html>