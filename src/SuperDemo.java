//WHenever you create object of a sub class constructor
//of super class will also be called.
//
//
class A
{
	public A()
	{
		System.out.println("In A");
	}
	public A(int i)
	{
		System.out.println("In A int");
	}
}
class B extends A
{
	 public B()
	 {
		 super();//This will be there by default even if not mentioned.
		 System.out.println("In B");
	 }
	 public B(int i)
		{
		    super(i);// This will help call the parametrized constructor of the super class
			System.out.println("In B int");
		}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 B obj1 = new B();
		 
	}

}
