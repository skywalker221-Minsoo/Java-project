<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<!-- $('div').html('체크한 결과') -->
<script>
$(function() {
	
	$('#car').click(function() {
		$("#reply5").append('<img src=resources/img/car.png width=150 height=150>')
	})
	
	$('#reply2').click(function() {
		reply = $('#reply1').val()
		$("#reply5").append(reply + "<br>")
	})
	
	$('#reply4').click(function() {
		reply2 = $('#reply3').val()
		$("#reply5").append('<img src=resources/img/car.png width=150 height=150>')
		$("#reply5").append(reply2 + "<br>")
	})
	
})
</script>
</head>
<body>
<button id="car">이미지 추가</button><br>
<hr color="green" size="5">
<hr>
<input id='reply1' type="text">
<button id="reply2">댓글 추가</button><br>
<hr color="red" size="5">
<hr>
<input id='reply3' type="text">
<button id="reply4">이미지+댓글 추가</button>
<hr color="gold" size="5">
<div id="reply5"></div>
</body>
</html>