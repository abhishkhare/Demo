//IS-A, HAS-A relation 

//CalcAdv IS-A extention of calculator
//InheritenceDemo HAS-A relation with CalcVeryAdv

class calculator { // super class
	public int add(int i, int j) {
		return i + j;
	}
}
class CalcAdv extends calculator //Sub class
{
	public int substract(int i, int j) {
		return i - j;
	}
}
class CalcVeryAdv extends CalcAdv // Sub-Sub class Multilevel inheritence
{
   public int multi(int i,int j)
   {
	   return i*j;
   }
}
public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalcVeryAdv obj = new CalcVeryAdv();

		//int result = obj.add(2, 1);
		System.out.println("Addition :" + obj.add(2, 1));
		System.out.println("Substraction :" + obj.substract(2, 1));
		System.out.println("Multiplication :" + obj.multi(2, 1));
	}

}
