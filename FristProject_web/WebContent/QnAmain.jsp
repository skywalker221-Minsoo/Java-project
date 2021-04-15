<%@page import="java.util.ArrayList"%>
<%@page import="DB.QnADB"%>
<%@page import="DB.QnAVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
		QnADB db = new QnADB();
		ArrayList<QnAVO> list = db.list();
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>자주 찾는 질문<br></h2>
	<h3>고객분들께서 자주 하시는 질문을 모았습니다.</h3>
	<hr color="grey"><br>
	<table border="1">
	<tr>
		<td width="100">번호</td>
		<td width="100">구분</td>
		<td width="400">제목</td>
		<td width="100">조회수</td>
	</tr>
	<%
		for (int i = 0; i < list.size(); i++) {
		QnAVO bag2 = list.get(i);
	%>
	<tr>
		<td><%= bag2.getNo() %> </td>
		<td><%= bag2.getType() %></td>
		<td><a href="QnAread.jsp?no=<%= bag2.getNo() %>"> <%= bag2.getTitle() %> </a></td>
		<td><%= bag2.getViews() %></td>
	</tr>
	<% } %>
	<a href="movie_main.jsp"><button>홈</button></a>
</body>
</html>