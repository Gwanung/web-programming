<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="dbconn.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:requestEncoding value="utf-8" />
	<sql:update var="resultSet" dataSource="${dataSource}">
	insert into member values(?, ?, ?)
	<sql:param value="${param.id}">
		</sql:param>
		<sql:param value="${param.passwd}">
		</sql:param>
		<sql:param value="${param.name}">
		</sql:param>
	</sql:update>
<c:import url="sql01.jsp"></c:import>
</body>
</html>