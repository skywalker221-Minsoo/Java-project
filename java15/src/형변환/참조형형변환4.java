package 형변환;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class 참조형형변환4 {

	public static void main(String[] args) {
		//객체설계할 때 2대 원칙
		//하나의 클래스 안에는 하나의 역할만을 정의해야 한다.: 응집도(cohesion) 높게
		//결합시 특정한 클래스만 지정하여 설계하면 안된다.: 결합도(coupling) 낮게
		
		맨 toman = new 맨(); //비권장
		//하나의 이름으로 다양한 형태를 구현하여 사용하는 자바의 이 특징 : 다형성
		//자동형변환으로 가능, 오버로딩
		사람 toman2 = new 맨(); //권장하는 코드
		toman2 = new 우먼();
		toman2 = new 수퍼맨();
		//결합도가 낮은 코드는 유지보수하기도 좋고, 더 좋은 성능을 가진 클래스로 변경도 용이하다!
		//작업양도 줄어든다.
		
		ArrayList list2 = new ArrayList();
		
		List list = new ArrayList();
		list = new LinkedList();
	}

}
