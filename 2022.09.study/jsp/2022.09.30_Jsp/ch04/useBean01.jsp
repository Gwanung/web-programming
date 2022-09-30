<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--java.util.Date date = new java.util.Date(); 와 같 -->
	<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
	<p>
		<%out.println("오늘의 날짜와 시각"); %>
	</p>
	<%=date %>
</body>
</html>