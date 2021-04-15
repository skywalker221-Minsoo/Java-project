/**
 * 최종 수정 날짜 : 2021. 2. 23.
 * 작성자 : 홍길동
 * 수정내용 : 함수 추가함
 */

function site(name) {
	// 자바스크립트는 변수를 선언하지 않아도 된다. 무조건 var. 생략도 가능하다.
	// site = prompt('사이트 명을 입력하세요.')

	if (name == "naver") {
		location.href = "http://www.naver.com"
	} else if (name == "daum") {
		location.href = "http://www.daum.net"
	} else {
		alert('해당 사이트가 없습니다.')
	}

}

function data() {
	s1 = prompt('숫자1입력')
	s2 = prompt('숫자2입력')
	
	n1 = parseInt(s1)
	n2 = parseInt(s2)
	
	alert(n1 + n2)
}

function add() {
	
	s1 = prompt('숫자1입력')
	s2 = prompt('숫자2입력')
	
	n1 = parseInt(s1)
	n2 = parseInt(s2)
	alert(n1 + n2)
}

function minus() {
	
	s1 = prompt('숫자1입력')
	s2 = prompt('숫자2입력')
	
	n1 = parseInt(s1)
	n2 = parseInt(s2)
	alert(n1 - n2)
}