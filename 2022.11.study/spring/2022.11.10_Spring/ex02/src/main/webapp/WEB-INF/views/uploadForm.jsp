<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadFormAction" method="post" enctype="multipart/form-data">
		<input type="file" name="uploadFile" multiple>  <!-- 여러 개 파일 업로드 가능 multiple은 브라우저 제약이 있음!-->
		<button>Submit</button>
	</form>
</body>
</html>