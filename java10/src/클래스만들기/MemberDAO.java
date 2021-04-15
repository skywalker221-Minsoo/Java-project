package 클래스만들기;

public class MemberDAO {
   //전역변수, 자동초기화
   //참조형변수는 무조건 null로 초기화!
   //url: 멤버변수, 전역변수(<->지역변수), 참조형변수(<->기본형변수)
   String url = "jdbc:mysql://localhost:3306/shop";
   String user = "root";
   String password = "1234";
   
   //자바는 메서드 이름을 똑같이 쓸 수 있음.
   //메서드의 구분은 입력값에 따라서 하기 때문이다!
   //하나의 이름으로 여러가지 형태의 메서드를 정의하여 호출할 수 있는 기능
   //오버로딩(다(양한) 형(태) 성)
   public void create(String id, String pw, String name) {
      //id, pw, name: 지역변수(local변수)
      System.out.println("당신이 입력한 id는 " + id);
      System.out.println("당신이 입력한 pw는 " + pw);
      System.out.println("당신이 입력한 name는 " + name);
   }
   
   public void create(String id, String pw, String name, String tel) {
	   //id, pw, name: 지역변수(local변수)
	   System.out.println("당신이 입력한 id는 " + id);
	   System.out.println("당신이 입력한 pw는 " + pw);
	   System.out.println("당신이 입력한 name은 " + name);
	   System.out.println("당신이 입력한 tel은 " + tel);
   }
   
   public void create(String id, String pw) {
	   //id, pw, name: 지역변수(local변수)
	   System.out.println("당신이 입력한 id는 " + id);
	   System.out.println("당신이 입력한 pw는 " + pw);
   }
   
   public void delete(String id) {
      //System.out.println(name);
      //지역변수라서 다른 메서드에서 접근 불가
      System.out.println("당신이 입력한 id는 " + id);
   }
   
   @Override
	public String toString() {
		return "MemberDAO [url=" + url + ", user=" + user + ", password=" + password + "]";
	}
}