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
	$('#b1').click(function() {
		$.ajax({
			type: 'POST',
         	beforeSend : function(xhr) {
            	xhr.setRequestHeader("Authorization", "KakaoAK 2644b6a83c3ca84cae5c69c7d4258efc")
            	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded")
            },
            url: "https://dapi.kakao.com/v2/vision/adult/detect",
            data: {
            	image_url: "https://img.hankyung.com/photo/202006/03.11538443.1.jpg"
            },
            success: function(x) {
            	rest = x.result
            	items = []
            	$(rest).each(function(index, item) {
               		items.push(item.normal)
               		items.push(item.soft)
               		items.push(item.adult)
				})
            	alert('연결 성공 ' + items)
            } //success
         }) //ajax
      })//b1

	$('#b2').click(function() {
		$.ajax({
			type: 'POST',
         	beforeSend : function(xhr) {
            	xhr.setRequestHeader("Authorization", "KakaoAK 2644b6a83c3ca84cae5c69c7d4258efc")
            	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded")
            },
            url: "https://dapi.kakao.com/v2/vision/product/detect",
            data: {
            	image_url: "https://static.hubzum.zumst.com/hubzum/2019/01/08/11/f6bd70a51fda4aafbf9563dadf2d82fd.jpg"
            },
            success: function(x) {
            	list = x.result.objects
            	items = []
            	$(list).each(function(index, item) {
               		items.push(item.class)
				})
            	alert('연결 성공 ' + items)
            } //success
         }) //ajax
      })//b1
})//$fun
</script>
</head>
<body>
<button id="b1">JSON문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
</body>
</html>