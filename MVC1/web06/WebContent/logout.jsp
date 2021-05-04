<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 설정한 여러 세션값들 중 하나만 제거하는 경우
    session.removeAttribute("id"); 
    
    // 세션 자체를 끊어버리는 경우
    session.invalidate();
    
    // 서버가 브라우저에 무언가를 명령할 떄 사용하는 내장형 객체
    // request : 브라우저가 서버에 요청한 값을 받을 때, response : 서버가 브라우저 한테 요청할 때
    // 1)쿠키 심을 떄, 특정한 페이지를 요청할 때
    response.sendRedirect("check.jsp");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>