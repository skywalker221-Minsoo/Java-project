
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel ="stylesheet" type="text/css" href="out.css">
<style></style>
</head>
<body>
	<div id="total">
		<div id="top">메뉴가 들어가는 부분
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">장바구니 부분
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">회원 정보 들어가는 부분</div>
	</div>
</body>
</html>