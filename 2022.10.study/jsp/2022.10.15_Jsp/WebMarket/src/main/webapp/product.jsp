<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="exceptionNoProductId.jsp"%>
<%@ include file="dbconn.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<script type="text/javascript">
	function addToCart() {
		if (confirm("상품을 장바구니에 추가하시겠습니까?"))
			document.addForm.submit();
		else
			document.addForm.reset();
	}
</script>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">상품 정보</h1>
		</div>
	</div>
	<%
	/* String id = request.getParameter("id"); */
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "select * from product";
	pstmt = con.prepareStatement(sql);
	rs = pstmt.executeQuery();
	while (rs.next()) {	
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="/upload/<%=rs.getString("p_fileName")%>"
					style="width: 100%">
			</div>
			<div class="col-md-6">
				<!-- 한줄에 12칸 그리드 -->
				<h3><%=rs.getString("p_name")%></h3>
				<!-- 상품이름 -->
				<p><%=rs.getString("p_description")%>
				<p>
					<b>상품 코드 : </b><span class="badge badge-danger"><%=rs.getString("p_id")%></span>
				<p>
					<b>제조사</b> :
					<%=rs.getString("p_manufacturer")%>
				<p>
					<b>분류</b> :
					<%=rs.getString("p_category")%>
				<p>
					<b>재고 수</b> :
					<%=rs.getInt("p_unitsInStock")%>
				<h4><%=rs.getInt("p_unitPrice")%>원
				</h4>
				<p>

					<form name="addForm"
					action="./addCart.jsp?id=<%=rs.getString("p_id")%>" method="post"><a href="#" class="btn btn-info" onclick="addToCart()">상품주문&raquo;</a>
					<a href="./cart.jsp" class="btn btn-warning">장바구니&raquo;</a> <a
						href="./products.jsp" class="btn btn-secondary">상품 목록&raquo;</a>


				</form>
			</div>
			<%
			
			}
			if (rs != null)
			rs.close();
			if (con != null)
			con.close();
			if (pstmt != null)
			pstmt.close();
			%>
		</div>
	</div>

	<hr>
	<jsp:include page="footer.jsp" />
</body>
</html>