<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="gold">
<h3>시작해 봅시다.</h3>
<hr color="blue">
<a href="all2">전체검색</a>
<form action="select4">
	아이디 : <input type="text" name="id"><br>
	<input type="submit" value="검색"><br>
</form>
<a href="select4?id=100">100검색</a><br>
<a href="select4?id=200">200검색</a><br>

</body>
</html>