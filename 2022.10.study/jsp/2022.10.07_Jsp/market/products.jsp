<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.ProductRepository"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품 목록</title>
<style type="text/css">
.main {
	width: 100%;
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

.main .content {
	width: 100%;
}

.main .content .row {
	display: flex;
	justify-content: space-around;
	align-items: center;
}

.main .content .row .column {
	width: 300px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	margin: 15px 0;
}

.main .content .row .column h3, .main .content .row .column p {
	text-align: center;
	padding: 10px;
}

.main .content .row .column h3 {
	font-size: 1.7rem;
	font-weight: 400;
}
</style>
<%!String greenting = "상품목록";%>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div class="main">

		<div class="banner">
			<div class="container">
				<h1><%=greenting%></h1>
			</div>
		</div>

		<div class="content">
			<div class="container">
				<div class="row">
					<%
					ProductRepository dao = ProductRepository.getInstance();
					ArrayList<Product> listOfProduct = dao.getAllProducts();

					for (int i = 0; i < listOfProduct.size(); i++) {
						Product product = listOfProduct.get(i);
					%>
					<div class="column">
						<h3><%=product.getPname()%></h3>
						<p><%=product.getDescription()%></p>
						<p><%=product.getUnitPrice()%>원
						</p>
						<p>
							<a href="./product.jsp?id=<%=product.getProductID()%>"
								class="btn" role="button">상세 정보&raquo;</a>
					</div>
					<%
					}
					%>
				</div>
				<hr>
			</div>
		</div>


	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>