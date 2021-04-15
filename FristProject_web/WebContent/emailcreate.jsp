<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@page import="DB.EmailVO"%>
<%@page import="DB.EmailDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = (String) session.getAttribute("id");
	MemberDB db = new MemberDB();
	MemberVO bag = db.read(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p style="font-size: 30px;">이메일 문의</p>
	<p style="font-size: 20px;">불편사항이나 문의사항을 남겨주시면 신속하게 답변드리겠습니다.</p>
	<hr color="grey">
	<br>

	<form action="emailconnect.jsp">
		아&nbsp;&nbsp;이&nbsp;&nbsp;디&nbsp;&nbsp; <input name="id" value=<%=id%>>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름&nbsp;&nbsp; <input
			name="name" value=<%=bag.getName()%>><br> <br>
		연&nbsp;&nbsp;락&nbsp;&nbsp;처&nbsp;&nbsp; <input name="tel">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		이&nbsp;&nbsp;메&nbsp;&nbsp;일&nbsp;&nbsp; <input name="email"><br>
		<br>
		<hr color="grey">
		문의유형&nbsp; <input type="radio" value="문의" name="type">문의 <input
			type="radio" value="불만" name="type">불만 <input type="radio"
			value="칭찬" name="type">칭찬 <input type="radio" value="제안"
			name="type">제안<br> <br>
		제&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목&nbsp;&nbsp; <input
			name="title"><br> <br>
		내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용&nbsp;&nbsp;
		<textarea rows="10" cols="100" name="content"></textarea>
		<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button>등록하기</button>
		</form>
	<a href="movie_main.jsp"><button>홈</button></a>
</body>
</html>