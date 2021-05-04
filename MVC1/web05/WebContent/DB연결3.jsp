<%@ page import="shop.MemberDB" %>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="shop.MemberVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 입력되서 전송된 데이터를 받는다.
            String id = request.getParameter("id");
            String pw = request.getParameter("pw");
            String tel = request.getParameter("tel");
    
			MemberVO bag = new MemberVO();
            
			bag.setID(id);
			bag.setPw(pw);
			bag.setTel(tel);
			
            MemberDB db = new MemberDB();
            db.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=id %>님의 패스워드가 <%= pw %>로, 전화번호가 <%= tel %>로 변경되었습니다.
</body>
</html>