<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String company = request.getParameter("company");
	String tel = request.getParameter("tel");
	
	MemberDB db = new MemberDB();
   
    
    boolean result = db.check3(id, name, company, tel);
    
    

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

</style>
<title>Insert title here</title>
</head>
<body>
<div class="center">
<% if (result) {%>
 		 <form action="newPw.jsp">
 	 아이디: <input name = "id" value="<%= id%>" readonly="readonly"><br>
	 새 비밀번호: <input name="pw1" type="password"><br>
 	 새 비밀번호 확인: <input name="pw2" type="password"><br>
 	 <button type="submit">설정 완료</button>
  </form><% } else {%>
 	 비밀번호 찾기에 실패하셨습니다.
 	 <a href="login.jsp">로그인 페이지로</a>
 	 <a href="findPw.jsp">비밀번호 찾기 페이지로</a>
 	                                            
 	 
 <%} %>
</div>
</body>
</html>