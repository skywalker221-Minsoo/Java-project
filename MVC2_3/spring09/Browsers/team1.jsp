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
			url: "resources/team/dataset.xml",
			success: function(xml) {
				alert('xml연결 성공!')
				list = $(xml).find('record')
				console.log('레코드의 개수 => ' + list.length)
				//console.log($(list[0]).find('id').text())
				//console.log($(list[0]).find('last_name').text())
				//console.log($(list[0]).find('gender').text())
				//console.log($(list[0]).find('phone').text())
				//last_name, gender, phone
				/* for (var i = 0; i < list.length; i++) {
					console.log($(list[i]).find().text())
				} */
				$(list).each(function(index, record) {
	                  console.log(index + ": " + $(record).find("CarMake").text())
	            })
			}
		})
	})
	
	$('#b2').click(function() {
		$.ajax({
			url: "resources/team/MOCK_DATA.json",
			success: function(json) {
				alert('json연결 성공!' + json.length)
				$(json).each(function(index, rows) {
					//console.log(index + ': ' + rows.CarModel)
					id = rows.id
					CarMake = rows.CarMake
					CarModel = rows.CarModel
					CarMakeYear = rows.CarMakeYear
					console.log(id, CarModel, CarMake, CarMakeYear)
				})
			}
		})
	})
})
</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
</body>
</html>