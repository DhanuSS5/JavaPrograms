package JavaPlacement;
//import java.util.Scanner;

public class SwapUsingTempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int a=10;
		int b=20;
		System.out.println("Before Swap");
		System.out.println("****************************");
		System.out.println("The value of a="+a+ "b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println("***************************");
		System.out.println("The value of a="+a+"b="+b);
		

	}

}
