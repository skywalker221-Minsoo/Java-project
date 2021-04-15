<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("id", "root");
	String id = (String) session.getAttribute("id");
	MemberDB db = new MemberDB();
	MemberVO bag = db.read(id);
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

input {
	height: 50px;
	Width: 200px;
	font-size: 25px;
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
<h2>게시글 삭제</h2>
      <hr color="red">
      <!-- form태그는 값을 입력하고 싶을 때 사용 -->
      <!-- 입력값들은 모두 form들어가야 한다. -->
      <!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
       <form action="emailconnect2.jsp">
       	아이디&nbsp;&nbsp; <input name="id">
       <button>게시글삭제</button>
       </form>
</div>
</body>
</html>