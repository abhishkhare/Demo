class addition {
	int n1; 
	int n2;
	String s1; 
    //Method overloading
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	public void add(double i, double j) {
		System.out.println(i + j);
	}
	
	//Constructor overloading 
	public addition()
	{
		n1=0;
		n2=1;
        s1="Nothing";
	}
	public addition(int i, int j)
	{
		n1=i;
		n2=j;
	}
	public addition(int i, int j, String k)
	{
		n1 = i;
		n2 = j;
		s1 = k;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {

		addition obj = new addition();

		obj.add(1, 2);
		obj.add(1, 2, 3);
		obj.add(1.3, 1.2);
	}

}
