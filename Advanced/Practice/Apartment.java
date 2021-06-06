package Practice;

public class Apartment {

	public static void main(String[] args) {
		
		int[][] apart = new int[4][6];

		for (int i = apart.length; i > 0; i--) {
			for (int j = 1; j < apart[i-1].length + 1; j++) {
				apart[i-1][j-1] = 100 * i + j;
				
				if (apart[i-1][j-1] % 2 == 0) {
					System.out.print(apart[i-1][j-1] + "(o) ");
				}
				else {
					System.out.print(apart[i-1][j-1] + "(x) ");
				}
			}
			System.out.println();
		}
	}  
}