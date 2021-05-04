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
		$.ajax({
			url: "resources/team/MOCK_DATA.json",
			success: function(json) {
				list = json.items //items(key) : [](value)
				//alert('데이터개수 : ' + list.length + '개')
				
				$(json).each(function(index, rows) {
					console.log(index + ': ' + rows.CarModel + ', ' + rows.CarMake + ', ' + rows.CarMakeYear)
					CarModel = rows.CarModel
					CarMake = rows.CarMake
					CarMakeYear = rows.CarMakeYear
					a = '- <a href=' + CarModel + '>' + CarMake + '/' + CarMakeYear + '</a><br>'
					$('div').append(a)
				})
				//console.log($(list[0]).find('id').text())
				//console.log($(list[0]).find('last_name').text())
				//console.log($(list[0]).find('gender').text())
				//console.log($(list[0]).find('phone').text())
				//last_name, gender, phone
				/* for (var i = 0; i < list.length; i++) {
					console.log($(list[i]).find().text())
				} */
				
			}
		})
	})
})
</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
<div></div>
</body>
</html>