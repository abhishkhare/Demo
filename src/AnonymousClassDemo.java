class Ak {
	public void show() {
		System.out.println("This is Abhi");
	}
}

class sp extends Ak {
	public void show() {
		System.out.println("In a Shriti");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ak obj = new Ak() // Anonymous class: only used to override methods
				{
			       	   public void show()
			    		 {
			    			 System.out.println("In a show");
			    		 }
				};
	}

}
