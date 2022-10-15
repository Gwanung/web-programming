<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">상품 목록</h1>
		</div>
	</div>
	<%@ include file="dbconn.jsp"%>
	<div class="container">
		<!-- Gridlayout 처럼 씀, 12칼럼을 4로 나누어서 사용 -->
		<div class="row" align="center">
			<%
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
			%>
			<div class="col-md-4">
				<img src="/upload/<%=rs.getString("p_fileName")%>"
					style="width: 100%">
				<!-- 태그와 자바코드 분리해서 사용 -->
				<h3><%=rs.getString("p_name")%></h3>
				<p><%=rs.getString("p_description")%>
				<p><%=rs.getString("p_unitPrice")%>

					<!-- ./product.jsp?id=P1234 -->
					<!--  그대로 넣으면 P1234만 되므로 id 값을  product.getProductId()로 넘겨준다. -->
				<p>
					<a href="./product.jsp?id=<%=rs.getString("p_id")%>"
						class="btn btn-secondary">상세정보&raquo;</a>
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