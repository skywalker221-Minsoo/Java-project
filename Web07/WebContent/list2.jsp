<%@ page import="shop.BoardDB" %>
<%@ page import="shop.BoardVO" %>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    BoardDB db = new BoardDB();
    ArrayList<BoardVO> list = db.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for (int j = 0; j < list.size(); j++) {
	BoardVO bag2 = list.get(j);
%>
<%= bag2.getId() %>, <%= bag2.getTitle() %>, <%= bag2.getContent() %>, <%= bag2.getWriter()%><br>
<%} %>
</body>
</html>