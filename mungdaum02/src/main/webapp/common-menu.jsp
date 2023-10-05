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
<title>메뉴와 검색 부분</title>
</head>
<body>
	<div class="menu">
		<div id="navbar">
		
			<div class="navbar_menu">
				<li><a href="#"><img src="images/ham.png" class="ham"></a></li>
				<ul class="navbar_menu_ul">

					<div id="horizontal-underline"></div>
					<div id="valtical-underline"></div>
					
					<li><a href="#"><strong>간식</strong></a></li>
					<li><a href="#"><strong>사료</strong></a></li>
					<li><a href="#"><strong>미용용품</strong></a></li>
					<li><a href="#"><strong>패션용품</strong></a></li>
					<li><a href="#"><strong>위생용품</strong></a></li>
					<li><a href="#"><strong>식기/급수기</strong></a></li>
					<li><a href="#"><strong>외출용품</strong></a></li>
					<li><a href="#"><strong>장난감/훈련용품</strong></a></li>
					<li><a href="#"><strong>하우스 /안전용품</strong></a></li>
					<li><a href="getBoardList.do"><strong>자료실</strong></a></li>

				</ul>
				<div class="search">
					<input type="text" name="keyword" class="search_text"
						placeholder="신선한 바른먹거리" /> <input class="btn_search" type="image"
						src="images/search.png" />
				</div>
			</div>
		</div>
	</div>
	<!-- 밑줄 긋는거 사용하기! -->
	<jsp:include page="underline.jsp" />
</body>
</html>