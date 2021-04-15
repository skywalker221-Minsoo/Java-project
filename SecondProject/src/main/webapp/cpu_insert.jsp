<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<!-- view부분!! -->
<h3>CPU제품정보등록</h3>
<hr color="white">
<form action="cpuinsert">
	CPU 아이디 : <input type="text" name="cpu_id"><br>
	CPU 이름: <input type="text" name="cpu_name"><br>
	CPU 제조사: <input type="text" name="cpu_cop"><br>
	CPU 제조일자: <input type="text" name="cpu_indate"><br>
	CPU 제품분류: <input type="text" name="cpu_sort"><br>
	CPU 소켓: <input type="text" name="cpu_sock"><br>
	CPU 클럭최소: <input type="text" name="cpu_klugmin"><br>
	CPU 클럭최대: <input type="text" name="cpu_klugmax"><br>
	CPU 메모리규격: <input type="text" name="cpu_stand"><br>
	CPU 내장그래픽: <input type="text" name="cpu_graph"><br>
	
	<input type="submit" value="제품정보등록">
</form>
</body>
</html>