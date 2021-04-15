<%@page import="DB.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");

    	MemberDB db = new MemberDB();
    	db.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>

.center{
	text-align: center;
	font-size: 30px;
}

button {
	height: 50px;
	Width: 200px;
	font-size: 25px;
}

</style>
<title>Insert title here</title>
</head>
<body>
<div class="center">
탈퇴가 완료되었습니다.
<a href="logout.jsp"><button type="button">로그인페이지로</button></a>&nbsp;&nbsp;
</div>       
</body>
</html>