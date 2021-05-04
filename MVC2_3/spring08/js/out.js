/*
 * 
 */
function add(x, y) {
	sum = x + y
	alert(sum + '최종 지불 금액을 더하는 처리함.')
	return sum
}

function minus(z) {
	if(z >= 500) {
		z = z - 100;
	}
	alert(z + '원 최종 지불 금액을 빼주는 처리함.')
}