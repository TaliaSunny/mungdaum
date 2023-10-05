<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>content영역</title>
<style>
.ck-editor__editable {
		min-height: 250px;
	}
</style>
</head>
<body>
	<div class="form-group">
		
		<textarea class="form-control" id="content" name="content" rows="5"
			required></textarea>
		<script
			src="https://cdn.ckeditor.com/ckeditor5/34.0.0/classic/ckeditor.js"></script>
		<script>ClassicEditor.create(document.querySelector('#content'));</script>
	</div>
</body>
</html>