<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookList Test</title>
<style type="text/css">
img {
	width: 200px;
	height: 200px;
}

ul {
	list-style: none;
	display: inline-block;
}
ul li{
	padding: 10px;
}
</style>
<script type="text/javascript" src="/resources/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".imgClick").on("click", function() {
			console.log("click img");
		});
	});
</script>
</head>
<body>
	<div>
		<c:forEach items="${bookList}" var="book">
			<ul>
				<li class="imgClick"><img src="${book.image}"></li>
			</ul>
		</c:forEach>
	</div>	
</body>
</html>
