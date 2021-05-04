<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<h3>게시판 검색 정보</h3>
<hr color="green">
<c:forEach var="vo2" items="${Thislist}">
게시물 번호 ${vo2.id}<br>
게시물 제목 ${vo2.pw}<br>
게시물 내용 ${vo2.name}<br>
게시물 작성자 ${vo2.tel}<br>
</c:forEach>
<a href="login4_select.jsp">로그인 화면으로</a>
</body>
</html>