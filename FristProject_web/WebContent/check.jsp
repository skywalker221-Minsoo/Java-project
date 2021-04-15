<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //미리 객체를 생성해서 제공하고 있는 객체: 빌트인 객체(내장된 객체)
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
     
    MemberDB db = new MemberDB();
    boolean result = db.check(id, pw);
    //로그인이 성공을 한 경우, id를 사이트내 여러 페이지에서 쓸 수 있도록 설정
    //세션이 유지되는 동안 쓸 수 있도록 해야함
    if(result) {//boolean일 경우 비교 연산자 필요없음 그것만으로 판별가능
    	
    
    session.setAttribute("id", id);//값) //session은 브라우저 다 끌때 나가짐
	response.sendRedirect("movie_main.jsp");
    }
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
로그인 결과는 <%= result %><br>
<a href="login.jsp">로그인 페이지로</a>

</div>
</body>
</html>