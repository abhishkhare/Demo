class calc {

	int num1;
	int num2;
	int result;

	public void addition() {
		result = num1 + num2;
	}
}

public class CreateObject {

	public static void main(String[] args) {
		calc obj;
		obj = new calc();
		obj.num1 = 1;
		obj.num2 = 2;
		obj.addition();
		System.out.println("Sum is " + obj.result);
	}
}
