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
	
	$('button').click(function() {
		pw1 = $('#pw1').val()
		pw2 = $('#pw2').val()
		div = $('div')//결과를 html로 나타내기 위해서!
		if (pw1 == pw2) {
			div.html('<h3 style=color:blue;>암호일치</h3>')
		}else{
			div.html('<h3 style=color:red;>암호불일치</h3>')
		}
	})
	
	$('#pw2').keyup(function() {
		pw1 = $('#pw1').val()
		pw2 = $('#pw2').val()
		div = $('div')//결과를 html로 나타내기 위해서!
		if (pw1 == pw2) {
			div.append('<h3 style=color:blue;>암호일치</h3>') //댓글달때 쓰면 유용하겠음.
		}else{
			div.append('<h3 style=color:red;>암호불일치</h3>')
		}
	})
	
	$('#add').click(function() {
		reply = $('#reply').val()
		div = $('div')//결과를 html로 나타내기 위해서!
		div.append('- ' + reply + '<br>') //댓글달때 쓰면 유용하겠음.
		$('#reply'.val(''))
	})
	
	$('#car').click(function() {
		car = $('#car').val()
		div = $('div')//결과를 html로 나타내기 위해서!
		div.append('- ' + car + '<br>') //댓글달때 쓰면 유용하겠음.
		//$('#car'.val(''))
	})
	
	$('#ma').click(function() {
		ma = $('#ma').val()
		div = $('div')//결과를 html로 나타내기 위해서!
		img = '<img width=100 height=100 src=resources/img/' + ma + '>'
		div.append('- ' + img + '<br>') //댓글달때 쓰면 유용하겠음.
		//$('#ma'.val(''))
	})
})
</script>
</head>
<body>
비밀번호1: <input id="pw1"><br>
비밀번호2: <input id="pw2"><br>
<hr color="green">
<button>체크</button>
<div id="check"></div>
<hr color="red">
댓글 : <input id='reply'><br>
<input type="button" value="댓글추가" id='add'>
<hr color="yellow" size="5">
<hr>
<input id='car' type="button" value='car.jpg' style='background:yellow; font-size:20px;'>
<input id='ma' type="button" value='ma.jpg' style='background:yellow; font-size:20px;'>
<hr color="gold" size="5">
<div></div>
</body>
</html>