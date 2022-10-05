<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Product"%>
<jsp:useBean id="productDTO" class="dto.ProductRepository"
	scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<style type="text/css">
.content .row {
	padding: 30px 0;
}

.content h3, .content p, .content h4 {
	margin: 25px 0;
}

.content h3 {
	margin-bottom: 5px;
}

.content .description {
	margin-top: 5px;
}

.content .badge {
	background-color: #f00;
	color: #fff;
	border-radius: 5px;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="main">
		<div class="banner">
			<div class="container">
				<h1>상품 정보</h1>
			</div>
		</div>
		<%
		String id = request.getParameter("id");
		Product product = productDTO.getProductById(id);
		%>
		<div class="content">
			<div class="container">
				<div class="row">
					<h3><%=product.getPname()%></h3>
					<p class="description"><%=product.getDescription()%>
					<p>
						<b>상품 코드 : </b><span class="badge"><%=product.getProductID()%></span>
					<p>
						<b>제조사</b> :
						<%=product.getManufacturer()%>
					<p>
						<b>분류</b> :
						<%=product.getCategory()%>
					<p>
						<b>재고 수</b> :
						<%=product.getUnitsInstock()%>
						
					<h4><%=product.getUnitPrice()%>
					<p>
						<a href="#" class="btn btn-secondary">상품 주문 &raquo;</a>
						<a href="./products.jsp" class="btn">상품 목록 &raquo;</a>
				</div>
				<hr>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>