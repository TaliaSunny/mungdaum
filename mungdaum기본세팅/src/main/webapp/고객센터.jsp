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
<title>고객센터</title>
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
	<!-- 홈페이지 상단 부분의 헤더 부분 템플릿 -->
	<jsp:include page="common-header.jsp" />
	<!-- 상단 부분의 메뉴바 부분 -->
	<jsp:include page="common-menu.jsp" />
	<!-- 움직이는 이미지 bxSlider -->
	<jsp:include page="pageimage.jsp" />
	<!-- 네비게이션 바 -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container">
			<a class="navbar-brand" href="#">고객센터</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="#">홈</a></li>
					<li class="nav-item"><a class="nav-link" href="#">서비스</a></li>
					<li class="nav-item"><a class="nav-link" href="#">문의</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- 헤더 -->
	<header class="bg-light text-black text-center py-5">
		<h1>고객센터</h1>
		<p class="lead">무엇을 도와드릴까요? 문의 사항이나 요청 사항이 있으시면 언제든지 연락 주세요.</p>
	</header>
	<div>
		<img src="images/고객센터이미지.jpg" class="centered-image" />

	</div>
	<!-- 연락처 정보 -->
	<section class="container my-5">
		<h2>연락처 정보</h2>
		<p>
			<strong>전화번호:</strong> 123-456-7890
		</p>
		<p>
			<strong>이메일:</strong> support@example.com
		</p>
		<p>
			<strong>운영 시간:</strong> 월요일 - 금요일, 9:00 AM - 5:00 PM
		</p>
	</section>

	<!-- FAQ 섹션 -->
	<section class="container my-5">
		<h2>자주 묻는 질문 (FAQ)</h2>
		<div class="accordion" id="faqAccordion">
			<!-- FAQ 아이템 1 -->
			<div class="accordion-item">
				<h2 class="accordion-header" id="faqItem1">
					<button class="accordion-button" type="button"
						data-bs-toggle="collapse" data-bs-target="#faqCollapse1"
						aria-expanded="true" aria-controls="faqCollapse1">Q: 제품을
						어떻게 구매할 수 있나요?</button>
				</h2>
				<div id="faqCollapse1" class="accordion-collapse collapse show"
					aria-labelledby="faqItem1" data-bs-parent="#faqAccordion">
					<div class="accordion-body">A: 당사 웹사이트에서 온라인 주문을 하실 수 있습니다.
						또는 가까운 매장에서 직접 구매하실 수도 있습니다.</div>
				</div>
			</div>

			<!-- FAQ 아이템 2 -->
			<div class="accordion-item">
				<h2 class="accordion-header" id="faqItem2">
					<button class="accordion-button collapsed" type="button"
						data-bs-toggle="collapse" data-bs-target="#faqCollapse2"
						aria-expanded="false" aria-controls="faqCollapse2">Q: 반품
						및 교환 정책은 어떻게 되나요?</button>
				</h2>
				<div id="faqCollapse2" class="accordion-collapse collapse"
					aria-labelledby="faqItem2" data-bs-parent="#faqAccordion">
					<div class="accordion-body">A: 반품 및 교환에 관한 자세한 정보는 당사 웹사이트의
						"반품 및 교환 정책" 페이지를 참조해주세요.</div>
				</div>
			</div>

			<!-- FAQ 아이템 3 -->
			<div class="accordion-item">
				<h2 class="accordion-header" id="faqItem3">
					<button class="accordion-button collapsed" type="button"
						data-bs-toggle="collapse" data-bs-target="#faqCollapse3"
						aria-expanded="false" aria-controls="faqCollapse3">Q: 주문
						배송에 얼마나 걸릴까요?</button>
				</h2>
				<div id="faqCollapse3" class="accordion-collapse collapse"
					aria-labelledby="faqItem3" data-bs-parent="#faqAccordion">
					<div class="accordion-body">A: 주문 배송 시간은 배송 위치와 제품에 따라 다를 수
						있습니다. 주문 후 예상 배송 일정을 확인하세요.</div>
				</div>
			</div>
		</div>
	</section>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
				 <form name="#" method="post" action="#">
					<jsp:include page="content.jsp"></jsp:include>
					<button type="submit" class="btn btn-primary btn-block">문의
						등록</button>
						</form>
				</div>
			</div>
		</div>
	</div>


	<!-- 푸터 -->
	<footer class="bg-light text-center py-4">
		<p>&copy; 2023 고객센터. 모든 권리 보유.</p>
	</footer>
	<!-- Bootstrap JS 파일 및 jQuery 추가 -->

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>


</body>
</html>