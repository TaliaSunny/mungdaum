<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 추가 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- 금액에 천단위마다 콤마를 찍어줌. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 반응형 웹을 적용하기 위한 1줄 추가 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공통 부분</title>
<!-- bxslider 실행에 필요한 jquery, bxslider css, js -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<!-- 제일 가까운 위치에서 가져오겠다. : cnd -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

<!-- ====================================== -->
<!-- Bootstrap 실행에 필요한 css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css" />

</head>
<body>
	<header>

		<div class="menu">
			<div id="navbar">
				<div class="navbar_menu">
					<ul class="navbar_menu_ul">
						<li><a href="#"><img src="images/ham.png" class="ham">전체상품</a>
						</li>
						<li><a href="#">농산물</a></li>
						<li><a href="#">농산물</a></li>
						<li><a href="#">농산물</a></li>
						<li><a href="#">농산물</a></li>
					</ul>
					<div class="search">
						<input type="text" name="keyword" class="search_text"
							placeholder="신선한 바른먹거리" /> <input class="btn_search"
							type="image" src="images/search.png" />
					</div>
				</div>
			</div>
		</div>
	</header>

	<footer>
		<div>
			<h5>made by me</h5>
		</div>
	</footer>
</body>
</html>