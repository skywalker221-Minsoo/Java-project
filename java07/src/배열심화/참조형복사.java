package 배열심화;

public class 참조형복사 {

   public static void main(String[] args) {
      int[] x = {100, 200, 300};
      //x: 주소(참조형)
      //x에 들어있는 주소로 각 값들을 인덱스로 접근!하게 됨.
      //System.out.println(x.length); //읽기 전용 변수 length가 생김
      //int[] y = x; //배열의 주소만 복사=> 얕은 복사
      int[] y = x.clone(); //배열의 주소가 가르키는 값들의 목록을 복사
      //=> 깊은 복사
      System.out.print("변경전 x: ");
      for (int a : x) {
         System.out.print(a + " ");
      }
      System.out.println();
      
      System.out.print("변경전 y: ");
      for (int a : y) {
         System.out.print(a + " ");
      }
      
      System.out.println("\n---------");
      x[0] = 999;
      System.out.print("변경후 x: ");
      for (int a : x) {
         System.out.print(a + " ");
      }
      System.out.println();
      
      System.out.print("변경후 y: ");
      for (int a : y) {
         System.out.print(a + " ");
      }
      
      
      

   }

}