<%@ page import="shop.BoardDB" %>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
            String id = request.getParameter("id");
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            String writer = request.getParameter("writer");

            BoardDB db = new BoardDB();
            db.create(id, title, content, writer);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입 처리 되셨습니다. 환영합니다!<br>

회원 탈퇴를 하고싶으시다면, 다음 버튼을 눌러주세요.<br>
	<form action="bbs연습2.jsp">
		<button>회원 탈퇴</button><br>
	</form>
정보수정을 원하시면, 이 버튼을 눌러주세요.<br>
	<form action="bbs연습3.jsp">
		<button>회원정보 수정</button>
	</form>
회원검색을 원하시면, 이 버튼을 눌러주세요.<br>
	<form action="bbs연습4.jsp">
		<button>회원정보 검색</button>
	</form>
</body>
</html>