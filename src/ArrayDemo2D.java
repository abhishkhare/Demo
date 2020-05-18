
public class ArrayDemo2D {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 7, 8 };
		int c[] = { 9, 10, 11, 12 };

		int d[][] = {a,b,c};// 1d arrays added to 2d arrays;
		
		// 2D array initialized with values. 
		int e[][] = {

				{ 1, 2, 3, 4 }, { 13, 3, 4, 2 }, { 1, 3, 4, 54 } };

		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(" " + e[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
	}
}
