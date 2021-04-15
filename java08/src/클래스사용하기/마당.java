package 클래스사용하기;

import 클래스만들기.강아지;

public class 마당 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		강아지 dog1 = new 강아지();
		강아지 dog2 = new 강아지();
		// dog1, dog2에는 주소가 들어가 있음.
		// new를 할때마다 멤버변수, 불러오는 함수가 만들어진다. (ex) 멤버변수 총 3개 + 해당 함수 1개(변수를 가르키고 있는 주소) = 4개가 주소 4개에 저장된다.)
		
		
		dog1.color = "갈색";
		// public으로 선언하지 않으면 다른 패키지에서
		// not visible
		dog1.type = "진돗개";
		dog1.yall();
		
		dog2.color = "흰색";
		dog2.type = "비숑";
		dog2.walk();
	}	

}
