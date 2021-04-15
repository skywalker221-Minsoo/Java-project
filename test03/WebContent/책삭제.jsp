<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>책 삭제화면입니다.</h2>
	<hr color="green">
	<form action="delete.jsp"> <!-- 마찬가지로 id에 대한 정보를 입력하면 delete.jsp 화면으로 넘어간다. -->
		아이디: <input name="id"><br>
		<button>서버로 전송</button>
</body>
</html>