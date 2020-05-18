class outer {

	int a;

	public void show() 
	{

	}

   static class Inner //outer$inner.class
	{
		public void display() {
			System.out.println("In Display");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {

		outer obj = new outer();
		obj.show();

		//outer.Inner obj1 = obj.new Inner(); // Normal inner class creation
		
	    outer.Inner obj2 = new outer.Inner(); // Static inner class object creation
		
	//	obj1.display();
		obj2.display();
	}

}
