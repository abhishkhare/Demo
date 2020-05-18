
public class PrintIncrementalAlphabets {

	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int j = 0;

			while (j <= i) {
				if(j==0)
				System.out.print("A");
				if(j==1)
					System.out.print("B");
				if(j==2)
					System.out.print("C");
				if(j==3)
					System.out.print("D");
				if(j==4)
					System.out.print("E");
				j++;
			}
			System.out.println();
		}
	}
}
