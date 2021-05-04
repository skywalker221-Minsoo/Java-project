<%@ page import="shop.BoardDB" %>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
            String id = request.getParameter("id");

            BoardDB db = new BoardDB();
            db.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원탈퇴 처리되셨습니다. 그동안 이용해 주셔서 감사합니다.<br>
다시 회원가입을 하고싶으시다면, 아래 버튼을 눌러주세요.<br>
	<form action="bbs연습.jsp">
		<button>회원가입</button>
	</form>
</body>
</html>