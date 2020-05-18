
public final class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[] = {1,2,3};
		
		int b[][] = {

		{ 1, 2, 3, 4 }, { 13, 3, 4, 2 }, { 1, 3, 4, 54 } };

		
		for(int k:a)//Enhanced for loop for 1d arrays
		{
			System.out.print(" "+k);
		}

		System.out.println();
		for (int j[]:b)// Enhanced for loop for 2D array
		{
			for(int x:j)
			{
				System.out.print(" " + x);
			}
			System.out.println();
		}
	}

}
