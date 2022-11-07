<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload with Ajax</title>
<script src="/resources/vendor/jquery/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
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
			
			$(uploadResultArr).each(function (i, obj) {
				
				str += "<li>" + obj.fileName + "</li>";
			});
			
			uploadResult.append(str);
		}
		

		$("#uploadBtn").on("click", function() {
			var cloneObj = $(".uploadDiv").clone();
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
					
					$(".uploadDiv").html(cloneObj.html());  //input file 부분은 등록할 때마다 초기화
				}
			}); // $.ajax

		});
	});
</script>
</head>
<body>
	<h1>Upload with Ajax</h1>
	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	<button id="uploadBtn">Upload</button>
	<div class="uploadResult">
		<ul>
			
		</ul>
	</div>

</body>
</html>