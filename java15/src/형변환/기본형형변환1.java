package 형변환;

public class 기본형형변환1 {

	public static void main(String[] args) {
		//정수:
		//byte(1, -128~127) 256
		//short(2, -3만~3만) 65536
		//int(4, -21억~21억)
		//long(8, 그 이상)
		
		byte x = 100;
		int y = x; //기본형 복사
		//x에 들어있던 100이라는 값이 y에 들어갈 수 있도록
		//자동으로 int 타입으로 변환되어 들어간다.
		//자동형변환(int(큰) <---- byte(작))
		
		byte z = (byte)y; //기본형 복사
		//y에 들어있던 100값이 z에 들어갈 수 있도록
		//강제로 byte타입으로 변환시켜 들어가야한다.
		//강제형변환(byte(작) <---- int(큰))
		
		//강제형변환은 잘라서 집어넣을 작은 범위에서 허용한 값만 가능하다.
		int x1 = 1000;
		byte y1 = (byte)x1; //byte로 casting 해줘도 불가능하다!! 만약, 127 아래 숫자라면 가능.ㄱ
		System.out.println(y1); //뽑아보면 음수(보수처리가 되나보다.)
	}

}
