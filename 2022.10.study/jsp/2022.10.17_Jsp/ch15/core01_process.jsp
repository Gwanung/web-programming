<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%String number = request.getParameter("number") %> 와 같음 --%>
	<c:set var="number" value="${param.number}"></c:set>
	<c:choose>
		<c:when test="${number % 2 ==0 }">
			<c:out value="${number}"></c:out>은 짝수입니다. <%--jstl표현식 --%>
		</c:when>
			<c:when test="${number % 2 ==1 }">
			${number}은 홀수입니다.  <%--el표현식 --%>
		</c:when>
	</c:choose>
</body>
</html>