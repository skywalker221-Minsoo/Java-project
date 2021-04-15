package 스태틱;

public class DayUse {

	public static void main(String[] args) {
		Day d1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count); //대문자로 쓰는건 다 Static 
		Day d2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		Day d3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);

		System.out.println("전체 하는 일의 시간은 : " + Day.sum + "시간");
		System.out.println("평균 하는 일의 시간은 : " + (double)Day.sum / Day.count + "시간");
		System.out.println("매일 무엇을 얼마나 어디에서 했는지 프린트 : " + d1);
		System.out.println("매일 무엇을 얼마나 어디에서 했는지 프린트 : " + d2);
		System.out.println("매일 무엇을 얼마나 어디에서 했는지 프린트 : " + d3);
		
		System.out.println("며칠 간 했는지? : " + Day.count + "일");		
	}

}