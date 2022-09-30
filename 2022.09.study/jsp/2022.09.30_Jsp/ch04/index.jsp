<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.main {
	width: 100%;
}

.main banner{
	width: 100%;
	height: 300px;
	background-color: #d1d1d1;
	text-align: center;
	line-height: 300px;
}

.main banner h1{
	font-size: 5vw;
	font-weight: 400;
}

.main .content{
	width: 100%;
	margin: 0 auto;
	padding: 10px;
	text-align: center;
}

.main .content h3{
	margin: 0 auto;
	padding: 20px 0;
	font-weight: 100;
}

.main ,content p{
	margin-bottom: 30px;
}
</style>
<%! String greenting = "웹 쇼핑몰에 오신 것을 환영합니다";
	String tagLine = "Welcome to Web Market";%>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="main">
		<div class="banner">
			<div class="container">
				<h1><%= greenting %></h1>
			</div>
		</div>
		
		<div class="content">
			<div class="container">
				<h3><%= tagLine %></h3>
				<p><%
					Date day = new Date();
					String am_pm;
					int hour = day.getHours();
					int minute = day.getMinutes();
					int second = day.getSeconds();
					if(hour / 12 == 0)
						am_pm = "AM";
					else{
						am_pm = "PM";
						hour = hour - 12;
					}
					String CT = hour + ":" + minute + ":" +second + " " + am_pm;
					out.println("현재 접속 시간 : " + CT + "\n");
					
				%>
				<hr>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>