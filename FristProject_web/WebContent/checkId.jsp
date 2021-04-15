<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
   
    String name = request.getParameter("name");
    String company = request.getParameter("company");
    String tel = request.getParameter("tel");
    
    MemberDB db = new MemberDB();
   
    
   
    String id = db.check2(name, company, tel);
   	
    //로그인이 성공을 한 경우, id를 사이트내 여러 페이지에서 쓸 수 있도록 설정
    //세션이 유지되는 동안 쓸 수 있도록 해야함
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
	width: 300px;
	height: 30px;
	font-size: 30px;
	margin: 0 0 0 20px;
}

</style>
<title>Insert title here</title>
</head>
<body>
<div class="center">
<h2>아이디 찾기 결과</h2>
 <% if (id == null) {%>
 		아이디 찾기에 실패하셨습니다.<br>
	<a href="login.jsp">로그인 페이지로</a><br>
	<a href="findId.jsp">아이디 찾기 페이지로</a>
 <% } else {%>
 	아이디 찾기에 성공하셨습니다.<br>
	당신의 아이디는: <%= id %><br>
	<a href="login.jsp">로그인 페이지로</a>
 <% } %> 
 </div>
</body>
</html>