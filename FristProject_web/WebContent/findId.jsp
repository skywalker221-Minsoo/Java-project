

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.center{
	text-align: center;
	font-size: 30px;
}

input {
	width: 300px;
	height: 30px;
	font-size: 30px;
	margin: 0 0 0 20px;
}

button {
	height: 50px;
	Width: 200px;
	font-size: 25px;
}

select {
	height: 50px;
	Width: 100px;
	font-size: 25px;

}
</style>
<title>아이디찾기화면입니다</title>
</head>
<body>
<div class="center">
	<h2>아이디 찾기</h2>
	<hr color="blue">
	<form action="checkId.jsp">
	이름: <input name="name"><br>
 	휴대폰 번호: 
		 <select name="company">
		 	<option value="SKT">SKT</option>
		 	<option value="LG">LGT</option>
		 	<option value="KT">KT</option>
		 </select>
		 <input name="tel"><br>
		<button type="submit">확인</button>
	</form>
</div>
</body>
</html>