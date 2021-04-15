<%@page import="shop.MovieDB" %>
<%@page import="shop.MovieVO" %>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 입력되서 전송된 데이터를 받는다.
            String id = request.getParameter("id");
            String title = request.getParameter("title");
            String genre = request.getParameter("genre");
            String fee = request.getParameter("fee");
            String birth = request.getParameter("birth");
            String picture = request.getParameter("picture");
            String story = request.getParameter("story");
            // db전담하는 부품에서 db넣어달라고 할 예정.
            MovieDB db = new MovieDB();
            db.create(id, title, genre, fee, birth, picture, story);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>