<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<!-- view부분!! -->
<h3> mainboard 제품정보등록</h3>
<hr color="black">
<form action="mbinsert">
	MB 아이디 : <input type="text" name="main_id"><br>
	MB 이름: <input type="text" name="main_name"><br>
	MB 제조사: <input type="text" name="main_cop"><br>
	MB 제조일자: <input type="text" name="main_indate"><br>
	MB 제품분류: <input type="text" name="main_sort"><br>
	MB 소켓: <input type="text" name="main_sock"><br>
	MB 세부칩셋: <input type="text" name="main_chipde"><br>
	MB 폼팩터: <input type="text" name="main_foam"><br>
	MB 전원부: <input type="text" name="main_power"><br>
	MB 메모리슬롯: <input type="text" name="main_memoslot"><br>
	MB 내장그래픽: <input type="text" name="main_graph"><br>
	<input type="submit" value="제품정보등록">
</form>
</body>
</html>