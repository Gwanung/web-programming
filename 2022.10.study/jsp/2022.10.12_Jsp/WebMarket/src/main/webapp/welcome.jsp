<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Locale"%>
<html>
<head>
<title>Welcome</title>
<link rel="stylesheet"
	href="./resources/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<%!String greeting = "웹 쇼핑몰에 오신 것을 환영합니다!";
	String tagline = "Welcome to Web Market";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3"><%=greeting%></h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3><%=tagline%></h3>
			<%
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", Locale.ENGLISH); /* Locale.ENGLISH: am,pm으로 표시 */
			String CT = sdf.format(today);
			/* println 이지만 줄바꿈 안됨 */
			out.println("현재 접속 시작: " + CT + "\n");
			%>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>