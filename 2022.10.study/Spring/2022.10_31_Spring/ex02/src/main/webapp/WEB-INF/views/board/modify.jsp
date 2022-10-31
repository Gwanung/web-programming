<%-- 게시물수정 페이지 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Modify Page</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Board Modify</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<form>
					<input type="hidden" name="pageNum" value="${cri.pageNum}">
					<input type="hidden" name="amount" value="${cri.amount}">
					<div class="form-group">
						<label>Bno</label><input class="form-control" name="bno"
							value="${board.bno}" readonly="readonly">
					</div>
					<div class="form-group">
						<label>Title</label><input class="form-control" name="title"
							value='${board.title}'>
					</div>
					<div class="form-group">
						<label>Text area</label>
						<textarea rows="3" name="content" class="form-control">${board.content}</textarea>
					</div>
					<div class="form-group">
						<label>Writer</label><input class="form-control" name="writer"
							value="${board.writer}">
					</div>
					<%-- 	<div class="form-group">
						<label>RegDate</label><input class="form-control" name="regDate"
							value="${board.regdate}" pattern="yyyy/MM/dd">
					</div>
					<div class="form-group">
						<label>Update Date</label><input class="form-control"
							name="updateDate" value="${board.updateDate}"
							pattern="yyyy/MM/dd">
					</div> --%>

					<button class="btn btn-default" data-oper="modify" type="submit">Modify</button>
					<button class="btn btn-danger" data-oper="remove" type="submit">Remove</button>
					<button class="btn btn-info" data-oper="list" type="submit">List</button>
				</form>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
<script>
	$(function() {
		var formObj = $("form");
		$('button').on("click", function(e) {
			e.preventDefault();

			var operation = $(this).data("oper");
			console.log(operation);

			if (operation === 'remove') {
				formObj.attr({
					"action" : "/board/remove",
					"method" : "post"
				});
			} else if (operation === 'modify') {
				formObj.attr({
					"action" : "/board/modify",
					"method" : "post"
				});
			} else if (operation === 'list') {
				formObj.attr({
					"action" : "/board/list",
					"method" : "get"
				});
				var pageNumTag = $("input[name='pageNum']").clone();
				var amountTag = $("input[name='amount']").clone();

				formObj.empty();
				formObj.append(pageNumTag);
				formObj.append(amountTag);
			}
			formObj.submit();
		});
	});
</script>
<%@ include file="../includes/footer.jsp"%>