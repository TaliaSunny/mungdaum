<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>게시글 상세보기</title>
<!-- 부트스트랩 CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header text-center">게시글 상세보기</div>
                    <div class="card-body">
                        <form name="getBoardForm" method="post" action="updateBoard.do">
                        	<input name="seq" type="hidden" value="${board.seq}"/>                        	
                        	<table class="table">
                            	<tr>
					<td bgcolor="orange" width="80">제목</td>
					<td align="left">
						<input type="text" name="title" value="${board.title}"/>
					</td>
					</tr>
					<tr>
						<td bgcolor="orange">작성자</td>
						<td align="left">${board.writer}</td>
					</tr>
					<tr>
						<td bgcolor="orange">내용</td>
						<td align="left">
							<textarea name="content" rows="10" 
cols="50">${board.content}</textarea>
						</td>
					</tr>
					<tr>
						<td bgcolor="orange">등록일</td>
						<td align="left">${board.regdate}</td>
					</tr>
					<tr>
						<td bgcolor="orange">조회수</td>
						<td align="left">${board.cnt}</td>
					</tr>
								
                        </table>
                        <button type="submit" class="btn btn-primary btn-block">게시글 수정</button>
                       </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <br>
    <div class="text-center">
	<button onclick="location.href='insertBoard.jsp'" class="btn btn-outline-primary btn-sm">새 게시글
 등록</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button onclick="location.href='deleteBoard.do?seq=${board.seq}'" class="btn btn-outline-danger
 btn-sm">게시글 삭제</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button onclick="location.href='getBoardList.do'" class="btn btn-outline-success btn-sm">전체 게시글
 목록 보기</button>
	</div>    
</body>
</html>