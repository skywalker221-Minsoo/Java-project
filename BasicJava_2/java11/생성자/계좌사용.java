package 생성자;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 deposit = new 계좌("홍길동", "튼튼적금", 1000);
		계좌 deposit2 = new 계좌("박길동", "튼튼예금", 2000);
		계좌 deposit3 = new 계좌("홍기사", "다음적금", 3000);
		
		System.out.println(deposit);
		System.out.println(deposit2);
		System.out.println(deposit3);
		

	}

}
