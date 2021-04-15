<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
 	String id = request.getParameter("id");
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	직원정보 등록확인하는 화면<br>
	입력받은 정보는 <%= id%>입니다.
</body>
</html>