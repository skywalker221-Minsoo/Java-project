<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check() {
		//아이디에 입력한 값을 가지고 와야함.
		idTag = document.getElementById('id') // 태그 추출
		idValue = idTag.value
		console.log('입력한 id는 ' + idValue)
		//글자길이가 어떻게 되는지 처리해야함.
	}
	function check2() {
		//아이디에 입력한 값을 가지고 와야함.
		pwTag = document.getElementById('pw') // 태그 추출
		pwValue = pwTag.value
		console.log('입력한 pw는 ' + pwValue)
		//글자길이가 어떻게 되는지 처리해야함.
	}
</script>
</head>
<body>
아이디: <input type="text" name="id" id="id" value='root'><br> <!-- name : 서버에서 받을때 / id = 클라이언트에서 받을때 -->
패스워드: <input type="text" name="pw" id="pw" ><br>
<button type="button" onclick="check()">아이디 길이 체크</button>
<button type="button" onclick="check2()">패스워드 체크</button>

</body>
</html>