<%-- 게시물조회 페이지 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<style type="text/css">
.uploadResult {
	width: 100%;
	background-color: gray;
}

.uploadResult ul {
	display: flex;
	flex-flow: row;
	justify-content: center;
	align-items: center;
}

.uploadResult ul li {
	list-style: none;
	padding: 10px;
}

.uploadResult ul li img {
	width: 100px;
}

.bigPictureWrapper {
	position: absolute;
	display: none;
	justify-content: center;
	align-items: center;
	top: 0%;
	width: 100%;
	height: 100%;
	background-color: gray;
	z-index: 100;
}

.bigPicture {
	position: relative;
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>

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
						type="hidden" name="amount" value="${cri.amount}"> <input
						type="hidden" name="keyword" value="${cri.keyword}"> <input
						type="hidden" name="type" value="${cri.type}">

				</form>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
<div class="bigPictureWrapper">
	<div class="bigPicture"></div>
</div>

<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Files</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<div class="uploadResult">
					<ul>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<i class="fa fa-comments fa-fw"></i> Reply
				<button id="addReplyBtn" class="btn btn-primary btn-xs pull-right">New
					Reply</button>
			</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<ul class="chat">
				</ul>
			</div>
			<!-- /.panel-body -->
			<div class="panel-footer"></div>
			<!-- /.panel-footer -->
		</div>
	</div>
</div>

<div class="modal fade in" id="myModal" tabindex="-1" role="dialog">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 class="modal-title" id="myModalLabel">REPLY MODAL</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label>Reply</label><input class="form-control" name="reply"
						value="New Reply!!">
				</div>
				<div class="form-group">
					<label>Replyer</label><input class="form-control" name="replyer"
						value="replyer">
				</div>
				<div class="form-group">
					<label>Reply Date</label><input class="form-control"
						name="replyDate" value="2022-11-04">
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="modalModBtn" class="btn btn-warning">Modify</button>
				<button type="button" id="modalRemoveBtn" class="btn btn-danger">Remove</button>
				<button type="button" id="modalRegisterBtn" class="btn btn-primary">Register</button>
				<button type="button" id="modalCloseBtn" class="btn btn-default">Close</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>





<script src="/resources/js/reply.js"></script>
<script>
	$(function() {
		console.log(replyService);
		/* console.log("JS TEST"); */

		//bno 값을 읽어옴
		var bnoValue = '${board.bno}';

		//ul class 가져옴
		var replyUL = $(".chat");
		showList(1);

		function showList(page) {
			replyService
					.getList(
							{
								bno : bnoValue,
								page : page
							},
							function(replyCnt, list) {
								/* console.log(list); */
								
								if(page == -1){
									pageNum = Math.ceil(replyCnt/ 10.0);
									showList(pageNum);
									return;
								} 
								var str = "";
								if (list == null || list.length == 0) {
									replyUL.html("");
									return;
								}

								for (var i = 0, len = list.length || 0; i < len; i++) {
									/* console.log(list[i]); */
									str += '<li class="left clearfix" data-rno="' + list[i].rno + '">';
									str += '<div>';
									str += '<div class="header">';
									str += '<strong class="primary-font">'
											+ list[i].replyer + '</strong>';
									str += '<small class="pull-right text-muted">'
											+ replyService
													.displayTime(list[i].replyDate)
											+ '</small>';
									str += '</div>';
									str += '<p>' + list[i].reply + '</p>';
									str += '</div>';
									str += '</li>';

								}//end for

								replyUL.html(str); //댓글의 개수만큼 추가
								showReplyPage(replyCnt);

							});//end function

		}//end showList
		
		var pageNum = 1;
		var replyPageFooter = $(".panel-footer");
		
		function showReplyPage(replyCnt) {
			var endNum = Math.ceil(pageNum / 10.0) * 10; // 끝 번호
			var startNum = endNum - 9;// 시작 번호
			
			var prev = startNum != 1;// 이전 버튼
			var next = false;// 다음 버튼
			
			if(endNum * 10 >= replyCnt) 
				endNum = Math.ceil(replyCnt / 10.0);
			
			if(endNum * 10 < replyCnt)
				next = true;
			
			var str = '<ul class="pagination pull-right">';
			
			if(prev)
				str += '<li class="paginate_button previous"><a href="'+ (startNum - 1) +'">Previous</a></li>';
			
			for(var i = startNum; i <= endNum; i++){
				var active = (pageNum==i)? 'active' : '';
				str += '<li class="paginate_button ' + active + '"><a href="' + i +'">'+ i +'</a></li>';
			}
			
			if(next)
				str += '<li class="paginate_button next"><a href="'+ (endNum + 1) +'">Next</a></li>';
			str +='</ul>';
			replyPageFooter.html(str);
			
		}//end showReplyPage()
		
		replyPageFooter.on("click", "li a",function (e) {
				e.preventDefault();
				/* console.log("page click"); */
				
				var targetPageNum = $(this).attr("href");
				/* console.log("targetPageNum : " + targetPageNum); */
				
				pageNum = targetPageNum;
				showList(pageNum);
		});
		

		var modal = $(".modal");
		/* modal.modal("show"); */

		var modalInputReply = modal.find("input[name='reply']");
		var modalInputReplyer = modal.find("input[name='replyer']");
		var modalInputReplyDate = modal.find("input[name='replyDate']");
		var modalModBtn = $("#modalModBtn");
		var modalRemoveBtn = $("#modalRemoveBtn");
		var modalRegisterBtn = $("#modalRegisterBtn");

		$("#modalCloseBtn").click(function() { //close 버튼 누를 시 모달창 숨김(닫기)
			modal.modal("hide");
		});

		$("#addReplyBtn").click(function() {
			modal.find("input").val(""); // New Reply 버튼 클릭 시 안에 들어있는 값(input으로 시작되는) 초기화 해주기 val("")= 값 초기화
			modalInputReplyDate.closest("div").hide(); // 날짜 생략(숨김)
			modal.find('button[id!= "modalCloseBtn"]').hide();
			modalRegisterBtn.show();
			modal.modal("show");
		});

		modalRegisterBtn.on("click", function() {
			var reply = {
				reply : modalInputReply.val(),
				replyer : modalInputReplyer.val(),
				bno : bnoValue
			};

			replyService.add(reply, function(result) {
				alert(result);
				modal.find("input").val(""); //모달 추가하고나면 input창 다시 공백으로 만들고, 숨기고 화면 보여주기!
				modal.modal("hide");
				showList(-1);
			});

		});

		//댓글 조회 클릭 이벤트 처리
		replyUL.on("click", "li", function() {
			var rno = $(this).data("rno");
			/* console.log(rno); */
			replyService.get(rno, function(data) {
				/* console.log(data); */
				modalInputReply.val(data.reply);
				modalInputReplyer.val(data.replyer).attr("readonly", "readonly");
				modalInputReplyDate.val(
						replyService.displayTime(data.replyDate)).attr(
						"readonly", "readonly");
				modalRegisterBtn.hide();
				modal.data("rno", data.rno);
				modal.modal("show");
			});
		});
		//댓글 수정
		modalModBtn.on("click", function() {
			var reply = {
				rno : modal.data("rno"),
				reply : modalInputReply.val(),
				bno : bnoValue
			};
			replyService.update(reply, function(result) {
				alert(result);
				modal.modal("hide");
				showList(pageNum);
			});
		});
		//댓글 삭제
		modalRemoveBtn.on("click", function () {
			
			var rno = modal.data("rno");
			
			replyService.remove(rno, function(result){
				/* console.log(result); */
				alert(result);
				modal.modal("hide");
				showList(pageNum);
			});
		});
		
		
		
		/* 
		 //조회 테스트
		 replyService.get(26, function(data) {
		 console.log(data);
		 }); */

		/* 	//수정 테스트
			replyService.update({
				 rno : 26,
				 reply:"Modified Reply....",
				 bno:bnoValue
				 }, function(result) {
				 alert("수정 완료..");
				 }); */

		//삭제 테스트
		/* 	replyService.remove(21, function(result){
				console.log(result);
				if(result == "success")
					alert("REMOVED");
				
			}); */

		//등록 테스트
		/* 		replyService.add({
		 reply:"JS Test",
		 replyer:"tester",
		 bno:bnoValue
		 }, function(result) {
		 alert("result : " + result);
		 }); */
		//목록 테스트	
		/* 	replyService.getList({bno:bnoValue, page:1}, function (list) {
				for(var i = 0, len = list.length || 0; i < len; i++)
					console.log(list[i]);
			}); */
	});
</script>
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
	
	var bno = '${board.bno}';
	//bno : bno 에서 첫번째는 컨트롤러 파라미터 값 , 두번째는 위의 변수 bno
	$.getJSON("/board/getAttachList", {bno : bno}, function (arr) {
		console.log(arr);
		var str = "";
		$(arr).each(function (i, obj) {
			if (!obj.fileType) {
				var fileCallPath = encodeURIComponent(obj.uploadPath
						+ "/" + obj.uuid + "_" + obj.fileName);

				str += '<li data-path="' + obj.uploadPath + '" data-uuid="' + obj.uuid + '" data-filename="' + obj.fileName +'" data-type="' + obj.fileType + '">';
				str += '<span>' + obj.fileName + '</span><br>';
				str += '<img src="/resuorces/img/attach.png">'
						+ '</li>';

			} else {
				/* str += "<li>" + obj.fileName + "</li>"; */
				var fileCallPath = encodeURIComponent(obj.uploadPath
						+ "/s_" + obj.uuid + "_" + obj.fileName);
				var originalPath = obj.uploadPath + "/"
						+ obj.uuid + "_" + obj.fileName;
				/* originalPath = originPath.replace(new RegExp(
						/\\/g), "/"); */
				str += '<li data-path="' + obj.uploadPath + '" data-uuid="' + obj.uuid + '" data-filename="' + obj.fileName +'" data-type="' + obj.fileType + '">';
				str += '<span>' + obj.fileName + '</span><br>';
				str += '<img src="/display?fileName='
						+ fileCallPath + '">' + '</li>';
			}
		});
		$(".uploadResult ul").html(str);
	});
</script>

<%@ include file="../includes/footer.jsp"%>