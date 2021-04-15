<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	String company = request.getParameter("company");
    	String birth = request.getParameter("birth");
    	
    	
    	String email = request.getParameter("email");
    	
    	String card = request.getParameter("card");
    	String cardnum = request.getParameter("cardnum");
    	 //db전담하는 부품에서 db에 넣어달라고 할 예정.
    	 	//1. 가방을 만들어라!
           	MemberVO bag = new MemberVO();
           	//2. 가방에 넣어라!=>set메서드이용!
           	bag.setId(id);
           	bag.setPw(pw);
           	bag.setName(name);
           	bag.setCompany(company);
           	bag.setTel(tel);
           	bag.setBirth(birth);
           	bag.setEmail(email);
           	bag.setCard(card);
           	bag.setCardnum(cardnum);
            //db전담하는 부품에서 db에 넣어달라고 할 예정.
        MemberDB db = new MemberDB();
           	//db.create(id, pw, name, tel);
        db.create(bag);
    	  
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
회원가입이 완료되었습니다.
<a href="login.jsp">로그인 페이지로</a>             
</div> 
</body>
</html>