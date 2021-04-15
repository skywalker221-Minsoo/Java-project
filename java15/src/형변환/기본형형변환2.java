package 형변환;

public class 기본형형변환2 {

	public static void main(String[] args) {
		
		int sum = 333;
		int count = 5;
		//평균을 내는 경우, 하나라도 double이면
		//결과는 double이다.
		double a = (double)sum/count;
		//333을 333.0, 333.0 / 5 = 66.6
		double b = (double)(sum/count); //정수끼리의 계산은 무조건 int!
		//333/5 = 66 ---> 66.0 
		//정수끼리의 계산을 먼저해서 double로 형변환을 하자!
		//6.0 <--- (double)6
		System.out.println(a);
		System.out.println(b);

	}

}
