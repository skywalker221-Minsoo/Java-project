<%@page import="DB.EmailDB"%>
<%@page import="DB.EmailVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
                String tel = request.getParameter("tel");
                String email = request.getParameter("email");
                String type = request.getParameter("type");
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                
                //1. 가방을 만들어라!
                EmailVO bag = new EmailVO();
                
                //2. 가방에 넣어라! => set메서드 이용!
                bag.setTel(tel);
                bag.setEmail(email);
                bag.setType(type);
                bag.setTitle(title);
                bag.setContent(content);
                
                //db전담하는 부품에서 db에서 수정할 예정.
                EmailDB db = new EmailDB();
                //db.update(id, pw, tel);
                db.update(bag);
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
[전화번호]가 "<%= tel %>", [이메일 주소]가 "<%= email %>"로 <br>
[문의유형]이 "<%= type %>"으로&nbsp;&nbsp; [제목]이 "<%= title %>"로&nbsp;&nbsp; [내용]이 "<%= content %>"로 변경되었습니다. <br><br>

	<a href="emailcreate.jsp"><button type="button">게시글 등록</button></a>&nbsp;&nbsp;
	<a href="emailread.jsp"><button type="button">게시글 검색</button></a>&nbsp;&nbsp;
	<a href="emailupdate.jsp"><button type="button">게시글 수정</button></a>&nbsp;&nbsp;
	<a href="emaildelete.jsp"><button type="button">게시글 삭제</button></a>&nbsp;&nbsp;
</div>
</body>
</html>