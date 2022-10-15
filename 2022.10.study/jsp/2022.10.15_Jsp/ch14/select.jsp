<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="dbconn.jsp"%>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
		<%
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String pw = rs.getString("passwd");
				String name = rs.getString("name");
		%>
		<tr>
			<td><%=id%></td>
			<td><%=pw%></td>
			<td><%=name%></td>
		</tr>
		<%
		}
		} catch (SQLException ex) {
		out.println("member 테이블 호출이 실패했습니다.");
		out.println("SQLException : " + ex.getMessage());
		} finally {
		if (rs != null)
		rs.close();
		if (pstmt != null)
		pstmt.close();
		if(con != null)
			con.close();
		}
		%>
	</table>
</body>
</html>