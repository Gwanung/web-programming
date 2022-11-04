<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<%-- <div class="form-group">
<label>Bno</label><input class="form-control" name="bno" value='<c:out value="${board.bno}"/>' readonly="readonly">
</div>
<div class="form-group">
<label>Title</label><input class="form-control" name="title" value='<c:out value="${board.title}"/>' readonly="readonly">
</div>
<div class="form-group">
<label>Writer</label><input class="form-control" name="writer" value='<c:out value="${board.writer}"/>' readonly="readonly">
</div>
<div class="form-group">
<label>Text area</label><textarea rows="3" name="content" readonly="readonly"><c:out value="${board.content}"></c:out></textarea>
</div> --%>


</body>
</html>
