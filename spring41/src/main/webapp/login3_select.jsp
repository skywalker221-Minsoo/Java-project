<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/out.js"></script>
<script type="text/javascript">
	alert('내가 시작')
	sum2 = add(300, 200)
	minus(sum2)
</script>
</head>
<body bgcolor="gold">
<!-- view 부분 -->
<h3>게시판 글검색</h3>
<hr color="green">
<img src="resources/img/ma.jpg">
<a href="all">전체검색</a>
<form action="select">
	아이디 : <input type="text" name="id" class="in"><br>
	<input id="b" type="submit" value="게시판글검색">
</form>
</body>
</html>