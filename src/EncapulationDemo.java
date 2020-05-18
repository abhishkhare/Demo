//Encapsulation - Binding data with methods

class student1
{
	private int rollno;
	private String name;
	 // Setter 
	 public void setRollNo(int r)
	 {
		 rollno = r;
	 }
	 // Getter 
	 public int getRollno()
	 {
		 return rollno;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
}
public class EncapulationDemo {

	public static void main(String[] args)
	{
	   student1 s1 = new student1();
	   s1.setRollNo(2);
	   s1.setName("Modi");
	   System.out.println(s1.getRollno());
	   System.out.println(s1.getName());

	}

}
