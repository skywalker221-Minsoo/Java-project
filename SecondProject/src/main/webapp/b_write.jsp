<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
</head>
<body align = "center">
<h3> 구매후기글 작성 </h3>
<hr color="red">
<form action="b_write">
	
   아이디: <input type="text" name="bid"><br>
   제목: <input type="text" name="btitle"><br>
   <h2>내용</h2> 
		<textarea name = "bcontent" cols = "50" rows = "5"></textarea>
   <br>
   <input type="submit" value="작성완료">
</form>
</body>
</html>