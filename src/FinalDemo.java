//Final keyword Can be used with variable ,method, class

final class A2 // A final class cannot be extended.
{
  final int i = 0; //The value cannot be changed
  // it beceomes a constant, example pi, which will never change
  //Capital letters are used for constant
  public A2()
  {
	//  i=10;
  }
  
  public final void show()// A final method cannot be overridden by sub class methods.
  {
	  System.out.println("In Show");
  }
}
//class B1 extends A2
//{
//	
//}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  A2 obj = new A2();
		  System.out.println(obj.i);
	}

}
