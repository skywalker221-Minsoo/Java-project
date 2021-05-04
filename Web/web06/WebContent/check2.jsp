<%@ page import="shop.CheckDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
	String id = request.getParameter("id");
String pw = request.getParameter("pw");

CheckDB db = new CheckDB();
boolean result = db.check(id, pw);
// 로그인이 성공할 경우, id를 사이트 내 여러 페이지에서 쓸 수 있도록 설정.
// 세션이 유지되는 동안 쓸 수 있도록 해야한다.
session.setAttribute("id", id);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- session.getAttribute("id") == null 이라는 것은 id이름에 세션이 설정된 것이 없다라는 의미
	  로그인이 안된다면 로그인 입력폼을 보여줘야 한다. -->
	<%
		if (session.getAttribute("id") == null) {
	%>

	<%
		} else {
	%>
	로그인 결과는
	<%=result%>
	<!-- 표현식 -->
	<%=session.getAttribute("id")%>님 환영합니다.
	<br>
	<a href="board1.jsp">
		<button type="button">게시판 글쓰기 가기</button>
	</a>
	<a href="logout.jsp">로그아웃</a>
	<%
		}
	%>
</body>
</html>