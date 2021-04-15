<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">

$(function() {
	
	$("#s_button").click(function(){
		$.ajax({
			url: "b_search",
			data : {
				s_field : $('#s_field option:selected').val(),
				s_word : $('#s_word').val()
			}, //data
			success: function(x) {
				alert(x)
			}, // success
			error: function() {
				alert("검색실패")
			} //error
			
		}) //ajax
		
	}) //s_button
	
}) //root


</script>

</head>
<body>
<h3> 구매후기 게시판 </h3>
<hr>
${user_id} 환영합니다.
<hr>

<!-- java의 핵심적인 문법은 tag로 편하게 쓰자 -->
<!-- jstl: java standard tag library -->
<p>검색 : <input type ="text" id ="s_word">

<select id = "s_field">
	<option value="s_title" selected>제목</option>
	<option value="s_content">내용</option>
	<option value="s_writer">작성자</option>
	<option value="s_comment">댓글내용</option>
</select>

<button type="button" id="s_button">찾기</button><p>


<hr>
<c:forEach var="vo" items="${list}">
게시물 번호 ${vo.bno}<br>
게시물 작성자 ${vo.bid}<br>
게시물 제목 <a href = "b_read?bno=${vo.bno}">${vo.btitle}</a><br>
<!-- 게시글 제목에 컨트롤러 b_read 로 태그를 걸어줬음. -->
게시물 작성일자 ${vo.bdate2}<br>
게시물 추천수 ${vo.blike}<br>
게시물 조회수 ${vo.bviews}<br>
<hr>
</c:forEach>
</body>
</html>