<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Connection con = null;
	try {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "1234";
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection(url, user, password);
		out.println("데이터베이스 연결이 성공했습니다.");
	} catch (SQLException ex) {
		out.println("데이터베이스 연결이 실패했습니다.");
		out.println("SQLException : " + ex.getMessage());
	} finally {
		if (con != null)
			con.close();
	}
	%>
</body>
</html>