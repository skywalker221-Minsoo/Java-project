<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="gold">
<h3>로그인을 해봅시다.</h3>
<hr color="green">
<form action="select2">
	아이디 : <input type="text" name="id"><br>
	<input type="submit" value="게시판글검색">
</form>
<a href="select2?id=root">root회원 검색</a><br>
<a href="select2?id=apple">apple회원 검색</a><br>
<a href="select2?id=wow">wow회원 검색</a><br>
</body>
</html>