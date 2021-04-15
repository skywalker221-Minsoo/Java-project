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
				url: "fruit",
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
		$('#b2').click(function() {
			$.ajax({
				url: "tour",
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
<input id="b1" type="button" value="과일 목록">
<input id="b2" type="button" value="여행 목록">
<hr color="red">
<div id="result"></div>
</body>
</html>