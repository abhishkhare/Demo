/* Print increasing stars*/

public class PrintDecrementalStars {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			int j = 5;

			while (j >= i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
		}
		System.out.println("Completed");
	}
}