package 클래스사용;

import 클래스만들기.TV;

public class TV사용 {

	public static void main(String[] args) {
		//마우스올려서 import 선택(f2)
		//자동완성
		//Ctrl+Shift+o
		TV myTV = new TV();
		//yourTV.on(); : 생성되지 않은 yourTV변수를 사용해서 에러!
		myTV.ch = 7;
		myTV.vol = 9;
		myTV.onOff = true;
		System.out.println(myTV);
		
		TV yourTV = new TV();
		yourTV.ch = 9;
		yourTV.vol = 12;
		yourTV.onOff = false;
		System.out.println(yourTV);
	}

}
