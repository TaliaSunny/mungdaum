<%@page import="com.company.spring_annotation.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>    
<!-- 추가 -->
<%@ page import="com.company.spring_annotation.board.BoardDO" %>
<%@ page import="com.company.spring_annotation.board.BoardDAO" %>
<%@ page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>게시글 리스트 보기</title>
<!-- 부트스트랩 CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-10">
                <div class="card">
                    <div class="card-header text-center">게시글 리스트</div>
                    <p>총 게시글: ${boardList.size()}건</p>	                    	
                    <div class="card-body">
                    <form name="listForm" method="POST" action="getBoardList.do">
                        <table class="table">
                            <thead>
                                <tr>
                                    <td class="text-right">
					<select name="searchCondition">
						<option value="TITLE">제목
						<option value="WRITER">작성자
					</select>
				</td>	
				<td><input type="text" name="searchKeyword"/></td>
				<td><button type="submit" class="btn btn-primary">검색</button>
                                </tr>
                            </thead>                          
                            <tbody>
                                <tr>
                                    <th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="350">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="140">작성일</th>
				<th bgcolor="orange" width="100">조회수</th>
				</tr>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td align="left">${board.seq}</td>
					<td align="left">
						<a href="getBoard.do?seq=${board.seq}">${board.title}</a>	
					</td>
					<td align="left">${board.writer}</td>
					<td align="left">${board.regdate}</td>
					<td align="center">${board.cnt}</td>
				</tr>
			</c:forEach>
			</table>
		</form>	
		</div>
		</div>
		</div>
	   </div>
	</div>
	<br>
	<div class="text-center">
	   <button onclick="location.href='insertBoard.jsp'" class="btn btn-outline-primary btn-sm">새 게시글
 등록</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	   <button onclick="location.href='getBoardList.do'" class="btn btn-outline-success btn-sm">전체
 게시글 목록 보기</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	   <button onclick="location.href='logout.do'" class="btn btn-outline-danger 
btn-sm">로그아웃</button>
	</div>
</body>
</html> 










