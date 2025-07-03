package javaexample;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int temp=num;
		int rem=0,sum=0;
		while(num>0)
		{
			rem=(num%10);
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(num==sum)
		{
			System.out.println(+num+"is palindrome");
		}
		else
		{
			System.out.println(+num+"is not palindrome");
		}
		

	}

}
