<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-expand navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href='/home'>Home</a>
		</div>
		<div>
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/member/loginMember.jsp"></c:url>'>로그인</a></li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/member/addMember.jsp"></c:url>'>회원가입</a></li>
				<li style="padding-top: 7px; color: white">admin님</li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/member/logoutMember.jsp"></c:url>'>로그아웃</a></li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/member/updateMember.jsp"></c:url>'>회원수정</a></li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/member/memberList.jsp"></c:url>'>회원목록</a></li>


				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/products.jsp"></c:url>'>상품 목록</a></li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/addProduct.jsp"></c:url>'>상품 등록</a></li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/editProduct.jsp?edit=update"></c:url>'>상품
						수정</a></li>

				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/editProduct.jsp?edit=delete"></c:url>'>상품
						삭제</a></li>
				<li class="nav-item"><a class="nav-link"
					href='/board/list'>게시판</a></li>
			</ul>
		</div>
	</div>
</nav>