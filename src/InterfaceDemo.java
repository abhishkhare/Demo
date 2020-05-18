//API - Appalication Programming Interface
//Types of Interface 
//1. Normal : Has more than one method
//2. Single Abstract method : Has only one method. // In Java 8 called as Funcional interface : Lambda Ecpression : Scala 
//3. Marker Interface : Does not have any method. 

@FunctionalInterface // Annotation 
interface Abc {
	void show();
}

class Implementor implements Abc {
	public void show() {
		System.out.println("InterfaceDemo");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc obj = new Implementor();
		obj.show();
	
		Abc obj1 = () -> System.out.println("Lambda Expression");// Lambda expression (->) used to define methods in functional interface
	    obj1.show();
	}

}
