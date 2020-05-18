// we cannot create object of a abstract class 
abstract class Human 
{
	public abstract void eat();// The class must be abstract 
	  // to create an abstract metnod
	
	public void walk()
	{
		
	}
}

class man extends Human{
	
	public void eat()
	{
		
	}
}

class printer {
	public void show(Integer i)
	{
		System.out.println(i);
	}
	public void show(Double i)
	{
		System.out.println(i);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human H1 = new man();
		
		printer obj = new printer();
		obj.show(5.5);
	}

}
