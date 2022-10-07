<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

a {
	color: #000;
	text-decoration: none;
}

header {
	background-color: #000;
	width: 100%;
	padding: 10px 20px;
}

header a {
	color: #fff;
	font-weight: 700;
}

.container {
	width: 90%;
	margin: 0 auto;
}

.btn {
	padding: 10px 5px;
	background-color: #696b6a;
	color: #fff;
	border-radius: 7px;
}

.btn:hover {
	background-color: #404040;
}

.btn.btn-secondary {
	background-color: #2a9abd;
}

.btn.btn-secondary:hover {
	background-color: #0f496b;
}

.main {
	width: 100%
}

.main .banner {
	width: 100%;
	height: 300px;
	background-color: #d1d1d1;
	line-height: 300px;
}

.main .banner h1 {
	font-size: 6vw;
	font-weight: 100;
}

.main content {
	width: 100%
}
</style>
</head>
<body>

	<header>
		<div class="container">
			<a href="index.jsp">Home</a>
		</div>
	</header>

</body>
</html>