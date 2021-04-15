<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<!-- view 부분!! -->
<h3>장바구니 내용 확인</h3>
<hr color="yellow">
	내 아이디 : ${cartVO.mId}<br>
	상품 아이디 : ${cartVO.pId}<br>
	상품 가격 : ${cartVO.price}<br>
	상품 수량 : ${cartVO.pCount}<br>	
</body>
</html>