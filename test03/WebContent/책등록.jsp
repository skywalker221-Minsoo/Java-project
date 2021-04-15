<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>책 등록화면입니다.</h2>
	<hr color="green">
	<form action="insert.jsp"> <!-- 각 테이블별 정보를 입력하고 버튼을 누르면 insert.jsp로 화면이 넘어간다. -->
		아이디: <input name="id"><br> 제목: <input name="title"><br>
		내용: <input name="story"><br> 회사: <input name="company"><br>
		<button>서버로 전송</button>
</body>
</html>