<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
 -->
 <script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
 <script type="text/javascript">
//버튼 하나당 함수(function) 하나로 정의한다.
   //버튼 클릭했을 때, => $('button').click()
   //id가 data인 input에 들어있는 value를 가지고와서, => 익명함수에 data = $('data').val()
   //출력
   $(function() {
      $('#button1').click(function() {
         data = $('#data').val()
         alert(data)
      })

      $('#button2').click(function() {
         data2 = $('#data2').val()
         alert(data2)
      })
   })
   
   
/*     $(function() {
       $('button').click(function() {
         dataTag = $('#data')
         dataValue = dataTag.val()
         alert(dataValue)
      }) //이름없는 함수 anonymous function $()하고, 안에다가 fun~자동완성
   }) */
 </script>
</head>
<body>
<input id="data" value="밥먹으러 가자!">
<button id="button1">뭐 할거니?</button> <!-- 버튼이 하나일때는 아이디를 굳이 안해줘도 됨 -->
<hr>
<input id="data2">
<button id ="button2">뭐 할거니?</button>
<hr>
</body>
</html>