<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="dbconn.jsp"%>
<c:set var="sessionId" value="${sessionScope.sessionId}"></c:set>
<sql:update var="resultSet" dataSource="${dataSource}">
	delete from member where id=?
	<sql:param value="${sessionId}" />
</sql:update>
<c:if test="${resultSet>=1}">
	<c:import url="logoutMember.jsp"></c:import>
	<c:redirect url="resultMember.jsp" />
</c:if>