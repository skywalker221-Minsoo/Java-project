package 상속;

public class 영화에출연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		수퍼맨 sMan = new 수퍼맨();
		sMan.name = "클라크"; //사람
		sMan.age = 30000; //사람
		sMan.speed = 1000; //맨
		sMan.fly = true; //수퍼맨
		
		sMan.먹다(); //사람
		sMan.달리다(); //맨
		sMan.우주를날다(); //수퍼맨
		System.out.println(sMan);
		
		원더우먼 sWoman = new 원더우먼();
		sWoman.name = "다이애나";
		sWoman.age = 30;
		sWoman.fight = 3000;
		sWoman.fly = true;
		
		sWoman.먹다();
		sWoman.싸우다();
		sWoman.하늘을날다();
		System.out.println(sWoman);
	}

}
