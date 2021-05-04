<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function web() {
	x = document.getElementById('site').value
	if (x == 'naver') {
		location.href = 'http://www.' + x + '.com'	
	} else if (x =='google'){
		location.href = 'http://www.' + x + '.com'
	} else if (x == 'daum'){
		location.href = 'http://www.' + x + '.net'
	} else {
		alert('해당 사이트가 없음.')
	}
	
}
function pay() {
	com = document.getElementById('com').value
	money = document.getElementById('money').value
	choice = document.getElementById('choice').value
	money2 = parseInt(money)
	if (choice == 1) {
		choice = '계좌이체'
	} else if (choice == 2) {
		choice = '신용카드'
		money2 = money2 + 1000
	} else if (choice == 3) {
		choice = '휴대폰결제'
		money2 = money2 + 500
	}
	result = document.getElementById('result')
	result.innerHTML = com + '에서' + money2 + '원 ' + choice + '로 구매하셨습니다.' 
}
</script>
</head>
<body>
<input type="text" id="site" value=""><br>
<button onclick="web()">사이트 이동</button><br><br>
구매상점 입력 : <input type="text" id="com" value=""><br>
결제금액 입력 : <input type="text" id="money" value=""><br>
결제수단 입력 : <input type="text" id="choice" value=""><br>
<button onclick="pay()">샤~핑</button><br><br>
===================================
<div id="result"></div>
</body>
</html>