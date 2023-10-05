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
<title>멍 다움</title>

<!-- 제일 가까운 위치에서 가져오겠다. : cnd -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

<!-- ====================================== -->
<!-- Bootstrap 실행에 필요한 css -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css" />


</head>
<body>
<!-- 홈페이지 상단 부분의 헤더 부분 템플릿 -->
 <jsp:include page="common-header.jsp" />
 <!-- 상단 부분의 메뉴바 부분 -->
 <jsp:include page="common-menu.jsp" />
 <!-- 움직이는 이미지 bxSlider -->
 <jsp:include page="pageimage.jsp"/>

	<!-- ================================================================== -->
	<br/><br/>
	<h3 style="text-align:center">요즘 인기 있는 농수산물</h3>
	<!--Bootstrap Layout에 Grid 적용  -->
	<!-- 한행에 4개 -->
	<div class="row">
		<div class="col-lg-3 col-md-6">
			<!--  Bootstrap components에 Card 적용 -->
			<div class="card" style="width: 18rem;">
				<img
					src="https://thumbnail9.coupangcdn.com/thumbnails/remote/230x230ex/image/retail/images/3205128823935169-9b961481-e75f-4737-87e0-40d36d9d5e98.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">HP 노트북</h5>
					<p class="card-text">가성비 최고 게이밍 노트북</p>
					<p class="card-text">390,040원</p>
					<a
						href="https://www.coupang.com/vp/products/6662026640?itemId=15294714959&vendorItemId=82515116791&sourceType=srp_product_ads&clickEventId=032b7830-3920-429b-ace7-40a3db0ab598&korePlacement=15&koreSubPlacement=1&q=%EB%85%B8%ED%8A%B8%EB%B6%81&itemsCount=36&searchId=b1265aca2b034b75ac282417f9ee0cad&rank=0&isAddedCart="
						class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<!--  Bootstrap components에 Card 적용 -->
			<div class="card" style="width: 18rem;">
				<img src="./image1/레이디스룸.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">레이디스룸</h5>
					<p class="card-text">여리 거즈 시스루 오버핏 셔츠 남방</p>
					<p class="card-text">19,890원</p>
					<a
						href="https://www.coupang.com/vp/products/7265868921?itemId=18518270942&vendorItemId=85656981498&q=%EC%85%94%EC%B8%A0&itemsCount=36&searchId=2395d35905df499a97feaf7749950713&rank=2&isAddedCart="
						class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<!--  Bootstrap components에 Card 적용 -->
			<div class="card" style="width: 18rem;">
				<img src="./image1/린넨.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">ANYOU 린넨 셔츠</h5>
					<p class="card-text">여자 루즈핏 빈티지 심플 하이넥 캐주얼 셔츠 상의 여름</p>
					<p class="card-text">32,680원</p>
					<a href="#" class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<div class="card" style="width: 18rem;">
				<img src="./image1/청작업복.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">청남방</h5>
					<p class="card-text">꽃중년 남자 청남방 여름 용접 긴팔 스판 청작업복 1+1 빅사이즈</p>
					<p class="card-text">24,800원</p>
					<a
						href="https://www.coupang.com/vp/products/4855010972?itemId=6290050833&vendorItemId=73585585217&sourceType=srp_product_ads&clickEventId=a85e4ee0-8161-405d-99e1-19277ac4c300&korePlacement=15&koreSubPlacement=1&q=%EC%85%94%EC%B8%A0&itemsCount=36&searchId=2395d35905df499a97feaf7749950713&rank=0&isAddedCart="
						class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
	</div>
	<br />
	<br />
	<div class="row">
		<div class="col-lg-3 col-md-6">
			<!--  Bootstrap components에 Card 적용 -->
			<div class="card" style="width: 18rem;">
				<img src="./image1/옥스포드.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">어썸어라운드 옥스포드 셔츠</h5>
					<p class="card-text">여성용 옥스포드 오버핏 셔츠</p>
					<p class="card-text">22,900원</p>
					<a
						href="https://www.coupang.com/vp/products/6746061860?itemId=15762234740&vendorItemId=82975671464&pickType=COU_PICK&q=%EC%85%94%EC%B8%A0&itemsCount=36&searchId=2395d35905df499a97feaf7749950713&rank=1&isAddedCart="
						class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<!--  Bootstrap components에 Card 적용 -->
			<div class="card" style="width: 18rem;">
				<img src="./image2/링클프리베이직.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">캐럿 남성용 긴팔 셔츠</h5>
					<p class="card-text">남성용 구김없는 링클프리 베이직 긴팔 셔츠</p>
					<p class="card-text">14,190원</p>
					<a href="#" class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<!--  Bootstrap components에 Card 적용 -->
			<div class="card" style="width: 18rem;">
				<img src="./image2/캐럿.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">캐럿 남성용 와이셔츠</h5>
					<p class="card-text">구김없는 스판 정장 슬림핏 와이셔츠</p>
					<p class="card-text">14,900원</p>
					<a href="#" class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<div class="card" style="width: 18rem;">
				<img src="./image2/크라비7부.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">가이스토리 남성용 빅사이즈</h5>
					<p class="card-text">크라비 7부 캐주얼 셔츠</p>
					<p class="card-text">19,900원</p>
					<a href="#" class="btn btn-primary">아이템 보기</a>
				</div>
			</div>
		</div>
	</div>
	<br />
	<br />
<!-- footer부분 -->
<jsp:include page="footer.jsp"/>

</body>
</html>