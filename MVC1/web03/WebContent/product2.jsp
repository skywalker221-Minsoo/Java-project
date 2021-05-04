
<%@ page import="shop.영화DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 1. 입력한 값 서버에서 받아와야 함. -->
<%
	// HttpServletRequest request = new HttpServletRequest();
	String subject = request.getParameter("subject");
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	String genre = request.getParameter("genre");
	String rank = request.getParameter("rank");
	String word = request.getParameter("word");
	
	

%>
<!-- 2. 입력한 값 db처리 전담하는 클래스한테 맡겨야 함. create! 하라고 명령해야 함. -->
<%
	영화DB db = new 영화DB();
	db.create();
%>
<!-- 3. 회원가입 처리 결과 알려줌. 클라이언트 : html -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>당신의 회원정보를 확인해주세요.</h3>
		<hr color="red">
		당신이 입력한 영화제목 : <%= subject %> <br>
		당신이 입력한 개봉일자 : <%= year %>년 <br>
		당신이 입력한 개봉일자 : <%= month %>월 <br>
		당신이 입력한 개봉일자 : <%= day %>일 <br>
		당신이 입력한 장르 : <%= genre %> <br>
		당신이 입력한 평점 : <%= rank %> <br>
		당신이 입력한 의견 : <%= word %> <br>
	</body>
</html>