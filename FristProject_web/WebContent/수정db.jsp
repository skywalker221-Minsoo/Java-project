<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
  	String id = request.getParameter("id");
	String pw1 = request.getParameter("pw1");
	String pw2 = request.getParameter("pw2");
	String company = request.getParameter("company");
	String tel = request.getParameter("tel");
	String email = request.getParameter("email");
	String card = request.getParameter("card");
	String cardnum = request.getParameter("cardnum");
    
	MemberVO bag = new MemberVO();
	
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

a {
	height: 50px;
	Width: 200px;
	font-size: 25px;
}

</style>
<title>Insert title here</title>
</head>
<body>
<div class="center">
<% if (pw1.equals(pw2)) {
	bag.setId(id);
	bag.setPw(pw1);
	bag.setCompany(company);
	bag.setTel(tel);
	bag.setEmail(email);
	bag.setCard(card);
	bag.setCardnum(cardnum);
	MemberDB db = new MemberDB();
	db.update(bag);
	%> 	수정 완료되었습니다.<br>
	<a href="movie_main.jsp">메인 페이지로</a>
	<% }  else { %>
		두 비밀번호가 다릅니다.<br>
	<a href="movie_main.jsp">메인 페이지로</a>
  <% 	} %>
	
</div>
</body>
</html>