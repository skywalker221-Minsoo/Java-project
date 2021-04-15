package 클래스사용;

import java.util.Date;

public class 반환값연습 { // return 되는 type을 써주어야 한다!!

	public void add2() {
		System.out.println("더하기 기능 수행");
	}

	public int add(int x, int y) {
		return x + y;	
	}

	public double add(double x, int y) {
		return x + y;
	}

	public String add(String x, String y) {
		return x + y;
	}

	public String add(int x, String y) {
		return x + y;
	}

	public int[] add() {
		int[] x = {1, 2, 3};
		return x;
	}
	
	public Date getDate() {
		Date date = new Date();
		return date;
	}
}
