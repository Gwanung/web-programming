<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link rel="stylesheet"
	href="./resources/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">상품 목록</h1>
		</div>
	</div>
	<%
	ProductRepository dao = ProductRepository.getInstance();
	ArrayList<Product> listOfProduct = dao.getAllProducts();
	%>
	<div class="container">
		<!-- Gridlayout 처럼 씀, 12칼럼을 4로 나누어서 사용 -->
		<div class="row" align="center">
			<%
			for (int i = 0; i < listOfProduct.size(); i++) {
				Product product = listOfProduct.get(i);
			%>
			<div class="col-md-4">
				<img src="/upload/<%= product.getFilename() %>" style="width:100%">
				<!-- 태그와 자바코드 분리해서 사용 -->
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>
				
				<!-- ./product.jsp?id=P1234 --><!--  그대로 넣으면 P1234만 되므로 id 값을  product.getProductId()로 넘겨준다. --> 
				<p>
					<a href="./product.jsp?id=<%=product.getProductId()%>" 
						class="btn btn-secondary">상세정보&raquo;</a>
			</div>
			<%
			}
			%>
		</div>
	</div>

	<hr>
	<jsp:include page="footer.jsp" />
</body>
</html>