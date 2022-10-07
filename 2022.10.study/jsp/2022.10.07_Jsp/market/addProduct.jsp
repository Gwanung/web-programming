<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
			<div class="container">
				<h1 class="display-4">상품 등록</h1>
			</div>
		</div>
			<div class="container">
				<form action="./processAddProduct.jsp" name="newProduct" method="post" class="form-horizontal">
					<div class="form-group row">
						<label for="ProducID" class="col-sm-2">상품 코드</label>
						<div class="col-sm-3">
						<input type="text"
							name="productID" id="productID" class="form-control">						
						</div>
					</div>
					<div class="form-group row">
						<label for="name" class="col-sm-2">상품 명</label>
						<div class="col-sm-3">
						<input type="text" name="name"
							id="name" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<label for="unitPrice" class="col-sm-2">가격</label>
						<div class="col-sm-3">
						<input type="text"
							name="unitPrice" id="unitPrice" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label for="description" class="col-sm-2">상세 정보</label>
						<div class="col-sm-3">
						<textarea cols="50" rows="2" name="description" id="description" class="form=control"></textarea>
						</div>
					</div>
					<div class="form-group row">
						<label for="manufacturer" class="col-sm-2">제조사</label>
						<div class="col-sm-3">
						<input type="text"
							name="manufacturer" id="manufacturer" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<label for="category" class="col-sm-2">분류</label>
						<div class="col-sm-3">
						<input type="text" name="category"
							id="category" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<label for="unitsInStock" class="col-sm-2">재고 수</label>
						<div class="col-sm-3">
						<input type="text"
							name="unitsInStock" id="unitsInStock" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">상태</label> 
						<div class="col-sm-5">
						<input type="radio" name="condition" value="New"> 신규 제품
						<input type="radio" name="condition" value="Old"> 중고 제품
						<input type="radio" name="condition" value="Refurbished"> 재생 제품
						</div>
					</div>
					<div class="form-group row">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" value="등록" class="btn btn-primary">
					</div>
					</div>
				</form>
				<hr>
			</div>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>