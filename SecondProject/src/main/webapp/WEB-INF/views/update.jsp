<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다나와 pc 회원정보수정</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
</head>
<body>
회원정보가 각각 <br>
비밀번호: ${loginVO.user_pw}<br> 
성함: ${loginVO.user_name}<br> 
생년월일: ${loginVO.user_birth}<br> 
전화번호: ${loginVO.user_tel}<br> 
주소: ${loginVO.user_address}<br> 
이메일: ${loginVO.user_email} 
로 수정되었습니다.

</body>
</html>