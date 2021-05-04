<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js.out.js"></script>
<script type="text/javascript">
function plus() {
	var a = document.getElementById('no1').value
	var b = document.getElementById('no2').value
	var no = parseInt(a) + parseInt(b)
	alert(no)
}

function img() {
	img = document.getElementById('img').value
	result = document.getElementById('result')
	result.innerHTML = '<img src=resources/img/' + img + '.png>' 
}
</script>
</head>
<body>
<input type="text" id="no1" value=""><br>
<input type="text" id="no2" value=""><br>
<button onclick="plus()">더하기</button><br><br>
<hr>
이미지 이름 : <input type="text" id="img" value=""><br>
<button onclick="img()">이미지를 보여지는 버튼</button>
<div id="result" style="background:yellow; width=200px; height:200px" ><!-- innerHTML 내용 --></div>
</body>
</html>