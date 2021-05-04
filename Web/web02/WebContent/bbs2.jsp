  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    String id = request.getParameter("id"); // t1.gettext(); 과 동일하다.
    String pw = request.getParameter("pw"); // t1.gettext(); 과 동일하다.
    String content = request.getParameter("content"); // t1.gettext(); 과 동일하다.
    String writer = request.getParameter("writer"); // t1.gettext(); 과 동일하다.
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>정보 입력이 완료되었습니다.</h3>
<hr>
입력한 id = <%=id%> <br>
입력한 pw = <%=pw%> <br>
입력한 content = <%=content%> <br>
입력한 writer = <%=writer%> <br>
<a href="bbs.html">정보입력 화면으로</a>
</body>
</html>