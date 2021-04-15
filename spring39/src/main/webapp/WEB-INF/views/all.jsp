<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
게시물 등록이 완료되었습니다!
<hr color="gold">
<!-- java의 핵심적인 문법은 tag로 편하게 쓰자 -->
<!-- jstl: java standard tag library -->
<!-- for (BbsVO vo : list) {

		}
-->
<c:forEach var="vo" items="${Thislist}">
<!-- session.getAttribute("bbsVO").gitID(): 표현식 --> 
등록된 id: ${vo.id}<!-- 표현언어(Expression Languages:EL) --><br>
등록된 title: ${vo.title}<br>
등록된 content: ${vo.content}<br>
등록된 writer: ${vo.writer}<br>
<hr color="gold">
</c:forEach>
<a href="login3_insert.jsp">게시판 글쓰기</a>
<!-- 브라우저에서 요청할 수 있는 페이지만 들어갈 수 있음. webapp아래 파일만 -->
</body>
</html>