package JavaPlacement;

public class FactorialOfGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fact=1;
		System.out.println("Factorial of"+num+"is");
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;//i*1=1,2*1=2,3*2=6,4*6=24,5*24=120
		}
		System.out.println(fact);

	}

}
//5*4*3*2*1