<%@ page import="shop.BoardDB"%>
<%@ page import="shop.BoardVO"%>

<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");

	BoardDB db = new BoardDB();
	BoardVO bag = db.read(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원검색이 완료되었습니다.
	<hr>
	<!-- 표현식 -->
	검색된 id : <%= bag.getId()%><br>
	검색된 제목 : <%= bag.getTitle()%><br> 
	검색된 내용 : <%= bag.getContent()%><br> 
	검색된 작가 : <%= bag.getWriter()%><br> 

	<form action="bbs연습4.jsp">
		<button>처음화면으로</button>
	</form>
</body>
</html>