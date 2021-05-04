<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		/* 자바스크립트라는 언어는 변수에 값이 들어갈 때 변수에 들어갈 데이터의 타입이 결정된다.
			=> 오토타이핑(auto-typing)
			<-> String[] week; //선언할 때!
		*/
		var day = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
		alert(day)
		for (var i = 0; i < day.length; i++) {
			console.log(day[i])
			if (day[i] == 'Thu') {
				alert('와~~~내일 금요일이다.')
			}
		}
	</script>
</body>
</html>