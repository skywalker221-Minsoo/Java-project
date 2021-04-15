<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
  /*  $(function() { //익명함수로 실행
         $('button').click(function() {
         
         dataTag = $('#data')
         datavalue = dataTag.val()
         alert(datavalue)
      })
   }) */
   
   //버튼을 클릭했을때 data에 들어있는 value를 가지고 와서 출력
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
</script>
</head>
<body>
<input id="data" value="밥먹으로 가자!">
<button id="button1">뭐할꺼니??</button>
<hr>
<input id="data2" value="아무데나가자!">
<button id="button2">오늘 끝나고 어디로 갈까? </button>
</body>
</html>