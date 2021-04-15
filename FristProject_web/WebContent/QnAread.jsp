<%@page import="DB.QnADB"%>
<%@page import="DB.QnAVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	int no = Integer.parseInt(request.getParameter("no")); 
		QnADB db = new QnADB();
		QnAVO bag = db.read(no);
		db.update(no);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>자주 찾는 질문<br></h2>
	<h3>고객분들께서 자주 하시는 질문을 모았습니다.</h3>
	<table border="1">
	<tr>
		<td width="700"><%= bag.getType() %>&nbsp;&nbsp;<%= bag.getTitle()%></td>
	</tr>
	<tr>
		<td width="700" height="300"><%= bag.getContent() %></td>
	</tr>
	</table>
	<a href="QnAmain.jsp"><button type="button">뒤로가기</button></a>&nbsp;&nbsp;
</body>
</html>