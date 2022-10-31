<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript">
function checkForm() {
	if(${sessionId==null})
		alert("로그인 해주세요!");
	else
		location.href="";
}
</script>
</head>
<body>
	<jsp:include page="../menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">게시판</h1>
		</div>
	</div>


	<div class="container">
		<form action="<c:url value='./BoardListAction.do'></c:url>"
			method="post">
			<div>
				<div class="text-right">
					<span class="badge badge-success">전체0건
					</span>
				</div>
			</div>
			<div style="padding-top: 50px">
				<table class="table table-hover">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회</th>
						<th>글쓴이</th>
					</tr>
				</table>
			</div>
			<div align="left">
				<table>
					<tr>
						<td width="100%" align="left"><select name="items"
							class="txt">
								<option value="subject">제목에서
								<option value="content">본문에서
								<option value="name">글쓴이에서
						</select><input type="text" name="text"> <input type="submit"
							value="검색" class="btn btn-primary" id="btnAdd"></td>
						<td width="100%" align="right"><a href="#"
							onclick="checkForm(); return false;" class="btn btn-primary">&laquo;글쓰기</a>
						</td>
					</tr>
				</table>
			</div>
		</form>

	</div>


	<jsp:include page="../footer.jsp" />
</body>
</html>