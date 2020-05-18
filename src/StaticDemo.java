//a static variable is the same for all objects, 
class employee {
	int eid;
	int salary;
	static String ceo;
	
	static { //will be loaded every time the class is called unlike constrcter 
		ceo = "Abhishek";
	}
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}		
}
public class StaticDemo {

	public static void main(String[] args) {
		employee abhishek = new employee();
		employee shriti = new employee();
		
		abhishek.eid= 1; 
		abhishek.salary = 7000;
		abhishek.ceo = "Satya";
		
		shriti.eid= 2;
		shriti.salary=6000;
		shriti.ceo="Sundar";//static variable can be accessed using an object
		
		employee.ceo = "Baba";//static variable can be accessed using class name  
		abhishek.show();
		shriti.show();
	}

}
