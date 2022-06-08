<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Test1</h1>
	<form method="post" action="result">
		이름:<input type="text" name="user_name" /><br>
		비밀번호:<input type="password" name="user_pw" /><br>
		아이디:<input type="text" name="user_id" /><br>
		우편번호:<input type="text" name="post_code" /><br>
		주소1:<input type="text" name="addr1" /><br>
		주소2:<input type="text" name="addr2" /><br>
		<button type="submit">확인</button>
	</form>
</body>
</html>