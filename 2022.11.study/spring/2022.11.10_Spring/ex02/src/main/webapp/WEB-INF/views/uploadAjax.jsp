<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload with Ajax</title>
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
</head>
<body>
	<h1>Upload with Ajax</h1>
	<div class="bigPictureWrapper">
		<div class="bigPicture"></div>
	</div>
	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	<button id="uploadBtn">Upload</button>
	<div class="uploadResult">
		<ul>

		</ul>
	</div>
	<script src="/resources/vendor/jquery/jquery.min.js"></script>
	<script type="text/javascript">
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

		function showImage(fileCallPath) {
			$(".bigPictureWrapper").css("display", "flex").show();
			$(".bigPicture").html(
					"<img src='/display?fileName=" + fileCallPath + "'>")
					.animate({
						width:'100%',
						height:'100%'
					}, 1000);
		}

		$(".bigPictureWrapper").click(function() {
			$(".bigPicture").animate({
				width:'0%',
				height:'0%'
			}, 1000, function() {
				$(".bigPictureWrapper").hide();
			});
		})

		var uploadResult = $(".uploadResult ul");

		function showUploadFile(uploadResultArr) {
			var str = "";

			$(uploadResultArr)
					.each(
							function(i, obj) {
								if (!obj.image) {
									var fileCallPath = encodeURIComponent(obj.uploadPath
											+ "/"
											+ obj.uuid
											+ "_"
											+ obj.fileName);
									
									str += "<li><a href='/download?fileName="+ fileCallPath
									+ "'><img src='/resources/img/attach.png'>"+ obj.fileName 
									+ "<span data-file='"+fileCallPath +"' data-type='file'>X</span>" 
									+ "</li>";

								} else {
									/* str += "<li>" + obj.fileName + "</li>"; */
									var fileCallPath = encodeURIComponent(obj.uploadPath
											+ "/s_"
											+ obj.uuid
											+ "_"
											+ obj.fileName);
									var originalPath = obj.uploadPath + "/"
											+ obj.uuid + "_" + obj.fileName;
									/* originalPath = originPath.replace(new RegExp(
											/\\/g), "/"); */
									str += '<li><a href="javascript:showImage(\''+ originalPath +'\')"><img src="/display?fileName='+ fileCallPath + '"></a>'
									+ "<span data-file='"+fileCallPath +"' data-type='image'>X</span>" 
									+'</li>';
								}
							});

			uploadResult.append(str);
		}//showUploadFile

		uploadResult.on("click", "span", function() {
			var targetFile = $(this).data("file");
			var type = $(this).data("type");
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
				}
			}); //$.ajax
		});

		$(function() {
			var cloneObj = $(".uploadDiv").clone();
			$("#uploadBtn").on("click", function() {
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
		});
	</script>
</body>
</html>