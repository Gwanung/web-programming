<%-- 게시물조회 페이지 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Board Read Page</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Board Read Page</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<div class="form-group">
					<label>Bno</label><input class="form-control" name="bno"
						value="${board.bno}" readonly="readonly">
				</div>

				<div class="form-group">
					<label>Title</label><input class="form-control" name="title"
						value='${board.title}' readonly="readonly">
				</div>
				<div class="form-group">
					<label>Text area</label>
					<textarea rows="3" name="content" readonly="readonly"
						class="form-control">${board.content}</textarea>
				</div>
				<div class="form-group">
					<label>Writer</label><input class="form-control" name="writer"
						value="${board.writer}" readonly="readonly">
				</div>
				<button class="btn btn-default listBtn" onclick="location.href='/board/list'">List</button>
				<button class="btn btn-info modBtn" onclick="location.href='/board/modify?bno=${board.bno}'">Modify</button>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>

<%@ include file="../includes/footer.jsp"%>