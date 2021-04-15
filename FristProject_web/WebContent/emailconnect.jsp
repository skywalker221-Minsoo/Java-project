<%@page import="DB.EmailDB"%>
<%@page import="DB.EmailVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
    			
    			// String id = (String) session.getAttribute("id");
                String id = request.getParameter("id");
                // String name = (String) session.getAttribute("name");
                String name = request.getParameter("name");
                String tel = request.getParameter("tel");
                String email = request.getParameter("email");
                String type = request.getParameter("type");
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                
                //1. 가방을 만들어라!
                EmailVO bag = new EmailVO();
              
                //2. 가방에 넣어라! => set메서드이용!                		
                bag.setId(id);
                bag.setName(name);
                bag.setTel(tel);
                bag.setEmail(email);
                bag.setType(type);
                bag.setTitle(title);
                bag.setContent(content);
                
                //db전담하는 부품에서 db에 넣어달라고 할 예정.
                EmailDB db = new EmailDB();
                db.create(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
Tel&nbsp;&nbsp; <%= bag.getTel() %><br><br>
Email&nbsp;&nbsp; <%= bag.getEmail() %><br><br>
Type&nbsp;&nbsp; <%= bag.getType() %><br><br>
Title&nbsp;&nbsp; <%= bag.getTitle() %><br><br>
Content&nbsp;&nbsp; <%= bag.getContent() %><br><br>
	<a href="emailcreate.jsp"><button type="button">게시글 등록</button></a>&nbsp;&nbsp;
	<a href="emailread.jsp"><button type="button">게시글 검색</button></a>&nbsp;&nbsp;
	<a href="emailupdate.jsp"><button type="button">게시글 수정</button></a>&nbsp;&nbsp;
	<a href="emaildelete.jsp"><button type="button">게시글 삭제</button></a>&nbsp;&nbsp;
</body>
</html>