package JavaPlacement;

public class MultiplicationTableGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int mul;
		System.out.println("The multiplication table of"+num+"is");
		for(int i=1;i<=12;i++)
		{
			mul=num*i;
			System.out.println(i+"*"+num+"="+mul);
		}
		
		

	}

}
