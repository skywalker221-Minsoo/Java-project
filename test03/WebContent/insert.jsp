<%@ page import="pack03.BookDAO" %> <!-- DAO에 연결하여 sql의 insert into구문을 수행하도록 import를 해준다. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
            String id = request.getParameter("id");
            String title = request.getParameter("title");
            String story = request.getParameter("story");
            String company = request.getParameter("company");

            BookDAO db = new BookDAO();
            db.create(id, title, story, company);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>등록이 완료되었습니다.</h2>
	
	책을 삭제하고 싶으시다면, 다음 버튼을 눌러주세요.<br>
	<form action="책삭제.jsp">
		<button>책삭제</button><br>
	</form>
	다른 책을 등록하고 싶으시다면, 다음 버튼을 눌러주세요.<br>
	<form action="책등록.jsp">
		<button>책등록</button>
	</form>
</body>
</html>