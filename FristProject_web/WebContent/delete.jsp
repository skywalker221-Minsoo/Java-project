<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%  session.getAttribute("id");                    //세션 id 끌고와
	String id = (String)session.getAttribute("id");   //스트링 변수에 넣기
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
<h2>회원탈퇴</h2>
		<hr color="red">
		<form action="deleteDB.jsp">
		아이디: <input name="id" value="<%= id %>" readonly="readonly"><br>  <!-- id 값 넣기+ 읽기전용 -->
		<button type="submit">회원탈퇴</button><br>
		</form>
</div> 
</body>
</html>