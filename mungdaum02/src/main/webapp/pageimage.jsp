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
<title>bxSlider</title>
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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css" />

<script>
	$(document).ready(function() { //문서가 읽혀지고 나서
		$('.slider').bxSlider({ //.slider - 클래스 .bxSlider() 함수
			auto : true, //이미지가 자동으로 움직임
			speed : 500, //1초간격으로 이미지가 바뀐다.
			pause : 2000, //멈추는 시간
			mode : 'fade', //fade : 제 자리에서 움직인다. horizontal : 수평으로 움직이는 것  vertical : 수직으로 움직인다.
			pager : true,
			autoHover : true,
		});
	});
</script>
</head>
<body>

	<div class="slider">
		<div>
			<img src="https://puppydog.co.kr/web/upload/appfiles/0zdpAngaKBFnlCcCqpCU4A/ff643a9b4816f7173f45188aba4c8707.jpg" />
		</div>
		<div>
			<img src="https://puppydog.co.kr/web/upload/appfiles/0zdpAngaKBFnlCcCqpCU4A/c4f80a5d10178e13cb76c6b9dcf3fdb2.jpg" />
		</div>
		<div>
			<img src="https://puppydog.co.kr/web/upload/appfiles/0zdpAngaKBFnlCcCqpCU4A/ab7711ce5651a8440d005cf62293ff12.jpg" />
		</div>
		<div>
			<img src="https://puppydog09.openhost.cafe24.com/web/upload/appfiles/0zdpAngaKBFnlCcCqpCU4A/db4f9bfbcc7182cdd172831929f8b60d.png" />
		</div>
	
	</div>
</body>
</html>