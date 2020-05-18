class A1 {
	public void show() {
		System.out.println("In A");
	}
}

class B1 extends A1 {
	@Override // Annotation - gives an error at compile time for override

	public void show() {
		//super.show();//Will call the method in super class as well.
		System.out.println("In B");
	}
}

class C1 extends A1 {
	public void show() {
		System.out.println("In C");
	}
}
public class MethodOverriding {
// Compile time and runtime polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 obj1 = new B1();
		obj1.show();
		
		A1 obj2 = new B1();//Object of B1 but reference of A1--
		//Methods of the object will be called rather than reference.
		obj2.show();
		// run time polymorphism : Which show method will be called 
		// will be decided at runtime as the object and reference is 
		// linked at the runtime
		obj2 = new C1();
		obj2.show();
		//Dynamic Method Dispatch 
		//Is achieved by using runtime polymorphism
		
	}

}
