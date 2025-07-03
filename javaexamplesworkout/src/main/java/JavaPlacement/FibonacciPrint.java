package JavaPlacement;

public class FibonacciPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=1;
		int nextnum=1;
		
		System.out.print(firstnum+","+secondnum+",");
		for(int i=1;i<=10;i++)
		{
		
		//1+1=2,
		firstnum=secondnum;
		secondnum=nextnum;//2
		nextnum=secondnum+firstnum;
		
		//nextnum=i;
		
		System.out.print(nextnum+",");
		
		

	}

	}
}
//0,1,1,2,3,5,8,13,21
//0+1=1;1+1=2;2+1=3;3+2=5;5+3=8;8+5=13