<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
     
    	session.getAttribute("id");
    	String id = (String)session.getAttribute("id");

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
	width: 300px;
	height: 30px;
	font-size: 30px;
	margin: 0 0 0 20px;
}

button {
	height: 50px;
	Width: 200px;
	font-size: 25px;
}

select {
	height: 50px;
	Width: 100px;
	font-size: 25px;

}
</style>
<title>Insert title here</title>
</head>
<body>
<div class="center">
<h2>회원정보 수정 화면입니다.</h2>
		<hr color="red">

		 <form action="수정db.jsp">
		 아이디: <input name="id" value="<%=bag.getId() %>"><br>
		 새 비밀번호: <input name="pw1" type="password"><br>
		 새 비밀번호 확인: <input name="pw2" type="password"><br> 
		 휴대폰 번호: <select name="company" >
		 	<option value="SKT"<% if(bag.getCompany().equals("SKT")) { %> selected<% } %> >SKT</option>  
		 	<option value="LG"<% if(bag.getCompany().equals("LG")) { %> selected<% } %> >LG</option>
		 	<option value="KT"<% if(bag.getCompany().equals("KT")) { %> selected<% } %> >KT</option>
		 </select>
		 <input name="tel" value="<%=bag.getTel()%>"><br>
		 이메일: <input name="email" value="<%=bag.getEmail()%>"><br>
		 
		 카드: <select name="card">
		 	<option value="hana"<% if(bag.getCard().equals("hana")) { %> selected<% } %>>하나</option>
		 	<option value="kb"<% if(bag.getCard().equals("kb")) { %> selected<% } %>>KB국민</option>
		 	<option value="sinhan"<% if(bag.getCard().equals("sinhan")) { %> selected<% } %>>신한</option>
		 	<option value="lotte"<% if(bag.getCard().equals("lotte")) { %> selected<% } %>>롯데</option> <!-- 이거 왜 이렇게 나오지?----------
		 	 -->
		 	<option value="bc"<% if(bag.getCard().equals("bc")) { %> selected<% } %>>BC</option>
		 	<option value="nh"<% if(bag.getCard().equals("nh")) { %> selected<% } %>>NH농협</option>
		 	<option value="sam"<% if(bag.getCard().equals("sam")) { %> selected<% } %>>삼성</option>
		 	<option value="hyun"<% if(bag.getCard().equals("hyun")) { %> selected<% } %>>현대</option>
		 </select>
		 카드번호: <input name="cardnum" value="<%=bag.getCardnum() %>"><br>
		 <button type="submit">수정 완료</button>

		 </form>
</div>
</body>
</html>