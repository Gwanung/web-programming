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
				<button class="btn btn-default listBtn">List</button>
				<button class="btn btn-info modBtn">Modify</button>
				<form action="/board/list" id="actionForm" method="get">
					<input type="hidden" name="bno" value="${board.bno}"> <input
						type="hidden" name="pageNum" value="${cri.pageNum}"> <input
						type="hidden" name="amount" value="${cri.amount}">

				</form>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
<script type="text/javascript">
	var actionForm = $("#actionForm");

	$(".listBtn").click(function(e) {
		e.preventDefault();
		actionForm.find('input[name="bno"]').remove();
		actionForm.submit();
	});

	$(".modBtn").click(function(e) {
		e.preventDefault();
		actionForm.attr("action", "/board/modify");
		actionForm.submit();
	});
</script>

<%@ include file="../includes/footer.jsp"%>