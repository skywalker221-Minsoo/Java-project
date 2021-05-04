package 스태틱;

public class Recruitpeople {

	public static void main(String[] args) {
		
		Recruit man = new Recruit("홍길동", "남", 25);
		Recruit man2 = new Recruit("김길동", "여", 26);	
		Recruit man3 = new Recruit("송길동", "남", 27);
				
		System.out.println(man);
		System.out.println(man2);
		System.out.println(man3);
		System.out.println("직원의 수 : " + Recruit.count);
		
		Recruit.getAvg();

	}

}