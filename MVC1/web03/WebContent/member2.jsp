
<%@ page import="shop.영화DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 1. 입력한 값 서버에서 받아와야 함. -->
<%
	// HttpServletRequest request = new HttpServletRequest();
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String company = request.getParameter("company");
	String gender = request.getParameter("gender");
	String word = request.getParameter("word");
	String[] hobby = request.getParameterValues("hobby"); //가지고온 값이 여러개일 때 {"취미1","취미2"}
	String result = "";
	for (String x : hobby) {
		result = result + x + " ";
	}
%>
<!-- 2. 입력한 값 db처리 전담하는 클래스한테 맡겨야 함. create! 하라고 명령해야 함. -->
<%
	영화DB db = new 영화DB();
	db.create();
%>
<!-- 3. 회원가입 처리 결과 알려줌. 클라이언트 : html -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>당신의 회원정보를 확인해주세요.</h3>
		<hr color="red">
		당신이 입력한 id : <%= id %> <br>
		당신이 입력한 pw : <%= pw %> <br>
		당신이 입력한 name : <%= name %> <br>
		당신이 입력한 tel : <%= tel %> <br>
		당신이 입력한 gender : <%= gender %> <br>
		당신이 선택한 company : <%= company %> <br>
		당신이 입력한 word : <%= word %> <br>
		당신이 선택한 hobby : <%= result %> <br>
	</body>
</html>