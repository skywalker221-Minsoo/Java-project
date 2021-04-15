<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "computer",
				data: {
					comp: $('#comp').val(),
					comi: $('#comi').val(),
					moup: $('#moup').val(),
					moui: $('#moui').val()
				},
				success: function(x) {
					$('#result').html('<h3>' + x + '</h3>')
				}
			})
		})
	}) //start
</script>
</head>
<body>
컴퓨터 가격: <input id="comp" type="text"><br>
컴퓨터 종류: <input id="comi" type="text"><br><br>
마우스 가격: <input id="moup" type="text"><br>
마우스 종류: <input id="moui" type="text"><br>
===========================
<input id="b1" type="button" value="전체 구매 내용 확인">
<div id="result"></div>
</body>
</html>