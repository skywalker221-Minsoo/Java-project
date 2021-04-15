package java09;

public class 우리가족계좌정보 {

	public static void main(String[] args) {
		계좌정보 father = new 계좌정보();
		계좌정보 son = new 계좌정보();
		계좌정보 daughter = new 계좌정보();
		
		father.name = "홍길동";
		son.name = "박길동";
		daughter.name = "홍기사";
		
		father.deposit_name = "튼튼적금";
		son.deposit_name = "튼튼예금";
		daughter.deposit_name = "다음적금";
		
		father.money = 1000;
		son.money = 2000;
		daughter.money = 3000;
		
		System.out.println("우리 가족 계좌정보");
		System.out.println("------------");
		System.out.println("이름 " + " 계좌이름 " + " 금액");
		System.out.println(father.name + " " + father.deposit_name + " " + father.money);
		System.out.println(son.name + " " + son.deposit_name + " " + son.money);
		System.out.println(daughter.name + " " + daughter.deposit_name + " " + daughter.money);
		
		father.deposit("출금");
		daughter.withdraw("입금");
	}

}
