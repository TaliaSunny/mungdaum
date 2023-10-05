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
<title>헤더와 로그인/로그아웃 관련 부분</title>
<!-- bxslider 실행에 필요한 jquery, bxslider css, js -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<!-- 제일 가까운 위치에서 가져오겠다. : cnd -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css" />
<%-- 이미지 변경을 위한 JavaScript 코드 --%>
<!-- <script type="text/javascript">
    function changeImage() {
        var image = document.getElementById("hover-image");
        if (image.src.endsWith("images/4.png")) {
            image.src = "https://puppydog.co.kr/web/upload/appfiles/0zdpAngaKBFnlCcCqpCU4A/3642e66df2340bdc448e87f7b3b2e756.png"; // 이미지를 2로 변경
        } else {
            image.src = "images/4.png"; // 이미지를 1로 변경
        }
    }
</script> -->

<!-- ====================================== -->
<!-- Bootstrap 실행에 필요한 css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css" />
</head>
<body>
	<div class="title">
		<nav id="header">
			<div id="header_menu">
				<ul id="header_menu">
					<!-- 로그인 하지 않은 상태 -->
					<c:if test="${userName == null}">
						<li><a class="header_menu_item" href="login.jsp">로그인</a></li>
						<li>|</li>
						<li><a class="header_menu_item1" href="insertUser.jsp">회원가입</a></li>
						<li>|</li>
						<li><a class="header_menu_item" href="고객센터.jsp">고객센터</a></li>
					</c:if>

					<!-- 로그인 한 상태 -->
					<!-- 1. 관리자로 로그인한 상태 -->
					<!--역할의 관리자가 한글로 되어있다는 가정  -->

					<c:if test="${userName == '관리자'}">
						<li class="header_menu_item"><span style="color: blue;">${userName}님</span></li>
						<li><a class="header_menu_item1" href="logout.do">로그아웃</a></li>
						<li>|</li>
						<li><a class="header_menu_item" href="#">관리자 페이지</a></li>
					</c:if>

					<!-- 2. 일반 유저로 로그인한 상태 -->
					<c:if test="${userName != null && userName != '관리자'}">
						<li class="header_menu_item"><span>${userName}님</span></li>
						<li><a class="header_menu_item1" href="logout.do">로그아웃</a></li>
						<li>|</li>
						<li><a class="header_menu_item" href="#">마이 페이지</a></li>
						<li>|</li>
						<li><a class="header_menu_item" href="#">장바구니</a></li>
						<li>|</li>
						<li><a class="header_menu_item" href="고객센터.jsp">고객센터</a></li>
					</c:if>
				</ul>
			</div>
		</nav>
		<div class="logo_search">
			<div class="header_logo">
				<a href="index.jsp"><img src="images/멍다움_최종로고수정.png" alt="이미지1"
					id="hover-image" onmouseover="changeImage()" class="logo"></a>
			</div>

		</div>
	</div>
</body>

</html>