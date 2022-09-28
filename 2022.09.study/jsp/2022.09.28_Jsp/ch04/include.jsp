<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- flush는 true일 경우 출력 버 내용을 웹 페이지에 출력하면서 버퍼를 비움!--%>
<h2>include 액션 태그</h2>
<jsp:include page="include_date.jsp" flush="true"></jsp:include>
<p>===========</p>
</body>
</html>