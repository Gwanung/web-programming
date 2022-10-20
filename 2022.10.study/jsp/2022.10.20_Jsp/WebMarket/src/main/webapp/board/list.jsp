<%@page import="mvc.model.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%
String sessionId = (String) session.getAttribute("sessionId");
List boardList = (List) request.getAttribute("boardlist");
int total_record = ((Integer) request.getAttribute("total_record")).intValue();
int pageNum = ((Integer) request.getAttribute("pageNum")).intValue();
int total_page = ((Integer) request.getAttribute("total_page")).intValue();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="../menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">게시판</h1>
		</div>
	</div>


	<div class="container">
		<form action="" method="post">
			<div>
				<div class="text-right">
					<span class="badge badge-success">전체<%=total_record%>건
					</span>
				</div>
			</div>
			<div style="padding-top: 5-px">
				<table class="table table-hover">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회</th>
						<th>글쓴이</th>
					</tr>
					<%
					for (int i = 0; i < boardList.size(); i++) {
						BoardDTO notice = (BoardDTO) boardList.get(i);
					%>
					<tr>
						<td><%=notice.getNum()%></td>
						<td><%=notice.getSubject()%></td>
						<td><%=notice.getRegist_day()%></td>
						<td><%=notice.getHit()%></td>
						<td><%=notice.getName()%></td>
					</tr>
					<%
					}
					%>
				</table>
			</div>
		</form>

	</div>


	<jsp:include page="/footer.jsp" />
</body>
</html>