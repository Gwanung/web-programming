<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Tag</title>
</head>
<body>
	<%--선언문 태그 : 전역 변수, 메소드 선언--%>
	<%!int data = 50;

	int sum(int a, int b) {
		return a + b;
	}%>
	<%-- 스크립틀릿 태그 : 자바로직 --%>
	<%
	out.println("Value of the variable is: " + data + "<br>");
	out.println("2+3= " + sum(2,3));
	%>
</body>
</html>