<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script>
	//document.ready(): body부분을 먼저 부라우저가 읽고 와서
	//body 안에 있는 요소들을 부라우저가 인식한 후에 설정을 하게 됨.
	$(function() {
		//body부분을 브라우저가 먼저 읽고 와서
		//RAM에 트리구조로 body부분을 만들어서 포함관계를 알 수 있음.
		//부모, 자식간의 관계가 성립
		//Document Object Model(DOM 방식) tree
		//실행할 내용을 이름함수에 바로 넣어준다.
		alert('body태그 안에 있는 요소들을 모두 읽어서 브라우저가 인식하고 있음')
		//콜백함수
		//태그이름$('태그이름'), 클래스이름 $('.클래스이름')
		//아이디이름$('#아이디이름')
		$('#button').click(function() {
			data = $('#data2').val() //#을 붙이면 해당 input 값에 입력된 것을 가져온다.
			data2 = $('input').val() //이름이 똑같은 태그는 첫번째것만 인식한다!!
									 //이 때는 input 태그 뒤의 value=""을 인식하는 것이다!!
			alert('입력된 값은' + data)
			data3 = $('#data3').val()
			alert('입력된 값은' + data3)
			
		})
	})
	$(function() {
		$('#button2').click(function() {

			data3 = $('#data3').val()
			alert('입력된 값은' + data3)
		})
	
	})
</script>
</head>
<body>
<input id="data">
<input id="data2">
<button id="button1">뭐할꺼니??</button>
<hr color="green">
<input id="data3">
<button id="button2">어디로 갈꺼니??</button>

</body>
</html>