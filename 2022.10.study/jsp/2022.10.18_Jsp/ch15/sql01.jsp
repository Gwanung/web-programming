<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="dbconn.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:query var="resultSet" dataSource="${dataSource}">
	select * from member 
</sql:query>
	<table border="1">
		<tr>
			<c:forEach var="columnName" items="${resultSet.columnNames}">
				<th width="100"><c:out value="${columnName}"></c:out></th>
			</c:forEach>
		</tr>
		<c:forEach var="row" items="${resultSet.rowsByIndex}">
			<tr>
				<c:forEach var="column" items="${row}">
					<td><c:if test="${column!=null}">
					${column}</c:if> <c:if test="${column==null}"></c:if> &nbsp;</td>
				</c:forEach>
			</tr>
		</c:forEach>

	</table>
</body>
</html>