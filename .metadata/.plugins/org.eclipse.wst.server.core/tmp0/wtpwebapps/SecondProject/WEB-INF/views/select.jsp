<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다나와 pc 마이페이지</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<body>
${loginVO.user_id} 님의 회원정보는<br>
비밀번호: ${vo.user_pw}<br> 
성함: ${vo.user_name}<br> 
생년월일: ${vo.user_birth}<br> 
전화번호: ${vo.user_tel}<br> 
주소: ${vo.user_address}<br> 
이메일: ${vo.user_email} 입니다.<br>


<a href="update.jsp"><button>회원정보 수정하기</button></a>
<br>
<a href="delete.jsp"><button>회원 탈퇴하기</button></a>
<br>
<a href="all"><button>장바구니로 이동</button></a>


<hr color="red">
<div id="result"></div>
</body>
</html>