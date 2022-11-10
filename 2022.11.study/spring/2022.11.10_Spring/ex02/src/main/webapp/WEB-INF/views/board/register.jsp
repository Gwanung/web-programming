<%-- 게시물 등록 페이지 --%>
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
		<h1 class="page-header">Board Register</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Board Register</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<form action="/board/register" role="form" method="post">
					<div class="form-group">
						<label>Title</label><input class="form-control" name="title">
					</div>
					<div class="form-group">
						<label>Content</label>
						<textarea class="form-control" rows="3" name="content"></textarea>
					</div>
					<div class="form-group">
						<label>Writer</label><input class="form-control" name="writer">
					</div>
					<button type="submit" class="btn btn-default">Submit
						Button</button>
					<button type="reset" class="btn btn-default">Reset Button</button>
				</form>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>

<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">File Attach</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<div class="form-group uploadDiv">
					<input type="file" name="uploadFile" multiple>
				</div>
				<div class="uploadResult">
					<ul>
					</ul>
				</div>

			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	var formObj = $("form[role='form']");
	$("button[type='submit']").on("click", function(e) {
		//e.preventdefault 함수는 브라우저의 동작을 중단시키는 역할을 하며 
		//때로는 submit이 동작했을때 페이지를 새로고침 안시키기 위해서 e.preventdefault 함수를 사용한다.
		e.preventDefault();
		console.log("submit clicked");
		var str = "";
		$(".uploadResult ul li").each(function(i, obj) {
			var jobj = $(obj);
			console.dir(jobj);
			console.log("-----------------");
			console.log(jobj.data('filename'));
			str += "<input type='hidden' name='attachList[" + i + "].fileName' value='" + jobj.data('filename') + "'>";
			str += "<input type='hidden' name='attachList[" + i + "].uuid' value='" + jobj.data('uuid') + "'>";
			str += "<input type='hidden' name='attachList[" + i + "].uploadPath' value='" + jobj.data('path') + "'>";
			str += "<input type='hidden' name='attachList[" + i + "].fileType' value='" + jobj.data('type') + "'>";
		});
		console.log(str);
		formObj.append(str).submit();
	});

	var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
	var maxSize = 5242880; //5MB

	function checkExtension(fileName, fileSize) {

		if (fileSize >= maxSize) { //지정해둔 파일 사이즈(5MB) 보다 업로드 하는 사이즈가 크면
			alert("파일 사이즈 초과");
			return false;
		}

		if (regex.test(fileName)) { //file이름에 exe, sh, zip, alz 형태가 들어가있다면
			alert("해당 종류의 파일은 업로드할 수 없습니다.");
			return false;
		}
		return true;
	}//end checkExtension()

	var uploadResult = $(".uploadResult ul");
	function showUploadFile(uploadResultArr) {
		var str = "";
		$(uploadResultArr)
				.each(
						function(i, obj) {
							if (!obj.image) {
								var fileCallPath = encodeURIComponent(obj.uploadPath
										+ "/" + obj.uuid + "_" + obj.fileName);

								str += '<li data-path="' + obj.uploadPath + '" data-uuid="' + obj.uuid + '" data-filename="' + obj.fileName +'" data-type="' + obj.image + '">';
								str += '<span>' + obj.fileName + '</span>';
								str += '<button type= "button" data-file="' + fileCallPath +'" data-type="file" class="btn btn-warning btn-circle"><i class="fa fa-times"></i></button><br>';
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
								str += '<li data-path="' + obj.uploadPath + '" data-uuid="' + obj.uuid + '" data-filename="' + obj.fileName +'" data-type="' + obj.image + '">';
								str += '<span>' + obj.fileName + '</span>';
								str += '<button type= "button" data-file="' +fileCallPath + '" data-type="image" class="btn btn-warning btn-circle"><i class="fa fa-times"></i></button><br>';
								str += '<img src="/display?fileName='
										+ fileCallPath + '">' + '</li>';
							}
						});

		uploadResult.append(str);
	}//showUploadFile

	uploadResult.on("click", "button", function() {
		var targetFile = $(this).data("file");
		var type = $(this).data("type");
		var targetLi = $(this).closest("li");
		console.log(targetFile);
		$.ajax({
			url : '/deleteFile',
			data : {
				fileName : targetFile,
				type : type
			},
			dataType : 'text',
			type : 'POST',
			success : function(result) {
				alert(result);
				targetLi.remove();
			}
		}); //$.ajax
	});

	var cloneObj = $(".uploadDiv").clone();
	$("input[type='file']").change(function(e) {

		var formData = new FormData();
		var inputFile = $("input[name='uploadFile']");
		var files = inputFile[0].files;
		console.log(files);

		//add File Data to formData
		for (var i = 0; i < files.length; i++) {
			if (!checkExtension(files[i].name, files[i].size))
				return false;

			formData.append("uploadFile", files[i]);
		}

		$.ajax({
			url : '/uploadAjaxAction',
			processData : false,
			contentType : false,
			data : formData,
			type : 'POST',
			dataType : 'json',
			success : function(result) {
				/* alert("uploaded"); */
				console.log(result);
				showUploadFile(result);

				$(".uploadDiv").html(cloneObj.html()); //input file 부분은 등록할 때마다 초기화
			}
		}); // $.ajax
	});
</script>

<%@ include file="../includes/footer.jsp"%>