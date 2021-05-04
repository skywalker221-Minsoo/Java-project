<%@ page import="shop.BoardDB" %>
<%@ page import="shop.BoardVO" %>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
            String id = request.getParameter("id");
            String title = request.getParameter("title");
            String content = request.getParameter("content");
    
            BoardVO bag = new BoardVO();
            
            bag.setId(id);
            bag.setId(title);
            bag.setId(content);
            
            BoardDB db = new BoardDB();
            db.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=id %>님의 제목이 <%= title %>로, 내용이 <%= content %>로 변경되었습니다.<br>
		<form action="bbs연습.jsp">
		<button>처음화면으로</button>
	</form>
</body>
</html>