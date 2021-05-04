package 이너클래스복습;

import javax.swing.JLabel;

import 이너클래스복습.ThreadGraphic3.count2;
import 이너클래스복습.ThreadGraphic3.day2;
import 이너클래스복습.ThreadGraphic3.image2;

public class ThreadUse { //InnerClass 쓰는 이유 : Class가 멤버변수를 공유할 목적!!!
						 //Thread도 멤버변수를 공유한다!!

	public static void main(String[] args) {

		ThreadGraphic3 t = new ThreadGraphic3();
		
		//count2 c = new count2(t.count); //외부 Class 쓸 때 쓰자..
		//day2 d = new day2(t.day);
		//image2 e = new image2(t.image);
		
		//c.start();//카운트, 날짜, 이미지 동시 실행.
		//d.start();
		//e.start();
	}

}
