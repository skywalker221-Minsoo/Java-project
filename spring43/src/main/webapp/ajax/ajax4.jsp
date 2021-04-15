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
			titleVal = $('#title').val()
			feeVal = $('#fee').val()
			$.ajax({
				url: "title",
				data: {
					title: titleVal,
					fee: feeVal
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
영화제목: <input id="title" type="text">
영화관람료: <input id="fee" type="text">
<input id="b1" type="button" value="확인">
<div id="result"></div>
</body>
</html>