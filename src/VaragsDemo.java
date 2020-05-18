class calcu
{
	public int add (int ... n)//Variable arguments passed
	{
		int sum = 0;
		
		for (int i=0; i<n.length;i++)
		{
			sum = sum +n[i];
		}
		return sum;
	}
}
public class VaragsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcu obj = new calcu();
		System.out.println(obj.add(2,2,3,3));
		
	}

}
