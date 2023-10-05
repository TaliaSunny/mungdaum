<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>게시글 입력 폼 - CKEditor 적용</title>
<!-- 부트스트랩 CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.ck-editor__editable {
	min-height: 200px;
}
</style>
</head>
<body class="bg-light">
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header text-center">게시글 작성</div>
					<div class="card-body">
						<form name="insertForm" method="post" action="insertBoard.do">
							<!-- 입력 필드들 -->
							<div class="form-group">
								<label for="title">제목</label> <input type="text"
									class="form-control" id="title" name="title" required>
							</div>
							<div class="form-group">
								<label for="writer">작성자</label> <input type="text"
									class="form-control" id="writer" name="writer" required>
							</div>
							<div class="form-group">
								<label for="content">내용</label>
								<textarea class="form-control" id="content" name="content"
									required></textarea>
								<script
									src="https://cdn.ckeditor.com/ckeditor5/34.0.0/classic/ckeditor.js">
									
								</script>
								<script>
									ClassicEditor.create(document
											.querySelector('#content'));
								</script>
							</div>
							<!-- 등록 버튼 -->
							<button type="submit" class="btn btn-primary btn-block">게시글
								등록</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
