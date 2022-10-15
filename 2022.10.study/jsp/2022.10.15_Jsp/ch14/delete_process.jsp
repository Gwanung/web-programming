<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
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
	<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	int _id = Integer.parseInt(id);
	String passwd = request.getParameter("passwd");

	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		String sql = "select * from member where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, _id);
		rs = pstmt.executeQuery();
		if (rs.next()) { //테이블에 id가 존재하면
			int rId = rs.getInt("id");
			String rPw = rs.getString("passwd");
			pstmt.close();
			if (_id == rId && passwd.equals(rPw)) {
		sql = "delete member where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, _id);
		pstmt.executeUpdate();
		out.println("member 테이블을 삭제했습니다.");
			} else {
		out.println("일치하는 비밀번호가 아닙니다.<br>");
			}

		} else {
			out.println("member 테이블에 일치하는 아이디가 없습니다.<br>");
		}
	} catch (SQLException ex) {
		out.println("SQLException : " + ex.getMessage());
	} finally {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}
	%>
</body>
</html>