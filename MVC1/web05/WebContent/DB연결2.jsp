<%@ page import="shop.MemberDB" %>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 입력되서 전송된 데이터를 받는다.
            String id = request.getParameter("id");

            // db전담하는 부품에서 db넣어달라고 할 예정.
            MemberDB db = new MemberDB();
            db.delete(id);
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