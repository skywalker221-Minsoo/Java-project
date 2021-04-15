package java09;

public class 카페에서계산기사용 {

	public static void main(String[] args) {
		int coffeePrice = 4600;
		int juicePrice = 4000;
		
		int coffeeCount = 5;
		int juiceCount = 3;

		계산기 cal = new 계산기();
		cal.add(coffeeCount, juiceCount); // 몇잔 주문했을까요?
		
		
		int coffee = cal.mul(coffeePrice, coffeeCount); // 합계 얼마일까요?
		int juice = cal.mul(juicePrice, juiceCount);
		
		int final_result = cal.add(coffee, juice);
		System.out.println(final_result);
		
		int hour = cal.getHour();
		System.out.println("현재 시각은 " + hour);
	}
	
}
