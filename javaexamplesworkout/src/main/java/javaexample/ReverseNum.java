package javaexample;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int temp=num;
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse of"+temp+"is"+sum);

	}

}
