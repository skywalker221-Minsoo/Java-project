<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() { 
   $('#b2').click(function() {
      alert('b2버튼을 클릭함.!!!')
      $.ajax({
         url: "all2",
         success: function(result) {
            alert('all2연결 성공.!!!!')
            console.log('결과는 ' + result)
            $(result).each(function(index, vo) {
               console.log(index, vo)
            })
         },
         error: function() {
            alert('all2연결 실패.!!!!')
         } 
      })
   }) //b1
   $('#b1').click(function() {
      alert('b1버튼을 클릭함.!!!')
      $.ajax({
         url: "all2",
         success: function(result) {
            alert('all2연결 성공.!!!!')
            console.log('결과는 ' + result)
         },
         error: function() {
            alert('all2연결 실패.!!!!')
         } 
      })
   }) //b1
   
}) //start
</script>
</head>
<body>
   <button id="b1">string으로 controller에서 받아보자.</button><br>
   <button id="b2">json으로 받아보자</button><br>
</body>
</html>





