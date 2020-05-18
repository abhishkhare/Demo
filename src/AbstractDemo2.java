class pen 
{
   public void write()
   {
	   System.out.println("In a Pen");
   }
}
class pencil 
{
	public void write()
	   {
		   System.out.println("In a Pencil");
	   }
	
}

class kit
{
   public void doSomething(pen p)
   {
	   p.write();
   }
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kit k = new kit();
		pen p = new pen();
		
		k.doSomething(p);
		 
	}

}
