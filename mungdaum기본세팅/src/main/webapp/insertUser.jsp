<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>회원가입 페이지</title>
    <!-- 부트스트랩 CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>


<body class="bg-light">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header text-center">회원가입</div>
                    <div class="card-body">
                        <form name="userForm" method="post" action="insertUser.do">
                            <div class="form-group">
                                <label for="id">아이디</label>
                                <input type="text" class="form-control" id="id" name="id" required>
                            </div>                            
                            <div class="form-group">
                                <label for="password">비밀번호</label>
                                <input type="password" class="form-control" id="password" name="password" 
required>
                            </div>
                            <div class="form-group">
                                <label for="name">이름</label>
                                <input type="text" class="form-control" id="name" name="name" required>
                            </div>
                            <div class="form-group">
                                <label for="role">역할</label>
                                <input type="text" class="form-control" id="role" name="role" required>
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">가입하기</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
