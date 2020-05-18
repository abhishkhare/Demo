
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int i=5; //Primitive datatype
		  Integer ii = new Integer(i); // Wrapper Class - Boxing
		  int j = ii.intValue();// Unboxing unrapping
		  
		  Integer value = i;// Auto boxing - auto wrapping
		  
		  int k = value; // Auto unboxing
		  
		  String str = "123";
		  int n = Integer.parseInt(str);
		  System.out.println(n);
		  
	}

}
