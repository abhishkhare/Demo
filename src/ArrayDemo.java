class student
{
	int rollno;
	String name;
}


public class ArrayDemo {

	public static void main(String[] args) {

		int num[] = new int[4];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 3;
		
		for(int i = 0; i<4;i++)
		{
		  System.out.println(num[i]);
		}
		
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		
		student s[] = new student[4];
	//	student st[] = {s1,s2,s3};// Array of student class objects
	}

}
