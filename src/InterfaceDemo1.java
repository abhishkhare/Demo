// Abstract Class - Define and declare method
// Interface -> Declare -> 1.7 
// 1.8 can define methods in interface

interface demo
{
	void abc();
	default public void show() // using default keyword we can define a method
	{
		System.out.println("In Show");
	}
	
}

class DemoImp implements demo 
{
	public void abc()
	{
		System.out.println("In abc");
	}
	public void show()
	{
		System.out.println("In new Show");// Methods can be overriden from interface 
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo obj = new DemoImp();
		obj.abc();
		obj.show();
	}

}
