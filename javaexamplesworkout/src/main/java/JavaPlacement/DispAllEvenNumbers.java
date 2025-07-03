package JavaPlacement;

public class DispAllEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=50;
		for(int i=2;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println("   ");
				System.out.println("The number"+i+"is even");
				
				
			}
			
			else 
			{
				System.out.println("     ");
				System.out.println("The number"+i+"is not even");
			}
		}

	}

}
